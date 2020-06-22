package com.power.doc.model.circular;


/**
 * @author yu 2020/6/16.
 */
public interface DocNode {

    DocNamedNodeMap getAttributes();

    DocNode getParentNode();

    DocDocument getOwnerDocument();
}
