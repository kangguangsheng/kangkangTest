package com.springboot.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerTest implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(CommandLineRunnerTest.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------------Engine Start2!------------------------");
        work();
        System.out.println("------------------------ Enginr Stop2!------------------------");
    }

    private void work() {
        System.out.println("---------------------------Work2!-------------------------");
    }
}
