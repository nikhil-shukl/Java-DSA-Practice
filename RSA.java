import java.util.*;
import java.math.BigInteger;

class RSA {

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter p: ");
        int p = sc.nextInt();

        System.out.print("Enter q: ");
        int q = sc.nextInt();

        int n = p * q;
        int phi = (p - 1) * (q - 1);

        int e = 2;
        while (e < phi && gcd(e, phi) != 1)
            e++;

        int d = 1;
        while ((d * e) % phi != 1)
            d++;

        System.out.println("Public Key: (" + e + ", " + n + ")");
        System.out.println("Private Key: (" + d + ", " + n + ")");

        sc.nextLine();

        System.out.print("Enter message: ");
        String msg = sc.nextLine();

        // Encryption
        String enc = "";

        for (char ch : msg.toCharArray()) {
            BigInteger c = BigInteger.valueOf(ch)
                    .modPow(BigInteger.valueOf(e), BigInteger.valueOf(n));

            enc += c + " ";
        }

        System.out.println("Encrypted: " + enc);

        // Decryption
        String dec = "";

        for (String x : enc.trim().split(" ")) {
            BigInteger m = new BigInteger(x)
                    .modPow(BigInteger.valueOf(d), BigInteger.valueOf(n));

            dec += (char) m.intValue();
        }

        System.out.println("Decrypted: " + dec);

        sc.close();
    }
}