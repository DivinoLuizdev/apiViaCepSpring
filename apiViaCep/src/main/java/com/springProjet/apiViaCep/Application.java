package com.springProjet.apiViaCep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * projeto Spring
 * usando seguintes dependecias
 * -Spring data Jpa
 * -Spring web
 * -H2 Database
 * -OpenFeign
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
