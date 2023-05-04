package lab1;

import javax.swing.*;

/**
 * Subclass of courses for Intro Java courses
 * contains override methods for prerequisites as IntroToProgramming does not have prerequisites.
 *
 * @author Jack Wright
 * @version 1.00
 */
public class IntroJavaCourse extends Courses {
    String prerequisites;


    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return String.format("Course Name: %s\nCourse Number: %s\nCredits: %f\nPrerequisites: %s\n", courseName, courseNumber, credits, prerequisites);
    }


}
