package com.example.novel.controller;

import com.example.novel.service.AdminService;
import com.example.novel.service.ReaderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController  //返回值如果是json则需要添加@RequestBody注解，@RestController = @Controller + @RequestBody
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @Resource
    private ReaderService readerService;

    @PostMapping("/login")
    public Boolean login(@RequestBody Map map){
        String name = (String)map.get("name");
        String password = (String)map.get("password");
        int value = Integer.parseInt(map.get("value").toString());
        System.out.println(name);
        System.out.println(value);
        //管理员登录
        if(name != null && password != null && value == 0){
            return password.equals(adminService.findPwd(name));
        }

        //读者登录
        if(name != null && password != null && value == 1){
            return password.equals(readerService.findPwd(name));
        }
        return false;
    }
}
