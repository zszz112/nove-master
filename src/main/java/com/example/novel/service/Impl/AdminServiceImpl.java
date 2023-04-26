package com.example.novel.service.Impl;

import com.example.novel.mapper.AdminMapper;
import com.example.novel.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    public String findPwd(String name){
        return adminMapper.findPwdByName(name);
    }

}
