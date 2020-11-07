import java.util.Scanner;

public class Analiyis {
    public static void main(String[] args) {

     Scanner input= new Scanner(System.in);
     int pass, fail, counter, result;
     pass = 0;
     fail = 0;
     counter = 1;
     while (counter <=10){
         System.out.print("Enter Result  \t1) For Pass and 2) for Fail:  ");
         result = input.nextInt();
         if (result == 1){
            pass++;
         }
         else {
             fail++;
         }
         counter++;

     }//end whilele
        System.out.println("Passed" +" "+ pass +" "+ "failed" +" "+ fail);

     if (pass > 8){
         System.out.println("bous to instructor");
     }

    }

}// class

