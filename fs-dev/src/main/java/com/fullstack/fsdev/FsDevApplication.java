package com.fullstack.fsdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;


//Application start form here using run method and Passing by parameter  the .class and args
// write annotations and so that tells this is a staring point say this is spring application and configure from here.
@SpringBootApplication
@Configuration
public class FsDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsDevApplication.class, args);
	}

}
