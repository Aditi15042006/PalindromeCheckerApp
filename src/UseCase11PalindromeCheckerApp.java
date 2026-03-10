import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String word);
}

// Stack based strategy
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()) {
            stack.push(c);
        }

        for(char c : word.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque based strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Choose strategy
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        if(strategy.isPalindrome(word)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is not a Palindrome");
        }
    }
}