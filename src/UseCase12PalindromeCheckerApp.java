public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";   // original string
        String reversed = "";    // variable to store reversed string

        // Reverse the string using a for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed strings
        if (word.equals(reversed)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is not a Palindrome");
        }
    }
}