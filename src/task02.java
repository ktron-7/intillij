import java.util.Scanner;
public class task02 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double spring;
    double summer;
    double fall;
    double winter;
    double total;

    System.out.print("Enter spring maintenance cost: ");
    spring = input.nextDouble();

    System.out.print("Enter summer maintenance cost: ");
    summer = input.nextDouble();

    System.out.print("Enter fall maintenance cost: ");
    fall = input.nextDouble();

    System.out.print("Enter winter maintenance cost: ");
    winter = input.nextDouble();

    total = spring + summer + fall + winter;

    System.out.println("Spring cost: $" + spring);
    System.out.println("Summer cost: $" + summer);
    System.out.println("Fall cost: $" + fall);
    System.out.println("Winter cost: $" + winter);
    System.out.println("Total yearly maintenance cost: $" + total);
}
}
