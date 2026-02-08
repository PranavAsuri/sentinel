package com.sentinel;

import org.springframework.boot.SpringApplication;

public class TestSentinelApplication {

	public static void main(String[] args) {
		SpringApplication.from(SentinelApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
