package com.example.novel.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReaderMapper {

    String findPwdByName(String username);
}
