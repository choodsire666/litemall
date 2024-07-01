package com.choodsire666.litemall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 谢金成
 * @date 2024/7/1 23:48
 */
@SpringBootApplication(scanBasePackages = {"com.choodsire666.litemall"})
@MapperScan("com.choodsire666.litemall.db.dao")
@EnableTransactionManagement
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
