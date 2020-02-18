package com.example.spacexdataretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repo {

    @SerializedName("rocket")
    @Expose
    public Rocket rocket;

}
