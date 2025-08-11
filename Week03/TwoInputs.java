import java.util.Scanner;

public class TwoInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter Favourite Number: ");
        int favouriteNumber = input.nextInt();

        System.out.println("Your age is: " + age);
        System.out.println("Your favourite number is: " + favouriteNumber);
        
        System.out.println("When added together: " + (age + favouriteNumber));
        System.out.println("When subtracted together: " + (age - favouriteNumber));
        System.out.println("When multiplied together: " + (age * favouriteNumber));
        System.out.println("When divided together: " + (age / favouriteNumber));
        
    }
}
