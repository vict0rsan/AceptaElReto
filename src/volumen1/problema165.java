package volumen1;

import java.util.Scanner;

public class problema165 { //PERFECT - ACCEPTED
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        while(true){
            number = input.nextInt();

            if(number < 0)
                break;

            boolean hypepar = true;
            String numberString = Integer.toString(number);

            for(int i = 0; i < numberString.length(); i++){
                if(Character.getNumericValue(numberString.charAt(i))%2!=0){
                    hypepar = false;
                    break;
                }
            }
            System.out.println(hypepar ? "SI" : "NO");
        }
    }
}
