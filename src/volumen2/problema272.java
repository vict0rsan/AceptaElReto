package volumen2;

import java.util.Scanner;

public class problema272 { //PERFECT - ACCEPTED
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for(int i = 0; i < cases; i++){
            int base10number = input.nextInt();
            String base6string = Integer.toString(base10number, 6);
            System.out.println(base6string);
        }
    }
}
