package com.example.guiaudia;

public class TouristicAttraction {
    private String mName;
    private Integer mImageId;
    private String mAddress;
    private String mLatitude;
    private String mLongitude;

    public static final String NO_ADDRESS = "No address just maps! Click above";

    public TouristicAttraction(String name, Integer imageId, String address) {
        this.mName = name;
        this.mImageId = imageId;
        this.mAddress = address;
    }

    public TouristicAttraction(String name, Integer imageId, String latitude, String longitude) {
        this.mName = name;
        this.mImageId = imageId;
        this.mLatitude = latitude;
        this.mLongitude = longitude;
    }

    public String getmName() {
        return mName;
    }

    public Integer getmImageId() {
        return mImageId;
    }

    public String getmAddress() {
        if (mAddress != null) {
            return mAddress;
        }
        return NO_ADDRESS;
    }

    public String getmLatitude() {
        return mLatitude;
    }

    public String getmLongitude() {
        return mLongitude;
    }

    @Override
    public String toString() {
        return "TouristicAttraction{" +
                "mName='" + mName + '\'' +
                ", mImageId=" + mImageId +
                ", mAddress='" + mAddress + '\'' +
                ", mLatitude='" + mLatitude + '\'' +
                ", mLongitude='" + mLongitude + '\'' +
                '}';
    }
}
