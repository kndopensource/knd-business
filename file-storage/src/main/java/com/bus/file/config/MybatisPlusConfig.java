package com.bus.file.config;

import com.kernel.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zlt
 * @date 2018/12/10
 */
@Configuration
@MapperScan({"com.bus.file.file.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {

}
