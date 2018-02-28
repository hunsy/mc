package com.hunsy.metadata.entity;

import java.util.Date;
import javax.persistence.*;

/**
 * 固资信息
 *
 * @author lzw
 */
@Table(name = "gz_info")
public class GzInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String statisticId;

    /**
     * 固资编号 按类型时间数量生成
     */
    @Column(name = "gz_no")
    private String gzNo;

    /**
     * 资产名称
     */
    private String name;

    private Integer type;

    /**
     * 附加信息
     */
    private String remark;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

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


    public String getStatisticId() {
        return statisticId;
    }

    public void setStatisticId(String statisticId) {
        this.statisticId = statisticId;
    }

    /**
     * 获取固资编号 按类型时间数量生成
     *
     * @return gz_no - 固资编号 按类型时间数量生成
     */
    public String getGzNo() {
        return gzNo;
    }

    /**
     * 设置固资编号 按类型时间数量生成
     *
     * @param gzNo 固资编号 按类型时间数量生成
     */
    public void setGzNo(String gzNo) {
        this.gzNo = gzNo;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取附加信息
     *
     * @return remark - 附加信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置附加信息
     *
     * @param remark 附加信息
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
}