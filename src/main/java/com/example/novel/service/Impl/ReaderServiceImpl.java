package com.example.novel.service.Impl;

import com.example.novel.mapper.ReaderMapper;
import com.example.novel.service.ReaderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ReaderServiceImpl implements ReaderService {

    @Resource
    private ReaderMapper readerMapper;

    public String findPwd(String username){
        return readerMapper.findPwdByName(username);
    }
}
