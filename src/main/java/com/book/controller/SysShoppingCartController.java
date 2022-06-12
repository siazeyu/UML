package com.book.controller;


import com.book.entity.SysShoppingCart;
import com.book.service.impl.SysShoppingCartServiceImpl;
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
@RequestMapping("/sys-shopping-cart")
public class SysShoppingCartController {

    public SysShoppingCartServiceImpl sysShoppingCartService;


    public List<SysShoppingCart> getSysShoppingCarts(){
        return sysShoppingCartService.list();
    }

    public SysShoppingCart getSysShoppingCart(SysShoppingCart shoppingCart){
        return sysShoppingCartService.getById(shoppingCart);
    }


    public boolean addSysShoppingCar(SysShoppingCart shoppingCart){
     return sysShoppingCartService.save(shoppingCart);
    }

    public boolean removeSysShoppingCar(SysShoppingCart shoppingCart){
        return sysShoppingCartService.removeById(shoppingCart);
    }

    public boolean updateShoppingCar(SysShoppingCart shoppingCart){
        return sysShoppingCartService.updateById(shoppingCart);
    }


}
