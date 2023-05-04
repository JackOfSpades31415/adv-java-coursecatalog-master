package lab2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {


        Courses intJav = new IntroJavaCourse("Introduction to Java", "1234");
        intJav.setCredits(2);
        intJav.setPrerequisites("Intro to Programming");

        Courses intPro = new IntroToProgrammingCourse("Introduction to Programming", "1010");
        intPro.setCredits(1);

        Courses advJav = new AdvancedJavaCourse("Advanced Java Programming", "1337");
        advJav.setCredits(3);
        advJav.setPrerequisites("Intro to Java");

        System.out.println(intPro);
        System.out.println(intJav);
        System.out.println(advJav);

        /**
         * This provides better security and allows the reference of multiple interfaces, it requires each subclass
         * to override the methods with their own versions, which would be helpful if methods were vastly different
         * from each other but feels like copy and pasting if it's the same thing, however I suppose if one were to
         * have the interface be referenced by the super class then divided into subclasses might help simplify it
         * a bit more, that's my thought process with this.
         */


    }

}
