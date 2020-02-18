package com.example.spacexdataretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reuse {

    @SerializedName("reuse")
    @Expose
    public LaunchSite launchSite;

    @SerializedName("core")
    private boolean core;
    @SerializedName("side_core1")
    private boolean sideCore1;
    @SerializedName("side_core2")
    private boolean sideCore2;
    @SerializedName("fairings")
    private boolean fairings;
    @SerializedName("capsule")
    private boolean capsule;

    public boolean isCore() {
        return core;
    }

    public boolean isSideCore1() {
        return sideCore1;
    }

    public boolean isSideCore2() {
        return sideCore2;
    }

    public boolean isFairings() {
        return fairings;
    }

    public boolean isCapsule() {
        return capsule;
    }
}
