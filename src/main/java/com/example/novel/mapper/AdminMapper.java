package com.example.novel.mapper;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface AdminMapper {

    String findPwdByName(String username);
}
