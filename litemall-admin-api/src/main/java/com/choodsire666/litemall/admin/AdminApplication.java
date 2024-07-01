package com.choodsire666.litemall.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 谢金成
 * @date 2024/7/1 23:52
 */
@SpringBootApplication(scanBasePackages = {"com.choodsire666.litemall.db", "com.choodsire666.litemall.core," +
        "com.choodsire666.litemall.admin"})
@MapperScan("com.choodsire666.litemall.db.dao")
@EnableTransactionManagement
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
