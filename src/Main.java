import java.util.Deque;
import java.util.ArrayDeque;

class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for(int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while(deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if(first != last) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is not a Palindrome");
        }
    }
}