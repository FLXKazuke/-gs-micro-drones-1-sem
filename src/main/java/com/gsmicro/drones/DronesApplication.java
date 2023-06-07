package com.gsmicro.drones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.gsmicro.drones.model")
@EnableJpaRepositories("com.gsmicro.drones.repository")
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class DronesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DronesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}
}
