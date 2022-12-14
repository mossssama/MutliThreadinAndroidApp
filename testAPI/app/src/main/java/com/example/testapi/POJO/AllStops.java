package com.example.testapi.POJO;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllStops implements Serializable {

    @SerializedName("allNodes")
    @Expose
    private ArrayList<Station> allStops = null;
    private final static long serialVersionUID = 1161932026732553997L;

    public ArrayList<Station> getAllStops() {return allStops;}
    public void setAllStops(ArrayList<Station> allStops) { this.allStops = allStops; }

}
