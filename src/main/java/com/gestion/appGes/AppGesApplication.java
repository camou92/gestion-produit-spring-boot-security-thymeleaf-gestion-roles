package com.gestion.appGes;

import com.gestion.appGes.security.services.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AppGesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGesApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	//@Bean
	CommandLineRunner commandLineRunner(AccountService accountService){
		return args -> {
			/*accountService.createUser("admin", "123", "admin@gmail.com", "123");
			accountService.createUser("cashier", "123", "cashier@gmail.com", "123");
			accountService.createUser("accountant", "123", "accountant@gmail.com", "123");*/

			/*accountService.createRole("ADMIN");
			accountService.createRole("CASHIER");
			accountService.createRole("USER");*/

			accountService.addRoletoUser("admin", "ADMIN");
			accountService.addRoletoUser("admin", "USER");
			accountService.addRoletoUser("cashier", "CASHIER");
			accountService.addRoletoUser("accountant", "USER");
		};
	}
}
