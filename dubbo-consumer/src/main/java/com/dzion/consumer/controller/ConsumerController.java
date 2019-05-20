package com.dzion.consumer.controller;

import com.dzion.common.R;
import com.dzion.common.domain.User;
import com.dzion.consumer.service.DubboConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConsumerController
 * @Author Rao Shiqi
 * @Date 2019/5/17 14:36
 * @Description TODO
 */
@RestController
public class ConsumerController {

    private final DubboConsumerService dubboConsumerService;

    public ConsumerController(DubboConsumerService dubboConsumerService) {
        this.dubboConsumerService = dubboConsumerService;
    }

    @GetMapping("/user")
    public R<User> getUserInfo() {
        return R.ok(dubboConsumerService.getUser());
    }
}
