package model;

public class College {
    private String collegeName;
    private String collegeLocation;
    private String collegeCource;
    private int collegePrice;
    private int imageID;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeLocation() {
        return collegeLocation;
    }

    public void setCollegeLocation(String collegeLocation) {
        this.collegeLocation = collegeLocation;
    }

    public String getCollegeCource() {
        return collegeCource;
    }

    public void setCollegeCource(String collegeCource) {
        this.collegeCource = collegeCource;
    }

    public int getCollegePrice() {
        return collegePrice;
    }

    public void setCollegePrice(int collegePrice) {
        this.collegePrice = collegePrice;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public College(String collegeName, String collegeLocation, String collegeCource, int collegePrice, int imageID) {
        this.collegeName = collegeName;
        this.collegeLocation = collegeLocation;
        this.collegeCource = collegeCource;
        this.collegePrice = collegePrice;
        this.imageID = imageID;
    }
}
