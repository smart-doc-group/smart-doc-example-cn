package com.power.doc.model;

import com.power.doc.enums.Sex;
import com.power.doc.enums.SimpleEnum;
import lombok.Data;

import java.util.Map;

/**
 * NestingEnumMap Class
 *
 * @author linwumingshi
 */
@Data
public class NestingEnumMap {


    /**
     * test map
     */
    private Map<Sex, Map<SimpleEnum, JobReplicaSpec>> testMap;
}
