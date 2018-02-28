package com.hunsy.metadata.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hunsy.commons.constants.GzType;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import java.util.Date;

/**
 * 固资统计信息
 *
 * @author lzw
 */
@Table(name = "gz_statistic")
public class GzStatistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 资产名称
     */
    private String name;

    /**
     * 数量
     */
    private Integer quantity = 0;

    /**
     * 固资类型
     */

    private Integer type;

    /**
     * 固资类型名称
     */
    @Transient
    private String typeName;

    /**
     * 新增事件
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "created_at")
    private Date createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updated_at")
    private Date updatedAt;

    private Boolean valid = true;

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
     * 获取资产名称
     *
     * @return name - 资产名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资产名称
     *
     * @param name 资产名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取数量
     *
     * @return quantity - 数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置数量
     *
     * @param quantity 数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取固资类型
     *
     * @return type - 固资类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置固资类型
     *
     * @param type 固资类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取新增事件
     *
     * @return created_at - 新增事件
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置新增事件
     *
     * @param createdAt 新增事件
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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

    public String getTypeName() {
        return GzType.findByType(type).getName();
    }
}