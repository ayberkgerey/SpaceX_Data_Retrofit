package com.example.spacexdataretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("mission_patch")
    @Expose
    private String missionPatch;
    @SerializedName("mission_patch_small")
    @Expose
    private String missionPatchSmall;
    @SerializedName("reddit_campaign")
    @Expose
    private String redditCampaign;
    @SerializedName("reddit_launch")
    @Expose
    private String redditLaunch;
    @SerializedName("reddit_recovery")
    @Expose
    private String redditRecovery;
    @SerializedName("reddit_media")
    @Expose
    private String redditMedia;
    @SerializedName("presskit")
    @Expose
    private String presskit;
    @SerializedName("article_link")
    @Expose
    private String articleLink;
    @SerializedName("wikipedia")
    @Expose
    private String wikipedia;
    @SerializedName("video_link")
    @Expose
    private String videoLink;
    @SerializedName("youtube_id")
    @Expose
    private String youtubeId;

    public String getMissionPatch() {
        return missionPatch;
    }

    public String getMissionPatchSmall() {
        return missionPatchSmall;
    }

    public String getRedditCampaign() {
        return redditCampaign;
    }

    public String getRedditLaunch() {
        return redditLaunch;
    }

    public String getRedditRecovery() { return redditRecovery; }

    public String getRedditMedia() {
        return redditMedia;
    }

    public String getPresskit() {
        return presskit;
    }

    public String getArticleLink() {
        return articleLink;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public String getYoutubeId() {
        return youtubeId;
    }
}
