import java.sql.SQLOutput;
import java.util.Scanner;

public class CaculateDayOnMonth {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Day on month: ");
        month = sc.nextInt();

        switch (month) {
            case 2:
                System.out.println("The month" + month +" have 28 or 29 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month " + month + " hava 31 day");
                break;
            case 4:
            case 6:
            case 11:
                System.out.println("The month" + month + "have 30 day");
                break;
            default:

                System.out.println("Please Enter Month less 12 ");
        }
    }
}
