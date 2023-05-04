package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 * Serves as the super class for all the classes to inherit from.
 * Holds methods and properties that are shared amongst all the subclasses.
 * @author Jack Wright
 * @version 1.00
 */
public abstract class Courses {

    String courseName;
    String courseNumber;
    double credits;

    public Courses(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }


    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
            this.credits = credits;
    }

    public String getPrerequisites() {
        return null;
    }

    public void setPrerequisites(String prerequisites) {
    }

    @Override
    public String toString() {
        return "no go away";
    }
}
