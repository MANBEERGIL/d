package com.lambton;

public class student extends person {
    public String gender;
    public String coursename;
    String collegename;
    int totalmarks;

    public student(int id, String name, String gender, String coursename, String collegename, int totalmarks) {
        super(id, name, gender);
        this.coursename = coursename;
        this.collegename = collegename;
        this.totalmarks = totalmarks;
    }

    public student(int id, String coursename, String collegename, int totalmarks) {
        super(id);
        this.coursename = coursename;
        this.collegename = collegename;
        this.totalmarks = totalmarks;
    }

    public student(String name, String coursename, String collegename, int totalmarks) {
        super(name);
        this.coursename = coursename;
        this.collegename = collegename;
        this.totalmarks = totalmarks;
    }

    public student(int id) {
        super(id);
    }

    public student(String name) {
        super(name);
    }


    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public int getTotalmarks() {
        return totalmarks;
    }

    public void setTotalmarks(int totalmarks) {
        this.totalmarks = totalmarks;
    }

    @Override
    public void display() {
        System.out.println("i am student");
    }
}
