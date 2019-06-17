package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.springcloud.dao")
public class SpringCloudOdersProvider {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOdersProvider.class, args);

	}

}