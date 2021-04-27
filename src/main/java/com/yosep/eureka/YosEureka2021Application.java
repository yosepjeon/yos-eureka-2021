package com.yosep.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

@EnableEurekaServer
@SpringBootApplication
public class YosEureka2021Application {

	public static void main(String[] args) {

		SpringApplication.run(YosEureka2021Application.class, args);
	}

}
