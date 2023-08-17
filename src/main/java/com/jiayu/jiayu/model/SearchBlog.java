package com.jiayu.jiayu.model;

public class SearchBlog {
    private String searchString;

    public SearchBlog(String searchString) {
        this.searchString = searchString;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
