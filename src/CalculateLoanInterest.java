import java.util.Scanner;

public class CalculateLoanInterest {
    public static void main(String[] args) {
        int month;
        double loanRate;
        int money;
        double loanSum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        month = sc.nextInt();
        System.out.print("Enter money: ");
        money = sc.nextInt();
        System.out.print("Enter loanRate: ");
        loanRate = sc.nextDouble();

        for ( int i = 0 ; i <= month ; i++){
            loanSum += money * (loanRate/100)/12 * month;
        }
        System.out.print("Total LoanMoney: " + loanSum);
    }
}
