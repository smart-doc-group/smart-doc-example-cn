package com.power.doc.model;

import lombok.Data;

/**
 * Job replica class
 *
 * @author linwumingshi
 */
@Data
public class JobReplicaSpec {

    /**
     * Number of replicas.
     *
     * @mock 1
     */
    private Integer replicas;

}