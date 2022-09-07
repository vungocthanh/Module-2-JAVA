import java.util.Scanner;

class FindComonDivisor{
   public static void main(String[] args) {
      int a , b ;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number a: ");
      a = sc.nextInt();
      System.out.print("Enter number b: ");
      b = sc.nextInt();

     a = Math.abs(a);
     b = Math.abs(b);

     while(a != b){
      if ( a > b){
         a = a - b;
      }else{
         b = b - a;
      }
     }
     System.out.print("UCLN: " + a);
   }
}