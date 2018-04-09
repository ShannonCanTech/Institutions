package com.company;

public class Courses {
    private String courseName;
    private String courseNumber;
    private String roomNumber;
    private String institution;

    public String courseInfo(){
        return /*"Institution: "  + getInstitution() + '\n' +*/
                "Course Name: " + getCourseName() + '\n' +
                "Course Number: " + getCourseNumber() + '\n' +
                "Room Number: " + getRoomNumber() + '\n';
    }

    public Courses() {
    }

    public Courses(String courseName, String courseNumber, String roomNumber, String institution) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.roomNumber = roomNumber;
        this.institution = institution;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}
