import java.util.Scanner;

public class primeNoPairRoot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        if (n <= 1) {
            isPrime = false;
        } else {

            // Check divisibility only till √n
            for (int i = 2; i * i <= n; i++) {

                // If n is divisible by i,
                // then n is not prime
                if (n % i == 0) {
                    isPrime = false;
                    break; // Exit loop immediately
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }

        sc.close();
    }
}


// Why Do We Check Only Till √n?

// Suppose:

// n = 36

// To find factors, we can check:

// 1, 2, 3, 4, 5, 6, 7, ... 36

// But factors always occur in pairs:

// 1 × 36 = 36
// 2 × 18 = 36
// 3 × 12 = 36
// 4 × 9  = 36
// 6 × 6  = 36

// Observe:

// 1 ↔ 36
// 2 ↔ 18
// 3 ↔ 12
// 4 ↔ 9
// 6 ↔ 6

// Now:

// √36 = 6

// When we reach 6, all factor pairs have already been found.

// There is no need to check:

// 9  because its pair (4) is already found.
// 18 because its pair (2) is already found.
// 36 because its pair (1) is already found.

// Therefore, checking beyond √n only repeats factors that have already been discovered.