package lab2;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author Jack Wright
 * @version 1.00
 */
public class IntroJavaCourse implements Courses {

    String courseName;
    String courseNumber;
    double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }
    @Override
    public String getCourseName() {
        return courseName;
    }
    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
@Override
    public String getCourseNumber() {
        return courseNumber;
    }
@Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
@Override
    public double getCredits() {
        return credits;
    }
@Override
    public void setCredits(double credits) {
        this.credits = credits;
    }
@Override
    public String getPrerequisites() {
        return prerequisites;
    }
@Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String toString() {
        return String.format("Course Name: %s\nCourse Number: %s\nCredits: %f\nPrerequisites: %s\n", courseName, courseNumber, credits, prerequisites);
    }

}
