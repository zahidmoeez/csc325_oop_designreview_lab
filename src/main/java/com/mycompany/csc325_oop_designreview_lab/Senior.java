package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private static final int MIN_CREDITS = 85;
    private int credits;

    // Constructor
    public Senior(String name, short age, int credits) {
        super(name, age);
        if (credits < MIN_CREDITS) {
            throw new IllegalArgumentException("A Senior must have at least " + MIN_CREDITS + " credits.");
        }
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Senior{name=" + getName() + ", age=" + getAge() + ", credits=" + credits + ", gpa=" + getGpa() + "}";
    }
}
