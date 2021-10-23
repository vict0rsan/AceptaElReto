package volumen1;

import java.util.Scanner;

public class problema140 { //PERFECT - ACCEPTED

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            String number = input.nextLine();

            if(Integer.parseInt(number) < 0)
                break;

            System.out.println(displayDigits(number));
        }
    }

    public static String displayDigits(String number) {
        String displayedDigits = String.valueOf(number.charAt(0));
        int digitsSum = Character.getNumericValue(number.charAt(0));

        for(int i = 1; i < number.length(); i++) {
            displayedDigits += " + " + number.charAt(i);
            digitsSum+= Character.getNumericValue(number.charAt(i));
        }
        return displayedDigits + " = " + digitsSum;
    }
}
