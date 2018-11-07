package com.sourcecodeinc.newsapp;

public class News {
    private String webUrl;
    private String webTitle;
    private String sectionName;
    private String sectionId;

    public News(String webUrl, String webTitle, String sectionName) {
        this.webUrl = webUrl;
        this.webTitle = webTitle;
        this.sectionName = sectionName;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public String getSectionName() {
        return sectionName;
    }


}
