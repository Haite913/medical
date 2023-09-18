package com.haite.medical.biz.service;

import com.haite.medical.api.R.R;
import com.haite.medical.api.dto.UserDto;
import com.haite.medical.api.entity.User;


public interface UserService{
    R Login(UserDto userDto);
}
