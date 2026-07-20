import java.util.Scanner;

public class VernamCipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Plaintext: ");
        String text = sc.nextLine();

        System.out.print("Enter Key: ");
        String key = sc.nextLine();

        if (text.length() != key.length()) {
            System.out.println("Key and text length must be same.");
            return;
        }

        String cipher = "", decrypted = "";

        // Encryption
        for (int i = 0; i < text.length(); i++)
            cipher += Integer.toHexString(text.charAt(i) ^ key.charAt(i)) + " ";

        System.out.println("\nEncrypted: " + cipher);

        // Decryption
        String[] arr = cipher.trim().split(" ");

        for (int i = 0; i < arr.length; i++)
            decrypted += (char) (Integer.parseInt(arr[i], 16) ^ key.charAt(i));

        System.out.println("Decrypted: " + decrypted);

        sc.close();
    }
}