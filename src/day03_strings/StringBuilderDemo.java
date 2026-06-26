package day03_strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Create a new StringBuilder
        StringBuilder sb = new StringBuilder("Java");

        // 1. append() - Adds text to the end
        sb.append(" is fun!");
        System.out.println("After append: " + sb);
        // Output: Java is fun!

        // 2. insert() - Puts text at a specific index
        // Let's insert "really " before "fun!" (index 8)
        sb.insert(8, "really ");
        System.out.println("After insert: " + sb);
        // Output: Java is really fun!

        // 3. delete() - Removes a range of characters (startIndex, endIndex)
        // Let's delete "really " (indices 8 to 15)
        sb.delete(8, 15);
        System.out.println("After delete: " + sb);
        // Output: Java is fun!

        // 4. reverse() - Flips the entire string backward
        sb.reverse();
        System.out.println("After reverse: " + sb);
        // Output: !nuf si avaJ

        String finalResult = sb.toString();
    }
}