package com.blog.entity;

import java.io.Serializable;

/**
 * (TbUserType)实体类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:05
 */
public class TbUserType implements Serializable {
    private static final long serialVersionUID = -75267281693021365L;
    /**
     * id
     */
    private Integer id;
    /**
     * 用户类型
     */
    private String typeName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}