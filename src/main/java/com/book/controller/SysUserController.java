package com.book.controller;


import com.book.entity.SysUser;
import com.book.service.impl.SysUserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author Siaze
 * @since 2022-06-12
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController {

    SysUserServiceImpl sysUserService;

    /**
     * 用户登录
     * @param user 登录参数
     * @return 是否登录成功
     */
    public boolean login(SysUser user){
        SysUser byId = sysUserService.getById(user.getUserId());
        if (byId != null && byId.getUserId().equals(user.getUserId())){
            return true;
        }
        return false;
    }

    /**
     * 通过Id查询用户
     * @param sysUser
     * @return
     */
    public SysUser getUserById(SysUser sysUser){
        return sysUserService.getById(sysUser);
    }

    /**
     * 获取全部用户
     * @return 全部用户
     */
    public List<SysUser> getAllUser(){
        return sysUserService.list();
    }

    /**
     * 用户更改信息
     * @param sysUser 用户
     * @return 是否修改成功
     */
    public boolean updateUserBySelf(SysUser sysUser){
        sysUser.setDelFlag(null);
        sysUser.setStatus(null);
        return sysUserService.updateById(sysUser);
    }

    /**
     * 管理员修改信息
     * @param sysUser
     * @return
     */
    public boolean updateUserByAdmin(SysUser sysUser){
        return sysUserService.updateById(sysUser);
    }



    /**
     * 注册
     * @param sysUser 用户
     * @return 是否注册成功
     */
    public boolean resigns(SysUser sysUser){
        return sysUserService.save(sysUser);
    }

    /**
     * 删除用户
     * @param sysUser
     * @return
     */
    public boolean deleteUser(SysUser sysUser){
        return sysUserService.removeById(sysUser);
    }

    /**
     * 批量删除
     * @param list
     * @return
     */
    public boolean deleteUsers(List<SysUser> list){
        return sysUserService.removeByIds(list);
    }
}
