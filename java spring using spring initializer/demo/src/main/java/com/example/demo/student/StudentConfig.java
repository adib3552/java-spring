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
    CommandLineRunner commandLineRunner(StudentJpaRepository repository){
        return args -> {
           Student thiccEmon =new Student(
                   "Thicc emon",
                   "thiccness@gmail.com",
                   LocalDate.of(2000, Month.JANUARY,10)

           );

            Student BhondoRafi =new Student(
                    "Bhondo Rafi",
                    "Bhondo@gmail.com",
                    LocalDate.of(1990, Month.JANUARY,10)

            );

            //repository.saveAll(List.of(thiccEmon,BhondoRafi));

        };
    }
}
