package com.xxl.job.executor.job;

import com.xxl.job.core.handler.Job;
import com.xxl.job.core.handler.JobExecuteContext;
import org.springframework.stereotype.Component;

@Component
public class TestJob implements Job {

    @Override
    public void execute(JobExecuteContext context) {
        System.out.println(context);
    }
}
