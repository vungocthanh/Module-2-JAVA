import java.util.Scanner;

public class ReadNumberIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int numSpecial;
        int numMin;
        System.out.print("Enter a Number: ");
        number = sc.nextInt();
        
        numSpecial = number % 100;
    

        switch(number / 100){
            case 1:
                System.out.print("One hundred and ");
                break;
            case 2:
                System.out.print("Two hundred and ");
                break;
            case 3:
                System.out.print("Three hundred and ");
                break;
            case 4:
                System.out.print("Four hundred and ");
                break;
            case 5:
                System.out.print("Five hundred and ");
                break;
            case 6:
                System.out.print("Six hundred and ");
                break;
            case 7:
                System.out.print("Seven hundred and ");
                break;
            case 8:
                System.out.print("Eight hundred and ");
                break;
            case 9:
                System.out.print("Nine hundred and ");
                break;    
        }
        switch(numSpecial / 10){
            case 1:
                switch(numSpecial){
                    case 11:
                    // System.out.print("eleven");
                    break;
                }
                break;
            case 2:
                System.out.print("twenty");
                break;
            case 3:
                System.out.print("thirty");
                break;
            case 4:
                System.out.print("fourty");
                break;
            case 5:
                System.out.print("fifty");
                break;
            case 6:
                System.out.print("sixty");
                break;
            case 7:
                System.out.print("seventy");
                break;
            case 8:
                System.out.print("eighty");
                break;
            case 9:
                System.out.print("ninety");
                break;   
        }
        switch(number % 10){
            case 1:
                switch((number % 100)){
                    case 11:
                        System.out.print("eleven");
                        break;
                    default:
                    System.out.print(" one");
                    break;
                }
                break;
            case 2:
                switch((number % 100)){
                    case 12:
                        System.out.print("twelve");
                        break;
                    default:
                    System.out.print(" two");
                    break;
                }
                break;
            case 3:
                System.out.print(" three");
                break;
            case 4:
                System.out.print(" four");
                break;
            case 5:
                System.out.print(" five");
                break;
            case 6:
                System.out.print(" six");
                break;
            case 7:
                System.out.print(" seven");
                break;
            case 8:
                System.out.print(" eight");
                break;
            case 9:
                System.out.print(" nine");
                break;  
                
        }
    }
}
