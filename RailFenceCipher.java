import java.util.*;
public class RailFenceCipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        System.out.print("Enter number of rails: ");
        int rails = sc.nextInt();

        // Encryption
        String[] fence = new String[rails];

        for (int i = 0; i < rails; i++) {
            fence[i] = "";
        }

        int row = 0;
        int direction = 1;

        for (char ch : text.toCharArray()) {

            fence[row] += ch;

            if (row == 0)
                direction = 1;
            else if (row == rails - 1)
                direction = -1;

            row += direction;
        }

        String cipher = "";

        for (int i = 0; i < rails; i++) {
            cipher += fence[i];
        }

        System.out.println("\nEncrypted Text: " + cipher);

        // Decryption
        int length = cipher.length();
        char[][] matrix = new char[rails][length];

        row = 0;
        direction = 1;

        // Mark positions
        for (int col = 0; col < length; col++) {

            matrix[row][col] = '*';

            if (row == 0)
                direction = 1;
            else if (row == rails - 1)
                direction = -1;

            row += direction;
        }

        // Fill matrix
        int index = 0;

        for (int i = 0; i < rails; i++) {
            for (int j = 0; j < length; j++) {
                if (matrix[i][j] == '*') {
                    matrix[i][j] = cipher.charAt(index++);
                }
            }
        }

        // Read plaintext
        String plain = "";

        row = 0;
        direction = 1;

        for (int col = 0; col < length; col++) {

            plain += matrix[row][col];

            if (row == 0)
                direction = 1;
            else if (row == rails - 1)
                direction = -1;

            row += direction;
        }

        System.out.println("Decrypted Text: " + plain);

        sc.close();
    }
}
