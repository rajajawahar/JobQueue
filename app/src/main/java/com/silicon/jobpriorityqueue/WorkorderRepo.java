package com.silicon.jobpriorityqueue;


import com.silicon.jobpriorityqueue.dto.WorkOrder;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by raja on 07/04/16.
 */
public interface WorkorderRepo {

    @GET("workorders")
    Call<List<WorkOrder>> getListOfWorkOrders();


}
