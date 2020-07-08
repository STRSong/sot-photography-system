package com.sot.photography.util;

import java.util.Date;

public class ImageUtil {
    private String name;
    private String path;
    private Date date;

    public ImageUtil() {
    }

    public ImageUtil(String path, Date date) {
        this.path = path;
        this.date = date;
    }

    public ImageUtil(String name, String path, Date date) {
        this.name = name;
        this.path = path;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Img{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", date=" + date +
                '}';
    }
}
