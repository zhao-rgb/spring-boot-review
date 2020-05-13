package com.soft1851.springboot.config;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootApplication.class, args);
        new SpringApplicationBuilder(SpringbootApplication.class)
                .bannerMode(Banner.Mode.CONSOLE).run(args);
    }

}
