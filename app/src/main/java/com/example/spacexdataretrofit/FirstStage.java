package com.example.spacexdataretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirstStage {

    @SerializedName("core_serial")
    @Expose
    private String coreSerial;
    @SerializedName("flight")
    @Expose
    private Integer flight;
    @SerializedName("block")
    @Expose
    private String block;
    @SerializedName("gridfins")
    @Expose
    private boolean gridfins;
    @SerializedName("legs")
    @Expose
    private boolean legs;
    @SerializedName("reused")
    @Expose
    private boolean reused;
    @SerializedName("land_success")
    @Expose
    private boolean landSuccess;
    @SerializedName("landing_intent")
    @Expose
    private boolean landingIntent;
    @SerializedName("landing_type")
    @Expose
    private String landingType ;
    @SerializedName("landing_vehicle")
    @Expose
    private String landingVehicle;

    public String getCoreSerial() {
        return coreSerial;
    }

    public Integer getFlight() {
        return flight;
    }

    public String getBlock() {
        return block;
    }

    public boolean isGridfins() {
        return gridfins;
    }

    public boolean isLegs() {
        return legs;
    }

    public boolean isReused() {
        return reused;
    }

    public boolean isLandSuccess() {
        return landSuccess;
    }

    public boolean isLandingIntent() {
        return landingIntent;
    }

    public String getLandingType() {
        return landingType;
    }

    public String getLandingVehicle() {
        return landingVehicle;
    }
}
