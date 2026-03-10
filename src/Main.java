import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to queue and stack
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while(!queue.isEmpty()) {
            if(queue.remove() != stack.pop()) {
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