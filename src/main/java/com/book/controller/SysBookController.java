package com.book.controller;


import com.book.entity.SysBook;
import com.book.service.impl.SysBookServiceImpl;
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
@RequestMapping("/sys-book")
public class SysBookController {

    SysBookServiceImpl sysBookService;

    public List<SysBook> getBooks(){
        return sysBookService.list();
    }

    public SysBook getBookById(SysBook sysBook){
        return sysBookService.getById(sysBook);
    }

    public boolean addBook(SysBook sysBook){
        return sysBookService.save(sysBook);
    }

    public boolean updateBook(SysBook sysBook){
        return sysBookService.updateById(sysBook);
    }

    public boolean deleteBook(SysBook sysBook){
        return sysBookService.removeById(sysBook);
    }


}
