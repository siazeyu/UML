package com.book.controller;


import com.book.entity.SysUserRole;
import com.book.service.impl.SysUserRoleServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户和角色关联表 前端控制器
 * </p>
 *
 * @author Siaze
 * @since 2022-06-12
 */
@RestController
@RequestMapping("/sys-user-role")
public class SysUserRoleController {

    SysUserRoleServiceImpl sysUserRoleService;

    public List<SysUserRole> getUserRoles(){
        return sysUserRoleService.list();
    }

    public SysUserRole getUserRole(SysUserRole sysUserRole){
        return sysUserRoleService.getById(sysUserRole);
    }

    public boolean addUserRole(SysUserRole sysUserRole){
        return sysUserRoleService.save(sysUserRole);
    }

    public boolean removeUserRole(SysUserRole sysUserRole){
        return sysUserRoleService.removeById(sysUserRole);
    }

}
