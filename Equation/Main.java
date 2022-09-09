package Equation;

import java.util.Scanner;

public class Main {
   
   public static void main(String[] args) {
      double a , b , c;
      Scanner sc = new Scanner(System.in);
   
            System.out.print("Enter a:");
               a = sc.nextDouble();
            System.out.print("Enter b:");
               b = sc.nextDouble();
            System.out.print("Enter c:");
               c = sc.nextDouble();
      QuadraticEquation quatione = new QuadraticEquation(a, b, c);
      if (quatione.getDiscriminant() > 0 ){
          System.out.println(quatione.getRoot1());
          System.out.println(quatione.getRoot2());
      }else if (quatione.getDiscriminant() == 0){
          System.out.println(quatione.getRoot2());
      }else {
          System.out.println("No root");
      }
   }
}   
