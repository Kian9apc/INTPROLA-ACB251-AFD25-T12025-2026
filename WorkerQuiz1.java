public class WorkerQuiz1 {

    public void evenOddIdentify(int start, int end) {
        int a = start;

        while (a <= end) {
            if (a % 2 != 0) {
                if (isPrime(a)) {
                    System.out.println(a + " ODD TSAKA PRIME");
                } else {
                    System.out.println(a + " ODD");
                }
            }
            a++;
        }

        for (int b = start; b <= end; b++) {
            if (b % 2 == 0) {
                if (b % 3 == 0) {
                    System.out.println(b + " EVEN TSAKA DEVISIBLE SA 3");
                } else {
                    System.out.println(b + " EVEN");
                }
            }
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
