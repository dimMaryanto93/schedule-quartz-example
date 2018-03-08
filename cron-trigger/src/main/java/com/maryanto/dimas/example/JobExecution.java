package com.maryanto.dimas.example;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobExecution implements Job {

    private Integer counter = 0;

    private final Logger console = LoggerFactory.getLogger(JobExecution.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        console.info("job execution {}", this.counter++);
    }
}
