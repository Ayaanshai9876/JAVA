import java.util.Scanner;

public class MultiplicationTableUsingfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int number = sc.nextInt();
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
        int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        sc.close();
    }
}
