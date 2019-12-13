
package com.spring.project.spring;

/**
 *
 * @author manuel
 */

import com.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserAccessData {

    private static final Logger log = LoggerFactory.getLogger(UserApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {
           
            repository.save(new User("Jack", "Bauer@something.com"));
            repository.save(new User("Chloe", "O'Brian@something.com"));
            repository.save(new User("Kim", "Bauer@something.com"));
            repository.save(new User("David", "Palmer@something.com"));
            repository.save(new User("Michelle", "Dessler@something.com"));

           
            log.info("Users found with findAll():");
            log.info("-------------------------------");
            for (User user : repository.findAll()) {
                log.info(user.toString());
            }
            log.info("");

           
            User user = repository.findById(1L);
            log.info("User found with findById(1L):");
            log.info("--------------------------------");
            log.info(user.toString());
            log.info("");

           
            log.info("User found with findByName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            log.info("");
        };
    }
}

