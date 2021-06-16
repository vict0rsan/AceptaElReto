package volumen5;

import java.util.Scanner;

public class problema541 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            int n3 = input.nextInt();

            if (n1 == 0 && n2 == 0 && n3 == 0) {
                break;
            }
            
            int g = greatestCommonFactor(n1,n2,n3);
            System.out.println(n1/g + n2/g + n3/g);
        }
    }

    public static int greatestCommonFactor(int a, int b, int c) {
        int limit;
        limit = Math.min(a, b);
        limit = Math.min(limit, c);
        for (int n = limit; n >= 2; n--) {
            if ((a % n == 0) && (b % n == 0) && (c % n == 0)) {
                return n;
            }
        }

        return 1;
    }

}
