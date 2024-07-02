import java.util.Scanner;

public class VigenereCipher {

    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    result.append((char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A'));
                } else {
                    result.append((char) ((c + key.charAt(j) - 'A' - 'a') % 26 + 'a'));
                }
                j = ++j % key.length();
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    result.append((char) ((c - key.charAt(j) + 26) % 26 + 'A'));
                } else {
                    result.append((char) ((c - key.charAt(j) + 'A' - 'a' + 26) % 26 + 'a'));
                }
                j = ++j % key.length();
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Please choose an option:");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the text: ");
            String text = scanner.nextLine();

            System.out.print("Enter the key: ");
            String key = scanner.nextLine();

            if (choice == 1) {
                String encrypted = encrypt(text, key);
                System.out.println("Encrypted text: " + encrypted);
            } else if (choice == 2) {
                String decrypted = decrypt(text, key);
                System.out.println("Decrypted text: " + decrypted);
            } else {
                System.out.println("Invalid choice.");
            }

            System.out.print("Do you want to perform another operation? (yes/no): ");
            String response = scanner.nextLine();
            continueProgram = response.equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}
