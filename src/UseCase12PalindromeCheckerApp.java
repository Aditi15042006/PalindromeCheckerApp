import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Stack based palindrome
    public static boolean stackPalindrome(String word) {

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

    // Deque based palindrome
    public static boolean dequePalindrome(String word) {

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

    public static void main(String[] args) {

        String word = "madam";

        // Measure stack strategy time
        long start1 = System.nanoTime();
        stackPalindrome(word);
        long end1 = System.nanoTime();

        // Measure deque strategy time
        long start2 = System.nanoTime();
        dequePalindrome(word);
        long end2 = System.nanoTime();

        System.out.println("Stack Strategy Time: " + (end1 - start1) + " ns");
        System.out.println("Deque Strategy Time: " + (end2 - start2) + " ns");
    }
}