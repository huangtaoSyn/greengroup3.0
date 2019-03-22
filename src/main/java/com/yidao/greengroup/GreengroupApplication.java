package com.yidao.greengroup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.yidao.greengroup.dao")
public class GreengroupApplication {

	public static void main(String[] args) {

		SpringApplication.run(GreengroupApplication.class, args);
	}

}
