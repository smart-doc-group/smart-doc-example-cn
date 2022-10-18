package com.power.doc.model.circular;

/**
 * @author yu3.sun on 2022/10/14
 */
public class SelfRef {
    private Long id;
    private String name;
    private SelfRef other;
}
