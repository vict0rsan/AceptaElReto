package volumen2;

import java.util.Scanner;

public class problema237 { //PERFECT - RUN TIME ERROR

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            String number = input.nextLine();
            System.out.println(polidivisible(number) ? "POLIDIVISIBLE" : "NO POLIDIVISIBLE");
        }
    }

    public static boolean polidivisible(String number){
        if(number.length() == 0)
            return true;
        else if(Long.parseLong(number)%number.length()!=0)
            return false;
        else
            return polidivisible(number.substring(0, number.length() - 1));
    }
}
