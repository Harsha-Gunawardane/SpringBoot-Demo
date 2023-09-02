package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student harsha = new Student(
                    "Harsha",
                    "mrgunawardane@gmail.com",
                    LocalDate.of(1999, Month.FEBRUARY, 3)
            );

            Student chathura = new Student(
                    "Chathura",
                    "mrgunawardane99@gmail.com",
                    LocalDate.of(1999, Month.FEBRUARY, 3)
            );
            repository.saveAll(
                    List.of(harsha, chathura)
            );
        };
    }
}
