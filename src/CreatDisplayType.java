import java.util.Scanner;

class CreatDisplayType{
   public static void main(String[] args) {
      System.out.println("1.Print the Ractangle:");
      System.out.println("2.Print the square triangle");
      System.out.println("3.Print isosceles triangle");
      System.out.println("4.Exit");

      Scanner sc = new Scanner(System.in);

      System.out.print("Choise Optione: ");
      int choice = sc.nextInt();

      switch(choice){
         case 1:
            for (int i = 0 ; i < 3 ; i++){
               for ( int j = 0 ; j < 7 ; j++){
                  System.out.print("*");
               }
               System.out.println();
            }
            break;
         case 2:
            for ( int i = 1 ; i < 6 ; i++){
               for ( int j = 0 ; j < i ; j++ ){
                  System.out.print("*");
               }
               System.out.println();
            }   
        case 3:
            for ( int i = 6 ; i > 0 ; i--){
               for ( int j = 0 ; j < i ; j++){
                  System.out.print("*");
               }
               System.out.println();
            }
         case 4:
            for ( int i = 1 ; i <= 7 ; i++){
               for ( int j = 7 ; j >= i ; j--){
                     System.out.print(" ");
                  }
                  for ( int j = 1 ; j <=i ; j++){
                     System.out.print("* ");
                  }
               System.out.println();
            }
      }


   }

}