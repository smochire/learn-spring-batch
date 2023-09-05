package net.heriniaina.learnspringbatch;

import org.junit.jupiter.api.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BatchConfigurationTest {

    @Autowired
    private Job job;
    @Autowired
    private JobLauncher jobLauncher;

    @Test
    void importCSV() {
        try {
            JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
            System.out.println("Batch job started with status: " + jobExecution.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during batch job execution: " + e.getMessage());
        }
    }

}