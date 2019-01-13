package com.nf.lc.controller;

import com.nf.lc.entity.Admin;
import com.nf.lc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/admin" , method = RequestMethod.GET , produces = "application/json;charset=utf-8")
    public List<Admin> selectAll(){
        return adminService.selectAll();
    }




}
