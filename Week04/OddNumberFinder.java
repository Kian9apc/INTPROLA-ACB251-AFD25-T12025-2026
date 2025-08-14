public class OddNumberFinder {
    public void findAndDisplayOdds1(int start, int end) {
        System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                findAndDisplayPrimeNumbers(i);
            }
        }
    }
    public void findAndDisplayOdds2(int start, int end) {
        System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");
 
        int i = start;
        while (i <= end) {
            if (i % 2 != 0) {
                System.out.println(i);
                findAndDisplayPrimeNumbers(i);
            }
            i++;
        }
    }
    public void findAndDisplayOdds3(int start, int end) {
    System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");

        int i = start;
        do {
            if (i % 2 != 0) {
            System.out.println(i);
            findAndDisplayPrimeNumbers(i);
            }
            i++;
        } while (i <= end);
    }
    private void findAndDisplayPrimeNumbers(int num) {
        if (isPrime(num)) {
            System.out.println(num + " Prime to");
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}