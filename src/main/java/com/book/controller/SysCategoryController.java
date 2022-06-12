package com.book.controller;


import com.book.entity.SysBook;
import com.book.entity.SysCategory;
import com.book.service.impl.SysCategoryServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Siaze
 * @since 2022-06-12
 */
@RestController
@RequestMapping("/sys-category")
public class SysCategoryController {

    public SysBook sysBook;

    public SysCategoryServiceImpl sysCategoryService;

    public List<SysCategory> getSysCategorys(){
        return sysCategoryService.list();
    }

    public boolean addCategory(SysCategory sysCategory){
        return sysCategoryService.save(sysCategory);
    }

    public boolean removeCategory(SysCategory sysCategory){
        return sysCategoryService.removeById(sysCategory);
    }

}
