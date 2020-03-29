package com.kernel.manager.user.config;

import com.kernel.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author knd
 * @date 2018/12/10
 */
@Configuration
@MapperScan({"com.kernel.manager.user.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {
}
