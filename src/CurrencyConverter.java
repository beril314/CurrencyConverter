import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one from the following actions");
        System.out.println("type '0' for GBP to USD");
        System.out.println("type '1' for GBP to EUR");
        System.out.println("type '2' for EUR to USD");
        System.out.println("type '3' for EUR to GBP");
        System.out.println("type '4' for USD to GBP");
        System.out.println("type '5' for USD to EUR");

        int choice = scanner.nextInt();
        System.out.println("Enter the amount you would like to convert:");
        int inputAmount = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("£" +inputAmount + " = " +"$" +inputAmount *1.31);
                break;
            case 1:
                System.out.println("£" +inputAmount + " = " +"€" +inputAmount *1.19);
                break;
            case 2:
                System.out.println("€" +inputAmount + " = " +"$" +inputAmount *1.10);
                break;
            case 3:
                System.out.println("€" +inputAmount + " = " +"£" +inputAmount *0.84);
                break;
            case 4:
                System.out.println("$" +inputAmount + " = " +"£" +inputAmount *0.76);
                break;
            case 5:
                System.out.println("$" +inputAmount + " = " +"€" +inputAmount *0.91);
                break;
            default:
                System.out.println("invalid choice. Please type '0', '1', '2', '3', '4' or '5'.");
        }
    }
}