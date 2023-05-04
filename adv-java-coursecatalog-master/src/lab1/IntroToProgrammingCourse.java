package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 * Represents all Intro to Programming Courses, inherits practically everything from Courses Superclass
 *
 * @author Jack Wright
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Courses {



    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }


    public String toString() {
        return String.format("Course Name: %s\nCourse Number: %s\nCredits: %f\n", courseName, courseNumber, credits);
    }


}
