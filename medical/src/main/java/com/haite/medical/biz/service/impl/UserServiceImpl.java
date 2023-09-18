package com.haite.medical.biz.service.impl;

import com.haite.medical.api.Enum.LoginEnum;
import com.haite.medical.api.R.R;
import com.haite.medical.api.dto.UserDto;
import com.haite.medical.biz.mapper.UserMapper;
import com.haite.medical.biz.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public R Login(UserDto userDto) {
        String password = userMapper.getPassword(userDto.getUsername());
        if(password!=null && password!="" && userDto.getPassword().equals(password)){
            return R.ok(LoginEnum.LOGIN.getStatus(),"登陆成功");
        }else{
            return R.failed(LoginEnum.UNLOGIN.getStatus(),"登陆失败");
        }
    }
}
