package com.example.myfbrealtime.datafiles;

public class RoadBlock {

    private String uid;
    private double latitude;
    private double longitude;
    private String roadBlockType;
    private String timeStamp;

    public static final String ROAD_BLOCK_TYPE_SCHOOL = "school";
    public static final String ROAD_BLOCK_TYPE_CAR_BIKE = "car_bike";
    public static final String ROAD_BLOCK_TYPE_TRAFFIC_JAM = "traffic_jam";

    public RoadBlock(){

    }

    public RoadBlock(double latitude, double longitude, String roadBlockType, String timeStamp){
        this.latitude = latitude;
        this.longitude = longitude;
        this.roadBlockType = roadBlockType;
        this.timeStamp = timeStamp;
    }


    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getRoadBlockType() {
        return roadBlockType;
    }

    public void setRoadBlockType(String roadBlockType) {
        this.roadBlockType = roadBlockType;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
