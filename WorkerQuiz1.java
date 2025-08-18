public class WorkerQuiz1 {

    public void processRange(int start, int end) {
        int a = start;

        // While loop: check odd numbers and display if prime
        while (a <= end) {
            if (a % 2 != 0) { // odd check
                displayIfPrime(a);
            }
            a++;
        }

        // For loop: check even numbers divisible by 3
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { // Odd numbers
                System.out.println(i + " is odd.");
                displayIfPrime(i);
            } else if (i % 3 == 0) { // Even numbers divisible by 3
                System.out.println(i + " is even and divisible by 3.");
                displayIfPrime(i);
            }
        }
    }

    // Separated method to display prime info
    private void displayIfPrime(int num) {
        if (isPrime(num)) {
            System.out.println(num + " is odd and a prime number.");
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int c = 2; c < num; c++) {
            if (num % c == 0) {
                return false;
            }
        }
        return true;
    }
}
