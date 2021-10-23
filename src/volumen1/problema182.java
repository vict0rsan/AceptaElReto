package volumen1;

import java.util.Scanner;

public class problema182 { //PERFECT - ACCEPTED

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();
        input.nextLine();

        for (int i = 0; i < cases; i++) {
            String number = input.nextLine();
            multiplicativePersistence(number);
        }
    }

    public static void multiplicativePersistence(String number){
            int counter = 0;

            while(number.length() > 1){
                long numbers = multiplyChars(number);
                number = Long.toString(numbers);
                counter++;
            }

            System.out.println(counter);
    }

    public static long multiplyChars(String number){
        long result = 1;

        for(int i = 0; i < number.length(); i++){
            result*=Character.getNumericValue(number.charAt(i));
        }

        return result;
    }
}

