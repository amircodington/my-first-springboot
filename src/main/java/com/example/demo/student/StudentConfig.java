package com.example.demo.student;

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
            StudentRepository repository
    ){
        return args -> {
            Student amir = new Student (
                    "Amir",
                    "amircodington@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 12)
            );

            Student ali = new Student(
                    "Ali",
                    "ali@gmail.com",
                    LocalDate.of(1990, Month.AUGUST, 21)
            );

            repository.saveAll(
                    List.of(amir, ali)
            );
        };
    }
}
