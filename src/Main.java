import solution.Solution;

public class Main {
    public static void main(String[] args) {
        String encodedText = Solution.encode("BHELLO WORLD");
        System.out.printf("Encoded text (B): %s%n", encodedText);
        System.out.printf("Text decoded back (B): %s%n", Solution.decode("B" + encodedText));

        String plainText = Solution.decode("FC/GGJ RJMG.");
        System.out.printf("Decoded text (F): %s%n", plainText);
        System.out.printf("Text encoded back (F): %s%n", Solution.encode("F" + plainText));
    }
}