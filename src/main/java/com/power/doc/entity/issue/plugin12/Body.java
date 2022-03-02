package com.power.doc.entity.issue.plugin12;

import lombok.Data;

@Data
public class Body<T,R> {
    private Oee<T> oee;
    private R request;
    private R response;
}
