package com.example.testapi.POJO;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Longtude implements Serializable {

    @SerializedName("low")
    @Expose
    private long low;

    @SerializedName("high")
    @Expose
    private long high;

    private final static long serialVersionUID = -6343685095836786124L;

    public long getLow() {
        return low;
    }
    public void setLow(long low) {
        this.low = low;
    }

    public long getHigh() {
        return high;
    }
    public void setHigh(long high) {
        this.high = high;
    }

}
