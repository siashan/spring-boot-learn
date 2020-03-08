package com.siashan.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringbootApplication.class, args);

        SpringApplication app = new SpringApplication(SpringbootApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
