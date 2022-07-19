package com.autoflex.tms;

import com.autoflex.tms.entities.Bug;
import com.autoflex.tms.entities.Status;
import com.autoflex.tms.repos.BugRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsApplication.class, args);
    }

    @Bean
    CommandLineRunner init(BugRepository bugRepository){
        return args -> {
            Bug firstB = new Bug("smell code", true, true, "pzdc", "777");

            bugRepository.save(firstB);


            List<Bug> bugs = bugRepository.findByStatusAndUrgent(Status.NEW, true);
        };
    }

}
