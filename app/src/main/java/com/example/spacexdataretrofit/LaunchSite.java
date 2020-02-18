package com.example.spacexdataretrofit;

import com.google.gson.annotations.SerializedName;

public class LaunchSite {

    @SerializedName("site_id")
    private String siteId;
    @SerializedName("site_name")
    private String siteName;
    @SerializedName("site_name_log")
    private String siteNameLong;
    @SerializedName("launch_success")
    private boolean launchSuccess;

    public boolean isLaunchSuccess() {
        return launchSuccess;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getSiteNameLong() {
        return siteNameLong;
    }
}
