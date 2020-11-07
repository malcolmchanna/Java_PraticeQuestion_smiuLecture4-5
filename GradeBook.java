import java.util.Scanner;

public class GradeBook {

    private String  courseName;
    //consturtor
    public GradeBook( String name ){
        courseName = name;
    }
    public void setCourseName(String name){
        courseName =name;
    }
    public  String getCourseName(){
        return courseName;
    }
     public  void displayMsg(){
         System.out.println("Welcom to our course" + getCourseName());
     }

     //Determine class averge based on 10 grades entered by user
     public void determineClassAverage(){
         Scanner input = new Scanner(System.in);
         int total , gradeCounter , grade, average ;
         //intialize phase
         total = 0;
         gradeCounter = 1;

         while(gradeCounter <= 10){
             System.out.print("ENTER grade: ");
             grade = input.nextInt();
             total = total + grade ;
             gradeCounter = gradeCounter+1;
         }//end while
          //terminate phase
         average = total/10;
         System.out.println("Total of all grades is: " +  total);
         System.out.println("Class average: " + average );
     }//end method determine

    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook("CS101 Introduction to Java Programming");
        gradeBook.displayMsg();
        gradeBook.determineClassAverage();
    }

}
