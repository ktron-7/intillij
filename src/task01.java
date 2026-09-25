import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = input.nextDouble();


        double tax = price * 0.05;


        System.out.println("Price: $" + price);
        System.out.println("Sales Tax: $" + tax);

        System.out.println("Total: $" + (price + tax));

        input.close();
    }
}