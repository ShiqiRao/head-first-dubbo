package com.dzion.provider.service;

import com.dzion.common.domain.User;
import com.dzion.common.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @ClassName UserServiceImpl
 * @Author Rao Shiqi
 * @Date 2019/5/17 11:52
 * @Description TODO
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        return new User().name("Another One");
    }
}
