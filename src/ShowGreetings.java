import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Greetings;
        System.out.print("Enter your name: ");
        Greetings = sc.nextLine();
        System.out.println("Hello: " + Greetings);
    }
}
