package com.ashokIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ms06ConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms06ConfigServerAppApplication.class, args);
	}

}
