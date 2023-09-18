package com.haite.medical.biz.controller;

import com.haite.medical.api.R.R;
import com.haite.medical.api.dto.UserDto;
import com.haite.medical.biz.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/user" )
public class UserController {

    private final UserService userService;

    @PostMapping("/login" )
    public R Login(@RequestBody UserDto userDto) {
        return userService.Login(userDto);
    }
}
