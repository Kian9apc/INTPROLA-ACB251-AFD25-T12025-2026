import java.util.Scanner;

public class LoopExerciseToday {
 
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int startPoint = inputScanner.nextInt();

        System.out.print("Enter the ending number: ");
        int endPoint = inputScanner.nextInt();

        OddNumberFinder finder = new OddNumberFinder();

        finder.findAndDisplayOdds1(startPoint, endPoint);

        inputScanner.close();
    }
}
 