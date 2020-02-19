package com.example.spacexdataretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LaunchSite {

    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("site_name")
    @Expose
    private String siteName;
    @SerializedName("site_name_log")
    @Expose
    private String siteNameLong;
    @SerializedName("launch_success")
    @Expose
    private boolean launchSuccess;

    public boolean isLaunchSuccess() {
        return launchSuccess;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getSiteName() { return siteName; }

    public String getSiteNameLong() {
        return siteNameLong;
    }
}
