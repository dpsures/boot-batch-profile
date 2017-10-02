package org.learning.schedulers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RunBoot {

	public static void main(String[] args) {
		SpringApplication.run(RunBoot.class, args);
	}
}
