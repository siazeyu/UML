package com.book.controller;


import com.book.entity.SysRole;
import com.book.service.impl.SysRoleServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 角色信息表 前端控制器
 * </p>
 *
 * @author Siaze
 * @since 2022-06-12
 */
@RestController
@RequestMapping("/sys-role")
public class SysRoleController {

    SysRoleServiceImpl sysRoleService;

    public List<SysRole> getRoles(){
        return sysRoleService.list();
    }

    public List<SysRole> getSelfRoles(){
        return sysRoleService.list();
    }

    /**
     * 为用户添加权限
     * @param sysRole
     * @return
     */
    public boolean addUserRole(SysRole sysRole){
        return sysRoleService.save(sysRole);
    }

    /**
     * 移除用户权限
     * @param sysRole
     * @return
     */
    public boolean removeUserRole(SysRole sysRole){
        return sysRoleService.removeById(sysRole);
    }

}
