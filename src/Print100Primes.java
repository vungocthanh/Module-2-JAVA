import java.util.Scanner;

public class Print100Primes {
   public static void main(String[] args) {
      int number;
      boolean check = true;
      Scanner sc = new Scanner(System.in);
      

      for ( int i = 2 ; i <= 100 ; i++ ){
         System.out.print("Enter number: ");
         number =sc.nextInt();

         for (int j = 2 ; j <= number - 1 ; j++){
            if ( number % j == 0){
               System.out.println(number + " is not a Primes");
               break;
            }else{
               System.out.println(number + " is a Primes");
               break;
            }
         }
         
      }


   }
}
