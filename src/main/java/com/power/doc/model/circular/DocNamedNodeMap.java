package com.power.doc.model.circular;

/**
 * @author yu 2020/6/16.
 */
public interface DocNamedNodeMap {

    DocNode getNamedItem(String name);

    DocNode getNamedItemNS(String namespaceURI);

}
