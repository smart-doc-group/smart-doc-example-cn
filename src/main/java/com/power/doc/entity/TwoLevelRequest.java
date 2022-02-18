package com.power.doc.entity;

/**
 * @author yu 2022/2/18.
 */
public class TwoLevelRequest extends MidRequest<Order>{
    @Override
    String getMethod() {
        return "method";
    }
}
