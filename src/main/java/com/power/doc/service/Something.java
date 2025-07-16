package com.power.doc.service;

public interface Something {
    default String processQuery(String param) {
        // Complex method with text block
        String query = """
           SELECT id, name, email 
           FROM users 
           WHERE name = '"" + param + ""' 
           AND active = true""";

        // Other processing logic
        return query.toUpperCase();
    }

    default String getBlockOfHtml() {
        String test = """
                select * from abc
                """;
        return test;
    }


}

