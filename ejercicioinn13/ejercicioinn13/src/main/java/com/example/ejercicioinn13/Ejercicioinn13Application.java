package com.example.ejercicioinn13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Ejercicioinn13Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicioinn13Application.class, args);
	}

}
