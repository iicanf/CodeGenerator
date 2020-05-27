package com.iicanf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 商户中心启动类
 * @author gs
 * @date 2018/03/13
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan("com.iicanf.*")
@MapperScan(basePackages = {"com.iicanf.dao.mapper"})
@EnableAsync
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).run(args);
    }
}
