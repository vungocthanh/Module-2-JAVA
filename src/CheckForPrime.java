import java.util.Scanner;

public class CheckForPrime {
    public static void main(String[] args) {
        int number;
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        number = sc.nextInt();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
               check = true;
               break;
            } else if (number % i != 0) {
               check = false;
            }
        }
        if ( check == true){
            System.out.println("a  not Prime");
        }else if ( check == false){
            System.out.println("a Prime");
        }
    }
}
