package com.ecs.exauto;

import com.ecs.exauto.InputOutput.EReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExautoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExautoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello Athar run method called ");

        EReader.excelReader();

    }
}
