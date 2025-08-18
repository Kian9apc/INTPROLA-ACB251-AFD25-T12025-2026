public class WorkerQuiz1 {
    
    public void processRange(int start, int end) {
        int i = start;

        while (i <= end) {
            if (i % 2 != 0) { // odd
                if (isPrime(i)) {
                    System.out.println(i + " is odd and a prime number.");
                }
            }
            i++;
        }

        for (int j = start; j <= end; j++) {
            if (j % 2 == 0) { // even
                if (j % 3 == 0) {
                    System.out.println(j + " is even and divisible by 3.");
                }
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
