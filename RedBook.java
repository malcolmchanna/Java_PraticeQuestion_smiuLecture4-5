package com.company;

import java.util.Scanner;

public class RedBook {
       private  String courseName;
       // constructor
      public RedBook(String name){
          courseName = name;
      }
      public void setCourseName(String name){   //not imor setNAme here for use
          courseName = name;
      }
      public String getCourseName(){
          return courseName;
      }
      public void displayMsg(){
          System.out.print("Welcome to the course: \n" + getCourseName());
      }
      //determine Average
       public void determineAverage(){
           Scanner input = new Scanner(System.in);
           int total, grade, gradeCounter;
           double average;
              //intiliaze phase
              total = 0;

              gradeCounter = 0;
           System.out.print("Enter grade -1 to quit: ");
           grade = input.nextInt();
           while ( grade != -1){
                 total = total + grade;
                 gradeCounter++;
                  // next grade again
               System.out.print("Enter grade -1 to quit: ");
               grade = input.nextInt();

           }
              if (grade != 0){
                  average = (double)total/gradeCounter;
                  System.out.print("total of the grades entered: \n" + total);
                  System.out.printf("classs average is %.2f\n: ", average);
              }
              else {
                  System.out.print("No grades entered");
              }

       }//end determine method

    public static void main(String[] args) {
        RedBook redBook = new RedBook("JAva Programmng");
        redBook.displayMsg();
        redBook.determineAverage();
    }



}
