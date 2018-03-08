package com.maryanto.dimas.example;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class MainApplication {

    private final static Logger console = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) throws SchedulerException {
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();

        JobDetail job = new JobDetail("job1", "group1", JobExecution.class);
        Date runTime = TriggerUtils.getEvenMinuteDate(new Date());

        console.info("next fired scheduler {}", runTime);
        SimpleTrigger trigger = new SimpleTrigger("trigger1", "group1", runTime);
        sched.scheduleJob(job, trigger);
        sched.start();
    }
}
