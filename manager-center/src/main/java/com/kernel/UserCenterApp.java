package com.kernel;

import com.kernel.common.ribbon.annotation.EnableFeignInterceptor;
import com.kernel.search.annotation.EnableSearchClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 作者 knd
 */
@EnableDiscoveryClient
@EnableSearchClient
@EnableTransactionManagement
@EnableFeignInterceptor
@SpringBootApplication
public class UserCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterApp.class, args);
    }
}
