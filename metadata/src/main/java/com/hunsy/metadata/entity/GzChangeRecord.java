package com.hunsy.metadata.entity;

import java.util.Date;
import javax.persistence.*;

/**
 * 固资增减记录
 *
 * @author lzw
 */
@Table(name = "gz_change_record")
public class GzChangeRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String infoId;

    /**
     * 资产名称（冗余）
     */
    private String name;

    /**
     * 类型（冗余）
     */
    private String type;

    /**
     * 操作类型  0 消除 1 新增
     */
    @Column(name = "op_type")
    private Integer opType;

    @Column(name = "created_at")
    private Date createdAt;

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

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    /**
     * 获取资产名称（冗余）
     *
     * @return name - 资产名称（冗余）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资产名称（冗余）
     *
     * @param name 资产名称（冗余）
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取类型（冗余）
     *
     * @return type - 类型（冗余）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型（冗余）
     *
     * @param type 类型（冗余）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取操作类型  0 消除 1 新增
     *
     * @return op_type - 操作类型  0 消除 1 新增
     */
    public Integer getOpType() {
        return opType;
    }

    /**
     * 设置操作类型  0 消除 1 新增
     *
     * @param opType 操作类型  0 消除 1 新增
     */
    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}