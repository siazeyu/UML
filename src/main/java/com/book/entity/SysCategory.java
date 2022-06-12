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
@TableName("sys_category")
public class SysCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类别id
     */
    private Long id;

    /**
     * 类别名
     */
    private String name;

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

    @Override
    public String toString() {
        return "SysCategory{" +
            "id=" + id +
            ", name=" + name +
        "}";
    }
}
