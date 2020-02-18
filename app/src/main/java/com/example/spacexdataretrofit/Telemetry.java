package com.example.spacexdataretrofit;

import com.google.gson.annotations.SerializedName;

public class Telemetry {

    @SerializedName("flight_Club")
    private String flightClub = null;

    public String getFlightClub() {
        return flightClub;
    }

}

