package com.sot.photography;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//使用MapperScan批量扫描所有的Mapper接口；
@MapperScan(value = "com.sot.photography.mapper")
@SpringBootApplication()
public class PhotographyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotographyApplication.class, args);
	}

}
