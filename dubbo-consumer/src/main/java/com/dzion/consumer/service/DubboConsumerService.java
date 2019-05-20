package com.dzion.consumer.service;

import com.dzion.common.domain.User;
import com.dzion.common.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @ClassName DubboConsumerService
 * @Author Rao Shiqi
 * @Date 2019/5/17 14:34
 * @Description TODO
 */

@Service
public class DubboConsumerService {

    @Reference(version = "1.0.0")
    private UserService userService;

    public User getUser() {
        return userService.getUser();
    }

}
