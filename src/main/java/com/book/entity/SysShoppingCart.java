package com.book.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Siaze
 * @since 2022-06-12
 */
@TableName("sys_shopping_cart")
public class SysShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 商品id
     */
    private Long bookId;

    /**
     * 数量
     */
    private Integer count;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "SysShoppingCart{" +
            "userId=" + userId +
            ", bookId=" + bookId +
            ", count=" + count +
        "}";
    }
}
