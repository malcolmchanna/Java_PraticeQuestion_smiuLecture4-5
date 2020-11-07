package com.company;
import java.util.Scanner;

public class WhiteBook {

    private  String courseName;
    private int total;   //sum of total grades
    private int gradeCounter;  // num of grades enter
    private int aCount;   // count A grades
    private int bCount;   // count B grades
    private int cCount;   // count C grades
    private int dCount;   // count D grades
    private int fCount; // count F grades
    // constructor
    public WhiteBook(String name){
        courseName = name;
    }
    public void setCourseName(String name){   //not imor setNAme here for use
        courseName = name;
    }
    public String getCourseName(){
        return courseName;
    }
    //display

    public void displayMsg(){
        System.out.print("Welcome to  Course:" + getCourseName());
    }
    //input arbitry number of grades from user

    public void inputGrades() {
         Scanner input = new Scanner(System.in);
         int grade;
         System.out.printf("\n%s\n", " For linux/mac Type <CTRL>Z // For window type  Ctrl D ");
         while (input.hasNext()) {
               grade = input.nextInt();
             total = total + grade;
             ++gradeCounter;
             incrementLetterCounter(grade) ;
         }//end while
     }

     public  void incrementLetterCounter( int grade){
          switch (grade/10){
              case 9:   // grade between 90
              case 10:  // 100
                  ++aCount; break;
              case 8:// grade between 80 89
                  ++bCount; break;
              case 7:// grade between 70 79
                  ++cCount; break;
              case 6:// grade between 60 69
                  ++dCount; break;
              default:
                  ++fCount; break;
          }//end switch
     }
     public void displayreportmsg(){
         System.out.println("GRADE REPORT");
         System.out.println("________________________");
    if (gradeCounter != 0 ){
        double average = (double) total/ gradeCounter;
        System.out.printf("Total of the %d gradesare  enter is: %d \n" ,gradeCounter ,total);
        System.out.printf("class average is  %.2f \n" , average) ;
        System.out.printf("%s \n %s%d\n %s%d\n %s%d\n %s%d\n%s%d\n",
                "Number of student who recevied  each grade",
                "A: " , aCount,
                "B: " , bCount,
                "C: " , cCount,
                "D: " , dCount,
                "F: " , fCount);
    }// if end
         else {
        System.out.println("no grade entered");
    }
    }
        public static void main(String[] args) {
            WhiteBook whiteBook = new WhiteBook("Java programing");

            whiteBook.displayMsg();
            whiteBook.inputGrades();
            whiteBook.displayreportmsg();

        }

}
