package com.dzion.consumer;

import com.dzion.common.CommonApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @ClassName DubboProviderApplication
 * @Author Rao Shiqi
 * @Date 2019/5/17 11:07
 * @Description TODO
 */
@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(CommonApplication.class, DubboConsumerApplication.class).run(args);
    }

}
