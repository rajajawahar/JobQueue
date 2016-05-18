package com.silicon.jobpriorityqueue;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.path.android.jobqueue.JobManager;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submit(View v) {
        JobManager jobManager = JobPriorityQueue.getInstance().getJobManager();
        jobManager.addJobInBackground(new WorkOrdersJob(this));
    }

}
