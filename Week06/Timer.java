import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Min: ");
        int minutes = scanner.nextInt();

        System.out.println("Enter Sec: ");
        int seconds = scanner.nextInt();

        int[][] time = new int [2][1];
        time[0][0] = minutes;
        time[1][0] = seconds;

        System.out.println("\nStart\n");

        while (time[0][0] > 0 || time[1][0] > 0) {

            System.out.printf("%02d:%02d\n", time[0][0], time[1][0]);

            Thread.sleep(1000);

            if (time[1][0] == 0) {
                if (time[0][0] > 0) {
                    time[0][0]--;
                    time[1][0] = 59; 
                    
                }
            }
            else{
                time[1][0]--;
            }
        }
        System.out.println("00:00");
            System.out.println("Tapos na");
            scanner.close();
    }
}