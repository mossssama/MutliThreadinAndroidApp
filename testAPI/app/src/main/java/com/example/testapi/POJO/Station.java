package com.example.testapi.POJO;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Station implements Serializable {

    @SerializedName("latitude")
    @Expose
    private double latitude;

    @SerializedName("name")
    @Expose
    private String name;

    private final static long serialVersionUID = -1291378804893186818L;

    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getStationName() {
        return name;
    }
    public void setStationName(String name) {
        this.name = name;
    }

}
