package com.shailesh.mak.springmongodbjwt;

import com.shailesh.mak.springmongodbjwt.models.AppUser;
import com.shailesh.mak.springmongodbjwt.models.Employee;
import com.shailesh.mak.springmongodbjwt.repositories.AppUserRepository;
import com.shailesh.mak.springmongodbjwt.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringMongodbJwtApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private AppUserRepository appUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.deleteAll();
		employeeRepository.save(new Employee("Sam", "Mak", "USA", "CCB"));
		employeeRepository.save(new Employee("John", "Doe", "INDIA", "LOC"));
		employeeRepository.save(new Employee("Lily", "Yeap", "UK", "CCB"));
		employeeRepository.save(new Employee("Song", "HU", "AUS", "LOC"));
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
