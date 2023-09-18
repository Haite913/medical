package com.haite.medical.api.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.haite.medical.api.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.ui.Model;

@Data
public class UserDto {

        /**
         * 用户名
         */
        private String username;

        /**
         * 密码
         */
        private String password;

}
