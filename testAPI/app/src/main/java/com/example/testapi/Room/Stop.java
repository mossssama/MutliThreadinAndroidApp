package com.example.testapi.Room;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import org.jetbrains.annotations.NotNull;

@Entity(tableName = "Stop")
public class Stop {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private Double latitude;

    public Stop(String name, Double latitude) {  this.name = name;  this.latitude = latitude; }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Double getLatitude() {return latitude;}
    public void setLatitude(Double latitude) {this.latitude = latitude;}
}
