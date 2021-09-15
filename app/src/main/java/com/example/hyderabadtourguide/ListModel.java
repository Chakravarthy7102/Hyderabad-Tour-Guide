package com.example.hyderabadtourguide;

import android.net.Uri;

public class ListModel {
    private int imageId;
    private String title;
    private String informationURL;
    private String description;



    public ListModel(int imageId, String title, String informationURL,String description) {
        this.imageId = imageId;
        this.title = title;
        this.informationURL=informationURL;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInformationURL() {
        return informationURL;
    }

    public void setInformationURL(String informationURL) {
        this.informationURL = informationURL;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
