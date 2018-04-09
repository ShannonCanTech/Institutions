package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean done = false;
        String answer;
        String institution;
        Scanner keyboard = new Scanner(System.in);
        //WARNING: Setting 'Courses info = new Courses();' here to getInstitution will cause the program to reset the user's input value to the last thing they inputted. You can declare a new object of Courses by giving it a new object name different for what is declared in the do..while loop, assigning it to setInstititions, and outputting the value below outside of the loop. However, creating a String and setting its value to nextLine() is less code =) - SF

        System.out.println("Enter your school name and course information below.");

        //ArrayList for courses entered.
        ArrayList<Courses> courses = new ArrayList<>();

        //Enter the name of your institution. Only one institution name is needed for this assignment.
        System.out.print("What is the name of your institution? ");
        /*info.setInstitution(keyboard.nextLine());*/
        institution = keyboard.nextLine();

        //Collecting course information from user.
        do {
            Courses info = new Courses();
            System.out.print("Enter course name: ");
            info.setCourseName(keyboard.nextLine());
            System.out.print("Enter course number: ");
            info.setCourseNumber(keyboard.nextLine());
            System.out.print("Enter room number: ");
            info.setRoomNumber(keyboard.nextLine());
            courses.add(info);

            System.out.print("Would you like to add any additional courses for your institution? ");
            answer = keyboard.nextLine();
            if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("No"))
                break;
            } while (!done);

        /*System.out.println("Institution: " + info.getInstitution());*/
        System.out.println("Institution: " + institution);
        for(Courses eachCourses: courses){
            System.out.print(eachCourses.courseInfo());
            System.out.print('\n');
        }
        /*done = true;*/
        }
}

