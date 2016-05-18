package com.silicon.jobpriorityqueue;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.path.android.jobqueue.Job;
import com.path.android.jobqueue.Params;
import com.silicon.jobpriorityqueue.dto.WorkOrder;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WorkOrdersJob extends Job {


    private Context context;

    protected WorkOrdersJob(Context context) {
        super(new Params(1).requireNetwork().persist());
//        this.context = context;
    }


    @Override
    public void onAdded() {

    }

    @Override
    public void onRun() throws Throwable {
        try {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient httpClient = new OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .addInterceptor(new RestApiInterceptor()).build();
            Retrofit retrofit = new Retrofit.Builder().client(httpClient)
                    .baseUrl("https://eam360-dev2.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create()).build();
            WorkorderRepo workorderRepo = retrofit.create(WorkorderRepo.class);
            List<WorkOrder> workOrderList = workorderRepo.getListOfWorkOrders().execute().body();
            Log.d("WorkOrder List", "onRun: " + workOrderList.size());
            Toast.makeText(context, "onRun: " + workOrderList.size(), Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onCancel() {

    }

    @Override
    protected boolean shouldReRunOnThrowable(Throwable throwable) {
        return false;
    }
}
