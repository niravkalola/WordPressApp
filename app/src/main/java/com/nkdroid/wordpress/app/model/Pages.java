package com.nkdroid.wordpress.app.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by nirav on 08/04/16.
 */
public class Pages {

    @SerializedName("pages")
    public ArrayList<PageContent> pageContentArrayList;

}
