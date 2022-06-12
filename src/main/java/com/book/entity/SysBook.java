package com.book.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Siaze
 * @since 2022-06-12
 */
@TableName("sys_book")
public class SysBook implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图书Id
     */
    private Long id;

    /**
     * 图书名
     */
    private String name;

    /**
     * 作者
     */
    private String author;

    /**
     * 类别Id
     */
    private Long categoryId;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 简介
     */
    private String introduce;

    /**
     * 图书展示图（list 、分割）
     */
    private String pictures;

    /**
     * 商品库存
     */
    private Integer count;

    /**
     * 所属者Id
     */
    private Long intendantId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    public Long getIntendantId() {
        return intendantId;
    }

    public void setIntendantId(Long intendantId) {
        this.intendantId = intendantId;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysBook{" +
            "id=" + id +
            ", name=" + name +
            ", author=" + author +
            ", categoryId=" + categoryId +
            ", price=" + price +
            ", introduce=" + introduce +
            ", pictures=" + pictures +
            ", count=" + count +
            ", intendantId=" + intendantId +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
