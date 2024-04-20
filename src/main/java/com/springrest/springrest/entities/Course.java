package com.springrest.springrest.entities;

public class Course {
    private int id;

    public Course(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
}
