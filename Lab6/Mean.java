import java.util.Scanner;

public class Mean {
    public static void main(String[] arrstring) {
        int n;
        int[] arrn;
        int[] arrn2;
        Scanner scanner = new Scanner(System.in);
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        System.out.print("Please enter the number of integers you want to enter: ");
        n2 = scanner.nextInt();
        if (n2 % 2 == 0) {
            arrn = new int[n2 / 2 + 1];
            arrn2 = new int[n2 / 2];
        } else {
            arrn = new int[n2 / 2 + 1];
            arrn2 = new int[n2 / 2 + 1];
        }
        while (n3 <= n2) {
            System.out.print("Please enter a number: ");
            if (n3 % 2 == 0 || n3 == 0) {
                arrn[n4] = scanner.nextInt();
                ++n4;
                ++n3;
                continue;
            }
            arrn2[n5] = scanner.nextInt();
            ++n5;
            ++n3;
        }
        System.out.println("List 1: ");
        for (n = 0; n < arrn.length; ++n) {
            System.out.print("" + arrn[n] + " ");
            n6 += arrn[n];
        }
        System.out.println("\nMean of List 1: " + (float)(n6 / arrn.length));
        System.out.println("List 2: ");
        for (n = 0; n < arrn2.length; ++n) {
            System.out.print("" + arrn2[n] + " ");
            n7 += arrn2[n];
        }
        System.out.println("\nMean of List 2: " + (float)(n7 / arrn2.length));
    }
}