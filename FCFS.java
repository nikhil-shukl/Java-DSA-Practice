import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of processes: ");
        n = sc.nextInt();

        int[] pid = new int[n];
        int[] at = new int[n];
        int[] bt = new int[n];
        int[] wt = new int[n];
        int[] tat = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            pid[i] = i + 1;

            System.out.print("Arrival Time: ");
            at[i] = sc.nextInt();

            System.out.print("Burst Time: ");
            bt[i] = sc.nextInt();
        }

        // Waiting Time
        wt[0] = 0;
        for (int i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + bt[i - 1];
        }

        // Turnaround Time
        for (int i = 0; i < n; i++) {
            tat[i] = wt[i] + bt[i];
        }

        float avgWT = 0;
        float avgTAT = 0;

        System.out.println("\nPID\tAT\tBT\tWT\tTAT");

        for (int i = 0; i < n; i++) {
            System.out.println(pid[i] + "\t" + at[i] + "\t" + bt[i] + "\t" + wt[i] + "\t" + tat[i]);
            avgWT += wt[i];
            avgTAT += tat[i];
        }

        System.out.println("\nAverage Waiting Time = " + (avgWT / n));
        System.out.println("Average Turnaround Time = " + (avgTAT / n));

        sc.close();
    }
}