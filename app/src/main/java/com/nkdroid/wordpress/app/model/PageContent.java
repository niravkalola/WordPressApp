package com.nkdroid.wordpress.app.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nirav on 08/04/16.
 */
public class PageContent {

    @SerializedName("id")
    public int pageId;
    @SerializedName("title")
    public String pageName;
    @SerializedName("content")
    public  String pageContent;
}
