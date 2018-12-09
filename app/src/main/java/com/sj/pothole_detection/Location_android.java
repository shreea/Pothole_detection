package com.sj.pothole_detection;

public class Location_android {

    String pothole_id;
    String lati;
    String longi;
    public Location_android(){

    }

    public Location_android(String pothole_id,String longi,String lati) {
        this.longi = longi;
        this.lati = lati;
        this.pothole_id = pothole_id;
    }

    public String getPothole_id() {
        return pothole_id;
    }

    public String getLati() {
        return lati;
    }

    public String getLongi() {
        return longi;
    }
}
