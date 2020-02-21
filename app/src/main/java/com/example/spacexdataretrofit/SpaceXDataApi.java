package com.example.spacexdataretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SpaceXDataApi {

    @GET("v2/launches")
    Call<List<DataRepository>> getDataRepository();


}