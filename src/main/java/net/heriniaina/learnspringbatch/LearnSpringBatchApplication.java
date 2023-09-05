package net.heriniaina.learnspringbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class LearnSpringBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringBatchApplication.class, args);
    }


}
