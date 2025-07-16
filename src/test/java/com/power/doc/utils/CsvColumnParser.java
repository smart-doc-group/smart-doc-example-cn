package com.power.doc.utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CsvColumnParser {

    public static List<String> parseRawCsvColumn(
            String csvFile,
            int startRow,
            Object targetColumn,
            boolean header
    ) throws IOException {
        List<String> results = new ArrayList<>();

        try (CSVParser parser = CSVParser.parse(new File(csvFile), StandardCharsets.UTF_8, CSVFormat.DEFAULT)) {
            // 确定列索引
            int colIndex = resolveColumnIndex(parser, targetColumn, header);

            // 计算需要跳过的数据行数
            int skipLines = calculateSkipLines(startRow, header);

            // 遍历CSV记录
            int processedLines = 0;
            for (CSVRecord record : parser) {
                // 跳过header行
                if (header && record.getRecordNumber() == 1) continue;

                // 应用行数跳过逻辑
                if (processedLines++ < skipLines) continue;

                // 提取目标列数据
                processRecord(record, colIndex, results);
            }
        }
        return results;
    }

    private static int resolveColumnIndex(CSVParser parser, Object targetColumn, boolean header) throws IOException {
        if (header) {
            CSVRecord headerRecord = parser.iterator().next(); // 获取header行
            if (targetColumn instanceof String) {
                String target = (String) targetColumn;
                for (int i = 0; i < headerRecord.size(); i++) {
                    if (target.equals(headerRecord.get(i))) return i;
                }
                throw new IllegalArgumentException("Column '" + target + "' not found in header");
            }
        }
        if (targetColumn instanceof Integer) {
            int index = (Integer) targetColumn;
            if (index < 0) throw new IllegalArgumentException("Column index cannot be negative");
            return index;
        }
        throw new IllegalArgumentException("Invalid target column type");
    }

    private static int calculateSkipLines(int startRow, boolean header) {
        // 转换起始行到数据行偏移量
        return Math.max(0, startRow - (header ? 2 : 1));
    }

    private static void processRecord(CSVRecord record, int colIndex, List<String> results) {
        try {
            String value = record.get(colIndex).trim();
            results.add(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Line " + record.getRecordNumber() + ": Column index " + colIndex + " out of bounds");
        }
    }

//    public static void main(String[] args) throws IOException {
//        // 示例用法
//        List<String> data = parseRawCsvColumn(
//                "src/test/resources/log.csv",
//                2,          // 从第二行数据开始
//                "日志消息",    // 目标列标题
//                true        // 包含header
//        );
//        System.out.println("提取结果: " + data);
//    }
}
