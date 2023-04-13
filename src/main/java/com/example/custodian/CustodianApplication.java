package com.example.custodian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CustodianApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustodianApplication.class, args);
	}

}
