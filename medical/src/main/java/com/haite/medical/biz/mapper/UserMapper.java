package com.haite.medical.biz.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    String getPassword(String username);

}
