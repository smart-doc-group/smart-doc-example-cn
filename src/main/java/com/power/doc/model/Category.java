package com.power.doc.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * Table:
 * @author yu on 2018/06/27.
 */
public class Category implements Serializable {

    private static final long serialVersionUID = -7911717088528114102L;

   	private Long id;
	private String code;
	private String name;

	/** getters and setters */
   	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


    @Override
    public String toString() {
        return "Category{" + 
                "id =" + id +
                ",code ='" + code + '\'' +
                ",name ='" + name + '\'' +
                '}';
    }
}