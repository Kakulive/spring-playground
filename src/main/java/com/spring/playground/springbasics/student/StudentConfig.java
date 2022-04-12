package com.spring.playground.springbasics.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student janusz = new Student(
                    "Janusz",
                    "janusz.kowalski@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21
            );
            Student bjorn = new Student(
                    "Bjorn",
                    "bjorn@gmail.com",
                    LocalDate.of(2004, Month.MAY, 13),
                    21
            );
            repository.saveAll(List.of(janusz, bjorn));
        };
    }
}
