/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    private double gpa;

    // Constructor that calls the parent constructor (Human)
    public Student(String name, short age) {
        super(name, age);
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Getter for GPA
    public double getGpa() {
        return gpa;
    }

    @Override
    public String getAddress() {
        // Use the getter from the parent class if defined
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        // Use the setter from the parent class if defined
        super.setAddress(address);
    }

    @Override
    public String toString() {
        return "Student{name=" + getName() + ", age=" + getAge() + ", gpa=" + gpa + ", address=" + getAddress() + "}";
    }
}
