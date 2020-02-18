package com.example.spacexdataretrofit;

import com.google.gson.annotations.SerializedName;

public class Rocket {

    @SerializedName("rocket_id")
    private String rocketId;
    @SerializedName("rocket_name")
    private String rocketName;
    @SerializedName("rocket_type")
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
