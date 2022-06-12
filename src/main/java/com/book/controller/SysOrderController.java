package com.book.controller;


import com.book.entity.SysBook;
import com.book.entity.SysOrder;
import com.book.service.impl.SysOrderServiceImpl;
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
@RequestMapping("/sys-order")
public class SysOrderController {

    public SysBook sysBook;

    public SysOrderServiceImpl sysOrderService;

    public List<SysOrder> getOrder(){
        return sysOrderService.list();
    }

    public SysOrder getOrder(SysOrder sysOrder){
        return sysOrderService.getById(sysOrder);
    }

    public boolean buyBook(SysOrder sysOrder){
        return sysOrderService.save(sysOrder);
    }

    public boolean refundBook(SysOrder sysOrder){
        return sysOrderService.updateById(sysOrder);
    }

    public boolean complaintBook(SysOrder sysOrder){
        return sysOrderService.updateById(sysOrder);
    }

    public boolean acceptComplainBook(SysOrder sysOrder){
        return sysOrderService.updateById(sysOrder);
    }

    public boolean refuseComplainBook(SysOrder sysOrder){
        return sysOrderService.updateById(sysOrder);
    }

    public boolean adminComplainBook(SysOrder sysOrder){
        return sysOrderService.updateById(sysOrder);
    }

}
