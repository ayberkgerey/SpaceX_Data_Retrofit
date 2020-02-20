package com.example.spacexdataretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataRepository {

    @SerializedName("flight_number")
    @Expose
    private Integer flightNumber;
    @SerializedName("mission_name")
    @Expose
    private String missionName;
    @SerializedName("upcoming")
    @Expose
    private boolean upcoming;
    @SerializedName("launch_year")
    @Expose
    private String launchYear;
    @SerializedName("launch_date_unix")
    @Expose
    private String launchDateUnix;
    @SerializedName("launch_date_utc")
    @Expose
    private String launchDateUTC;
    @SerializedName("launch_date_local")
    @Expose
    private String launchDateLocal;
    @SerializedName("is_tentative")
    @Expose
    private boolean isTentative;
    @SerializedName("tentative_max_precision")
    @Expose
    private String tentativeMaxPrecision;
    @SerializedName("tbd")
    @Expose
    private boolean tbd;
    @SerializedName("launch_window")
    @Expose
    private Integer launchWindow;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("static_fire_date_utc")
    @Expose
    private String staticFireDateUtc;
    @SerializedName("static_fire_date_unix")
    @Expose
    private String staticFireDateUnix;
    @SerializedName("crew")
    @Expose
    private boolean crew;


    public boolean isCrew() { return crew; }

    public String getDetails() { return details; }

    public String getStaticFireDateUtc() { return staticFireDateUtc; }

    public String getStaticFireDateUnix() { return staticFireDateUnix; }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public String getMissionName() {
        return missionName;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public String getLaunchYear() {
        return launchYear;
    }

    public String getLaunchDateUnix() {
        return launchDateUnix;
    }

    public String getLaunchDateUTC() {
        return launchDateUTC;
    }

    public String getLaunchDateLocal() {
        return launchDateLocal;
    }

    public boolean isTentative() {
        return isTentative;
    }

    public String getTentativeMaxPrecision() {
        return tentativeMaxPrecision;
    }

    public boolean isTbd() {
        return tbd;
    }

    public Integer getLaunchWindow() {
        return launchWindow;
    }
}