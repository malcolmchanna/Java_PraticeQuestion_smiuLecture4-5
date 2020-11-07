import java.util.Scanner;
public class calculator {
     public void calculatorInpt() {
         Scanner input = new Scanner(System.in);
         //VARIABLES
         int sum, sub , pow , div ;
         float cos1 ,cos2 , sin1 , sin2 , log1 , log2 ;
         int operator;
         int value1 ;
         int value2 ;

         System.out.println("For Add PRESS: 1\n" +
                 "For sub PRESS:2\n" +
                 "For pow PRESS: 3\n" +
                 "For divide PRESS: 4 \n" +
                 "For cos PRESS: 5\n" +
                 "For sin PRESS: 6\n" +
                 "For log PRESS: 7\n" +
                 "Exit Press: -1");
         System.out.println("------------");
         operator = input.nextInt();

         //While conditon For operators
         while (operator != -1 && operator < 9){
             System.out.println(" Enter Two value:");
             value1= input.nextInt();
             value2 = input.nextInt();

             if(operator == 1) {
                 sum = value1+ value2;
                 System.out.println("SUM: "+sum);
             }
             if (operator == 2){
                 sub = value1 - value2 ;
                 System.out.println("SUBTRACT: "+sub);
             }
             if (operator == 3){
                   pow = (int) Math.pow(value1,value2);
                 System.out.println("POWER: " + pow);
             }
             if (operator == 4){
                 div = value1/value2;
                 System.out.println("DIVIDE: " + div);
             }
             if (operator == 5){
                 cos1 = (float) Math.cos(value1);
                 cos2 = (float)Math.cos(value2);
                 System.out.printf("COS OF FIRST VALUE %f \nCOS of SECOND VALUE %f: \n",cos1,cos2);
             }
             if (operator == 6){
                 sin1 = (float) Math.sin(value1);
                 sin2 = (float)Math.sin(value2);
                 System.out.printf("COS OF FIRST VALUE %f \nCOS of SECOND VALUE %f: \n",sin1,sin2);
             }
             if (operator == 7){
                 log1 = (float) Math.log(value1);
                 log2 = (float)Math.log(value2);
                 System.out.printf("COS OF FIRST VALUE %f \nCOS of SECOND VALUE %f: \n",log1,log2);
             }
             System.out.println("---");
             System.out.println("Select as above Mentioned Number for operators to Continue otherwise Enter -1 for Exit");
             operator = input.nextInt();
             System.out.println("---");
         } //while


         //if operator equal to -1 or operator <5
         if (operator == -1){
             System.out.println("exit");
         }
         else {
            int zero= 0/ operator;
             System.out.println(""+ zero);
         }
     }//method end

    public static void main(String[] args) {
        calculator calculator =new calculator();
        calculator.calculatorInpt();
    }
}
