package com.jiayu.jiayu.model;
import java.util.List;
public class ProjectItem {
    private String id;
    private String decsription;
    private Number year;
    private String dataGroup;

    private String category;

    private List<String> pictures;

    public ProjectItem(String id, String decsription, Number year, String dataGroup, String category, List<String> pictures) {
        this.id = id;
        this.decsription = decsription;
        this.year = year;
        this.dataGroup = dataGroup;
        this.category = category;
        this.pictures = pictures;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }

    public Number getYear() {
        return year;
    }

    public void setYear(Number year) {
        this.year = year;
    }

    public String getDataGroup() {
        return dataGroup;
    }

    public void setDataGroup(String dataGroup) {
        this.dataGroup = dataGroup;
    }
}
