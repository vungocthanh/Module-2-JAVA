package Equation;

public class QuadraticEquation {
   private double a;
   private double b;
   private double c;
   
   public QuadraticEquation(double a,double b, double c){
      this.a = a;
      this.b = b;
      this.c = c;
   }
   //khoi tao a , b , c 
   public double getNumA(){
      return this.a;
   }
   public double getNumB(){
      return this.b;
   }
   public double getNumC(){
      return this.c;
   }
   // tinh delta
   public double getDiscriminant(){
      double delta = Math.pow(b,2) - 4 * a * c;
      return delta;
   }
   //tinh nghiem r1 va r2
   public double getRoot1(){
      double r = 0;
      if ( getDiscriminant() >= 0){
         r = (-b + Math.sqrt(Math.pow(b,2) - 4 * a *c))/2*a;
      }else{
         r = 0;
      }
      return r;
   }
   public double getRoot2(){
      double r1 = 0;
      if (getDiscriminant() >= 0){
         r1 =  (-b - Math.sqrt(Math.pow(b,2) - 4 * a *c))/2*a;
      }else{
         r1 = 0;
      }
      return r1;
   }
 
   

}
