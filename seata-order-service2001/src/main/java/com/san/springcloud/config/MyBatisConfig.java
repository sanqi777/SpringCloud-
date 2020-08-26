package com.san.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 三七 on 2020/8/26.
 */
@Configuration
@MapperScan({"com.san.springcloud.dao"})
public class MyBatisConfig {
}
