package com.book.controller;


import com.book.entity.SysOperLog;
import com.book.service.impl.SysOperLogServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 操作日志记录 前端控制器
 * </p>
 *
 * @author Siaze
 * @since 2022-06-12
 */
@RestController
@RequestMapping("/sys-oper-log")
public class SysOperLogController {

    SysOperLogServiceImpl service;

    public List<SysOperLog> getLogs(){
        return service.list();
    }

    public void saveLog(SysOperLog sysOperLog){
        service.save(sysOperLog);
    }
}
