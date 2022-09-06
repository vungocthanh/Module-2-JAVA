import java.util.Scanner;

public class CheckLeepYear {
    public static void main(String[] args) {
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        year = sc.nextInt();
        if (year >= 100 ) {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + "Is a Leep Year");
            } else if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " Is not Leep Year");
            } else if (year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + "Is a lee[ Year");
            }
        }else{
            System.out.println("Enter a Year bigger 100");
        }
    }
}
