package com.book.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Siaze
 * @since 2022-06-12
 */
@TableName("sys_order")
public class SysOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单Id
     */
    private Long ordersId;

    /**
     * 订单名
     */
    private String orderName;

    /**
     * 商品Id
     */
    private Long goodsId;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 快递单号
     */

    private String courierNumber;


    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 订单状态（0用户付款1商家发货2订单完成3用户退款4完成退款5申诉状态6用户取消
     */
    private Integer status;

    public Long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Long ordersId) {
        this.ordersId = ordersId;
    }
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
    public Long getUserId() {
        return userId;
    }

    public String getCourierNumber() {
        return courierNumber;
    }

    public void setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SysOrder{" +
            "ordersId=" + ordersId +
            ", orderName=" + orderName +
            ", goodsId=" + goodsId +
            ", userId=" + userId +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", status=" + status +
        "}";
    }
}
