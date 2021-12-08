package com.example.guiaudia;

public class TouristicAttraction {
    private String mName;
    private Integer mImageId;
    private String mAddress;

    public TouristicAttraction(String name, Integer imageId, String address) {
        this.mName = name;
        this.mImageId = imageId;
        this.mAddress = address;
    }

    public String getmName() {
        return mName;
    }

    public Integer getmImageId() {
        return mImageId;
    }

    public String getmAddress() {
        return mAddress;
    }

    @Override
    public String toString() {
        return "TouristicAttraction{" +
                "mName='" + mName + '\'' +
                ", mImageId=" + mImageId +
                ", mAddress='" + mAddress + '\'' +
                '}';
    }
}
