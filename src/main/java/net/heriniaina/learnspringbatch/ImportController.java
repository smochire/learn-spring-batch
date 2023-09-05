package net.heriniaina.learnspringbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImportController {

    private final Job job;
    private final JobLauncher jobLauncher;

    @Autowired
    public ImportController(Job job, JobLauncher jobLauncher) {
        this.job = job;
        this.jobLauncher = jobLauncher;
    }

    @GetMapping("/importCSV")
    public String importCSV() {
        try {
            JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
            return "Batch job started with status: " + jobExecution.getStatus();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error during batch job execution: " + e.getMessage();
        }
    }
}
