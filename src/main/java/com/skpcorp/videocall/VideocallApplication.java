package com.skpcorp.videocall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.skpcorp.videocall.user.User;
import com.skpcorp.videocall.user.UserService;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Sikapa")
							.email("skpcorp@mail.com")
							.password("aaa")
					.build());

			service.register(User.builder()
					.username("Kamdem")
					.email("yamen@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Dajou")
					.email("dajou@mail.com")
					.password("aaa")
					.build());
		};
	}
}
