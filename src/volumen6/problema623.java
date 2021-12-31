package volumen6;

import java.util.Arrays;
import java.util.Scanner;

public class problema623 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        input.nextLine();

        for(int i = 0; i < cases; i++){
            String data = input.nextLine();
            String [] numbers = data.split(" ");
            boolean wins = sameChars(numbers[0], numbers[1]);
            System.out.println(wins ? "GANA" : "PIERDE");
        }
    }

    public static boolean sameChars(String firstNumber, String secondNumber){
        char[] first = firstNumber.toCharArray();
        char[] second = secondNumber.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }

}
