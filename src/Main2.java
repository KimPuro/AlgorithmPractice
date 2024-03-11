
import java.util.Scanner;

public class Main2{
    static int[] honey;
    static int[] sum;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        honey = new int[n + 1];
        sum = new int[n + 1];
        for (int i = 1; i < n; i++) {
            honey[i] = sc.nextInt();
            sum[i] = sum[i - 1] + honey[i];
        }
        int max1 = bBT();
        int max2 = tBB();
        int max3 = bTB();
        int max = Math.max(max1, max2);
        System.out.print(Math.max(max, max3));
    }

    static int bBT() {
        int max = 0;
        for (int i = 2; i < n; i++) {
            int leftBee = sum[n] - honey[1] - honey[i];
            int rightBee = sum[n] - sum[i];
            if (max < (leftBee + rightBee)) {
                max = leftBee + rightBee;
            }
        }
        return max;
    }

    static int tBB() {
        int max = 0;
        for (int i = 2; i < n; i++) {
            int leftBee = sum[n - 1] - honey[i];
            int rightBee = sum[i - 1];
            if (max < leftBee + rightBee) {
                max = leftBee + rightBee;
            }
        }
        return max;
    }

    static int bTB() {
        int max = 0;
        for (int i = 2; i < n; i++) {
            int leftBee = sum[i] - honey[1];
            int rightBee = sum[n - 1] - sum[i - 1];
            if (max < leftBee + rightBee) {
                max = leftBee + rightBee;
            }
        }
        return max;
    }
}
