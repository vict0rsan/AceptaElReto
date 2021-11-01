package volumen3;

import java.util.Scanner;

public class problema362 { //PERFECTO - ACCEPTED
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for(int i = 0; i < cases; i++){
            int day = input.nextInt();
            int month = input.nextInt();
            System.out.println(day==25 && month==12 ? "SI" : "NO");
        }
    }
}
