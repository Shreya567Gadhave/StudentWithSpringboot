package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.Student")
@ComponentScan({"com.dao","com.controller","com.service","com.student","com.model"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")
public class SpringStudentAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentAngularApplication.class, args);
		System.out.println("It's Working");
	}

}
