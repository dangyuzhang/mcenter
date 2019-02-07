package cn.cnjava.mcenter.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.cnjava")
public class MCenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MCenterWebApplication.class, args);
    }

}

