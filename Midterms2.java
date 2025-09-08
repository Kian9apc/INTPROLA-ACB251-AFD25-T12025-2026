public class Midterms2 {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            
            if (num % 2 == 0) {
                if (num % 3 == 0) {
                    System.out.println("Yes, this is divisible by 3 - " + num);
                } else {
                    System.out.println(num);
                }
            } 
            else {
                if (num % 5 == 0) {
                    System.out.println("No, it's divisible by 5 - " + num);
                } else {
                    System.out.println("Odd number not divisible by 5 - " + num);
                }
            }
        }
    }
}
