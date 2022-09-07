import java.util.Scanner;

public class Print20Prime {
   public static void main(String[] args) {
      int number;
      int n = 2;
      int count = 0;
      boolean check = true;

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      number = sc.nextInt();

      while( count < number){
         for( int i = 2 ; i <= n - 1 ; i++){
               if ( n % i == 0){
                  check = false;
                  break;
               }else if ( n % i != 0){
                  check = true;
               }
         }
         if(check == true){
            count++;
            System.out.print(n + " ");
         }
         n++;
      }
   }
}
