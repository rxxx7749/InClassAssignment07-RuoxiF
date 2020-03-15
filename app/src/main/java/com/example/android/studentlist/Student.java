package com.example.android.studentlist;

import java.io.Serializable;

public class Student implements Serializable {
    //declare the global variables
    private String studentName;
    private double grade;
    private boolean fullTime;
    private String moreInfo;

    /**
     * Constructor with instance variable studentName, grade, fullTime and moreInfo
     */
    public Student(String studentName, double grade, boolean fullTime) {
        this.studentName = studentName;
        this.grade = grade;
        this.fullTime = fullTime;
    }

    /**
     * Method to set value for variable studentName
     *
     * @param studentName
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * Method to set value for variable grade
     *
     * @param grade
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * Method to set value for variable fullTime
     *
     * @param fullTime
     */
    public void setGrade(boolean fullTime) {
        this.fullTime = fullTime;
    }

    /**
     * Method to get value of variable studentName
     *
     * @return studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Method to get value of variable grade
     *
     * @return grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Method to get value of variable fullTime
     *
     * @return fullTime
     */
    public boolean getFullTime() {
        return fullTime;
    }

    @Override
    public String toString() {

        String str = "Student Name: " + this.studentName + "\n" + "Student Grade: " + this.grade
                + "\n Is he(she) a full_time student? " + this.fullTime +"\n\n\n";
        return str;
    }

}
