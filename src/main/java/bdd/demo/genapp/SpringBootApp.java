package bdd.demo.genapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {
    // Ignore main from code coverage
    @lombok.Generated
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }
}
