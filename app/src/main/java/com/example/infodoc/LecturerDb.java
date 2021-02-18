package com.example.infodoc;

public  class LecturerDb{
    private String ImageUrl;
    private String LecturerDetails;
    private String LecturerName;

    public LecturerDb(String imageUrl, String lecturerDetails, String lecturerName) {
        ImageUrl = imageUrl;
        LecturerDetails = lecturerDetails;
        LecturerName = lecturerName;
    }

    public LecturerDb() {
    }


    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getLecturerDetails() {
        return LecturerDetails;
    }

    public void setLecturerDetails(String lecturerDetails) {
        LecturerDetails = lecturerDetails;
    }

    public String getLecturerName() {
        return LecturerName;
    }

    public void setLecturerName(String lecturerName) {
        LecturerName = lecturerName;
    }
}
