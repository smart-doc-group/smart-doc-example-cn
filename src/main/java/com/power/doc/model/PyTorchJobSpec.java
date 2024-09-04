package com.power.doc.model;

import com.power.doc.enums.PyTorchReplicaType;
import lombok.Data;

import java.util.Map;

/**
 * pytorch job spec
 *
 * @author linwumingshi
 */
@Data
public class PyTorchJobSpec {

    /**
     * Configuration for PyTorch task replicas.
     */
    private Map<PyTorchReplicaType, JobReplicaSpec> pytorchReplicaSpecs;


}



