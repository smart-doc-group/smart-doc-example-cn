package com.power.doc.utils;

import java.util.StringTokenizer;

public class ConvertString {


    public static void main(String[] args) {
        String str = "java.lang.List";
        // 正则表达式匹配包名
        String regex = "\\b\\w+\\.(?=\\w+\\b)";
        // 使用空字符串替换包名
        String result = str.replaceAll(regex, "");
        System.out.println(result);
    }

    public static String convertString(String str) {
        int first = str.indexOf("<");
        int last = str.lastIndexOf(">");
        if (first == -1 || last == -1) {
            return str;
        } else {
            String start = str.substring(0, first);
            String end = str.substring(last+1);
            String middle = str.substring(first+1, last);
            return start+"<"+processMiddle(middle)+">"+end;
        }
    }

    // 处理<>内的字符串
    private static String processMiddle(String middle) {
        if (middle.contains("<")) {
            StringBuilder sb = new StringBuilder();
            String[] parts = middle.split(",");
            for (String part : parts) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(convertString(part));
            }
            return sb.toString();
        }
        else {
            return removePackage(middle);
        }
    }

    // 去除包名
    private static String removePackage(String str) {
        if (str.contains(".")) {
            return str.substring(str.lastIndexOf(".")+1);
        }
        else {
            return str;
        }
    }
}
