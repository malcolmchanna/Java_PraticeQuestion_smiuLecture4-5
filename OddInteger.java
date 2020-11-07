package com.company;

public class OddInteger {
    public static void main(String[] args) {
        int  count= 1 ;
        int  product = 1;

        for (count =2 ; count <=15 ; count+= 2){
            product= count*product;
            System.out.println(""+ count);
        }
        System.out.println("product: "+ product);

    }




}
