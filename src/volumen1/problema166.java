package volumen1;

import java.util.Scanner;

public class problema166 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        do {

            a = input.nextInt();
            b = input.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int res = canales(a, b);
            System.out.println(res);
        }while(a != 0 && b != 0);
        
    
    }

    public static int canales(int a, int b) {
        int resultado = 0;
        if (Math.abs(a - b) < 50) {
            resultado = a - b < 0 ? b - a : a - b;
        } else {
            resultado = a - b < 0 ? 99 - b + a : 99 - a + b;
        }

        return resultado;

    }
}
