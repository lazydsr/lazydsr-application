package com.lazydsr.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LazydsrManager {

	public static void main(String[] args) {
		//SpringApplication.run(LazydsrManager.class, args);
		SpringApplication springApplication = new SpringApplication(LazydsrManager.class);
		//禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
	}
}
