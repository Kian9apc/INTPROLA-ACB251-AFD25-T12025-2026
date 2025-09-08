import java.util.Scanner;

public class Midterms1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        int leftLetter = 0;
        int rightLetter = word.length() - 1;
        boolean isPalindrome = true;

        while (leftLetter < rightLetter) {
            if (word.charAt(leftLetter) != word.charAt(rightLetter)) {
                isPalindrome = false;
                break;
            }
            leftLetter++;
            rightLetter--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        sc.close();
    }
}
