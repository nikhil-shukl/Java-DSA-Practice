import java.util.Scanner;

public class HillCipher {

    // Key Matrix
    static int[][] key = {
            {3, 3},
            {2, 5}
    };

    public static void main(String[] args) {

        String plaintext = "NIKHIL".toUpperCase();

        if (plaintext.length() % 2 != 0) {
            plaintext += "X";
        }

        // ---------------- Encryption ----------------
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i += 2) {

            int p1 = plaintext.charAt(i) - 'A';
            int p2 = plaintext.charAt(i + 1) - 'A';

            int c1 = (key[0][0] * p1 + key[0][1] * p2) % 26;
            int c2 = (key[1][0] * p1 + key[1][1] * p2) % 26;

            ciphertext.append((char) (c1 + 'A'));
            ciphertext.append((char) (c2 + 'A'));
        }

        System.out.println("Plain Text : " + plaintext);
        System.out.println("Encrypted Text : " + ciphertext);

        // ---------------- Decryption ----------------

        int a = key[0][0];
        int b = key[0][1];
        int c = key[1][0];
        int d = key[1][1];

        int det = (a * d - b * c) % 26;
        if (det < 0)
            det += 26;

        int detInverse = modInverse(det, 26);

        int[][] inverseKey = {
                {d, -b},
                {-c, a}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inverseKey[i][j] = (inverseKey[i][j] * detInverse) % 26;
                if (inverseKey[i][j] < 0)
                    inverseKey[i][j] += 26;
            }
        }

        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i += 2) {

            int x1 = ciphertext.charAt(i) - 'A';
            int x2 = ciphertext.charAt(i + 1) - 'A';

            int p1 = (inverseKey[0][0] * x1 + inverseKey[0][1] * x2) % 26;
            int p2 = (inverseKey[1][0] * x1 + inverseKey[1][1] * x2) % 26;

            if (p1 < 0)
                p1 += 26;
            if (p2 < 0)
                p2 += 26;

            decrypted.append((char) (p1 + 'A'));
            decrypted.append((char) (p2 + 'A'));
        }

        System.out.println("Decrypted Text : " + decrypted);
    }

    // Function to find modular inverse
    static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1)
                return x;
        }
        return -1;
    }
}