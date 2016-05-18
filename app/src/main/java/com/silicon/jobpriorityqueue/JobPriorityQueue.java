package com.silicon.jobpriorityqueue;

import android.app.Application;

import com.path.android.jobqueue.JobManager;
import com.path.android.jobqueue.config.Configuration;

public class JobPriorityQueue extends Application {

    private JobManager jobManager;
    private static JobPriorityQueue jobPriorityQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        jobManager = new JobManager(this, new Configuration.Builder(this).build());
        jobPriorityQueue = this;
    }


    public JobManager getJobManager() {
        return jobManager;
    }

    public static JobPriorityQueue getInstance() {
        return jobPriorityQueue;

    }
}
