package lab1;

import javax.swing.*;

/**
 * Subclass of courses for Advanced Java courses
 * contains override methods for prerequisites as IntroToProgramming does not have prerequisites.
 *
 * @author Jack Wright
 * @version 1.00
 */
public class AdvancedJavaCourse extends Courses{
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
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

    public String toString() {
        return String.format("Course Name: %s\nCourse Number: %s\nCredits: %f\nPrerequisites: %s\n", courseName, courseNumber, credits, prerequisites);
    }


}
