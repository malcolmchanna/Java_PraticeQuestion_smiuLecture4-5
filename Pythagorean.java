public class Pythagorean {

    public void calculatePythagorean() {

          // triplet: a^2 + b^2 = c^2
           int a , b , c = 0;
           int m = 2;  //loop start from 2
           int limit = 500;

        System.out.println("Program that calculates Pythagorean triples (until 500).");
        // Limiting c would limit
        // all a, b and c
        while (c <= limit ){
               for (int n = 1; n <m ; ++n ){
                   // Evaluate and print triplets using the relation between  a, b and c
                   a = m*m - n*n;
                   b = 2 * m * n;
                   c = m * m + n * n;
                   if (c >limit)
                       break;
                       System.out.println(a + " " + b + " " + c);

               }//end for
            m++;
        }// end while
    }//end main


    public static void main(String args[]) {
       Pythagorean pythagorean = new Pythagorean();
       pythagorean.calculatePythagorean();
    }
}


//
//
//    int side_A;
//    int side_B;
//    int side_C;
//
//
//        for (side_A = 1; side_A <= 500; side_A++) {
//        for (side_B = 1; side_B <= 500; side_B++) {
//            for (side_C = 1; side_C <= 500; side_C++) {
//                //if
//                if (Math.pow(side_A, 2) + Math.pow(side_B, 2) == Math.pow(side_C, 2) && side_C <= 500){
//                    System.out.printf(" %d + %d = %d: \n", side_A ,side_B , side_C );
//                }
//            }// third for loop end
//        }// secend for loop end
//    }//first for loop
//
//}//main end