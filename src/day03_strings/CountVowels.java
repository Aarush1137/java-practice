package day03_strings;
public class CountVowels {
    public static void main(String[] args) {
        String text = "Education";
        int vowelCount = 0;

        String lowerText = text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {
            char c = lowerText.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("String: " + text);
        System.out.println("Vowel count: " + vowelCount);
    }
}