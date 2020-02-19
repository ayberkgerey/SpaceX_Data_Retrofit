package com.example.spacexdataretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rocket {

    @SerializedName("rocket_id")
    @Expose
    private String rocketId;
    @SerializedName("rocket_name")
    @Expose
    private String rocketName;
    @SerializedName("rocket_type")
    @Expose
    private String rocketType;


    public String getRocketId() {
        return rocketId;
    }

    public String getRocketName() {
        return rocketName;
    }

    public String getRocketType() {
        return rocketType;
    }
}
