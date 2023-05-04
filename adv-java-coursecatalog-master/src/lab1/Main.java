package lab1;

import java.util.ArrayList;
import java.util.List;

public class Main {
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
         * While security is a bit more vulnerable without using interfaces just having super and subclasses
         * really makes this a lot more efficient to code with for me, pages are less messy and look nicer to look at.
         */


    }

}
