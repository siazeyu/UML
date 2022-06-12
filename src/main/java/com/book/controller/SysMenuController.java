package com.book.controller;


import com.book.entity.SysMenu;
import com.book.service.impl.SysMenuServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 菜单权限表 前端控制器
 * </p>
 *
 * @author Siaze
 * @since 2022-06-12
 */
@RestController
@RequestMapping("/sys-menu")
public class SysMenuController {

    public SysMenuServiceImpl sysMenuService;

    public java.util.List<SysMenu> getMenus(){
        return sysMenuService.list();
    }

    public boolean addUserMean(SysMenu sysMenu){
        return sysMenuService.save(sysMenu);
    }

    public boolean removeUserMean(SysMenu sysMenu){
        return sysMenuService.removeById(sysMenu);
    }
}
