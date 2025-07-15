package com.power.doc;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.power.doc.utils.CsvColumnParser;
import com.power.doc.utils.JacksonUtilTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {

    /**
     * 双关键字 JSON 提取函数
     *
     * @apiNote
     * @param stringList 原始字符串列表
     * @param strictMode 严格模式中错误会终止解析
     * @return 包含 request/response 的字典列表和错误信息列表
     */
    public static Map<String, List<Map<String, String>>> parseRawJsonStrings(
            List<String> stringList, boolean strictMode) {
        // 定义返回结果
        List<Map<String, String>> success = new ArrayList<>();
        List<Map<String, String>> errors = new ArrayList<>();

        // 定义固定关键字
        final String REQ_KEYWORD = "req:";
        final String RESP_KEYWORD = "response:";
        final String USER_KEYWORD = "user:";
        final int REQ_KEYWORD_LEN = REQ_KEYWORD.length();
        final int RESP_KEYWORD_LEN = RESP_KEYWORD.length();
        final int USER_KEYWORD_LEN = USER_KEYWORD.length();

        for (int lineNum = 0; lineNum < stringList.size(); lineNum++) {
            String text = stringList.get(lineNum);
            if (text == null || text.trim().isEmpty()) {
                Map<String, String> error = new HashMap<>();
                error.put("line", String.valueOf(lineNum + 1));
                error.put("error", "空字符串");
                error.put("raw", text);
                errors.add(error);
                continue;
            }

            try {
                // 第一阶段：定位关键字
                int reqPos = text.indexOf(REQ_KEYWORD);
                int respPos = text.indexOf(RESP_KEYWORD);
                int userPos = text.indexOf(USER_KEYWORD);

                // 验证关键字是否存在
                if (reqPos == -1 || respPos == -1) {
                    throw new IllegalArgumentException(
                            (reqPos == -1 ? "缺少必要关键字 '" + REQ_KEYWORD + "'" : "") +
                                    (respPos == -1 ? "缺少必要关键字 '" + RESP_KEYWORD + "'" : "")
                    );
                }

                // 验证关键字顺序
                if (reqPos >= respPos) {
                    throw new IllegalArgumentException("'" + REQ_KEYWORD + "' 必须出现在 '" + RESP_KEYWORD + "' 之前");
                }

                if (userPos != -1 && userPos <= respPos) {
                    throw new IllegalArgumentException("'" + USER_KEYWORD + "' 必须位于 '" + RESP_KEYWORD + "' 之后");
                }

                // 第二阶段：内容分割
                String reqContent = text.substring(reqPos + REQ_KEYWORD_LEN, respPos).trim();
                String respContent = userPos != -1
                        ? text.substring(respPos + RESP_KEYWORD_LEN, userPos).trim()
                        : text.substring(respPos + RESP_KEYWORD_LEN).trim();
                String userContent = userPos != -1
                        ? text.substring(userPos + USER_KEYWORD_LEN).trim()
                        : null;

                // 构造成功解析结果
                Map<String, String> result = new HashMap<>();
                result.put("request", reqContent);
                result.put("response", respContent);
                if (userContent != null) {
                    result.put("user", userContent);
                }
                success.add(result);

            } catch (IllegalArgumentException e) {
                Map<String, String> error = new HashMap<>();
                error.put("line", String.valueOf(lineNum + 1));
                error.put("error", e.getMessage());
                error.put("raw", text);

                if (strictMode) {
                    throw new RuntimeException("行 " + (lineNum + 1) + " 严重错误 -> " + e.getMessage(), e);
                }
                errors.add(error);

            } catch (Exception e) {
                Map<String, String> error = new HashMap<>();
                error.put("line", String.valueOf(lineNum + 1));
                error.put("error", "系统级错误: " + e.getMessage());
                error.put("raw", text);

                if (strictMode) {
                    throw new RuntimeException("行 " + (lineNum + 1) + " 致命错误", e);
                }
                errors.add(error);
            }
        }

        // 构造返回结果
        Map<String, List<Map<String, String>>> result = new HashMap<>();
        result.put("success", success);
        result.put("errors", errors);

        return result;
    }
    public static void main(String[] args)  throws Exception{
        List<String> data = CsvColumnParser.parseRawCsvColumn(
                "src/test/resources/log.csv",
                2,          // 从第二行数据开始
                "日志消息",    // 目标列标题
                true        // 包含header
        );



        JSONArray array = new JSONArray();
        Map<String, List<Map<String, String>>> result = parseRawJsonStrings(data, true);
        for (Map<String, String> map : result.get("success")) {
            String request = map.get("request");

            JSONObject json = new JSONObject();

            JSONObject requestJson = JSON.parseObject(request);
            JSONArray messeges = requestJson.getJSONArray("messages");
            for (int i = 0; i < messeges.size(); i++) {
                JSONObject messege = messeges.getJSONObject(i);
                if (messege.getString("role").equals("user")) {
                    json.put("input", messege.getString("content"));
                }
            }
            String response = map.get("response");
            JSONObject responseJson = JSON.parseObject(response);
            JSONArray choices = responseJson.getJSONArray("choices");
            for (int i = 0; i < choices.size(); i++) {
                JSONObject choice = choices.getJSONObject(i);
                if (choice.containsKey("message")) {
                    JSONObject message = choice.getJSONObject("message");
                    json.put("output", message.getString("content"));
                }
            }
            array.add(json);

        }
        System.out.println(JSONArray.toJSONString(array));

    }
}
