class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse the normalized string
        for(int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Check palindrome
        if(normalized.equals(reversed)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is not a Palindrome");
        }
    }
}