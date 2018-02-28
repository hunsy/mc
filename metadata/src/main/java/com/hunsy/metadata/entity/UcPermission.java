package com.hunsy.metadata.entity;

import javax.persistence.*;

/**
 * @author lzw
 */
@Table(name = "uc_permission")
public class UcPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    /**
     * 1 菜单  2 连接  3 按钮
     */
    private Integer type;

    private String path;

    private Boolean valid;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取1 菜单  2 连接  3 按钮
     *
     * @return type - 1 菜单  2 连接  3 按钮
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1 菜单  2 连接  3 按钮
     *
     * @param type 1 菜单  2 连接  3 按钮
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return valid
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * @param valid
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}