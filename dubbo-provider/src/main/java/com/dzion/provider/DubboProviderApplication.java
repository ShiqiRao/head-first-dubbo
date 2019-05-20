package com.dzion.provider;

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
public class DubboProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(CommonApplication.class, DubboProviderApplication.class).run(args);
    }

}
