import java.util.Scanner;

public class LoopExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int start = input.nextInt();

        System.out.print("Enter the second number: ");
        int end = input.nextInt();

        System.out.println("Even numbers from " + start + " to " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
