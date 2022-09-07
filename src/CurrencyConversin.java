import java.util.Scanner;

public class CurrencyConversin {
    public static void main(String[] args){
        int rate = 23000;
        int usd , vnd;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter usd to vnd: ");
        usd = sc.nextInt();

        vnd = usd * rate;

        System.out.print("value vnd:" + vnd);
    }
}
