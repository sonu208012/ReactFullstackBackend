package com.example.react;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties

public class ReactFullStackAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactFullStackAppApplication.class, args);
	}

}
