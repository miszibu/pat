package yi.training;

import java.util.Scanner;
public  class Main {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static long times(int n) {
        if (n == 1)
            return 0;
        if (n < 4)
            return 1;
        return times(max((n + 2) / 3, n - (n + 2) / 3 * 2)) + 1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "";
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n > 0)
                str += times(n) + "\n";
            else
                break;
        }
        System.out.print(str);
    }
}

