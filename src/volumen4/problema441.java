package volumen4;

import java.math.BigInteger;
import java.util.*;

public class problema441 { //PERFECT - ACCEPTED

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Character> list = new ArrayList();

        while (input.hasNext()) {
            String stringNumber = input.nextLine();
            String stringNumberFormated = stringNumber.replace(".", "");
            BigInteger number = new BigInteger(stringNumberFormated);
            BigInteger increasedNumber = number.add(BigInteger.ONE);
            String stringIncreasedNumber = increasedNumber.toString();

            for(int i = 0; i < stringIncreasedNumber.length(); i++)
                list.add(stringIncreasedNumber.charAt(i));

            for(int i = list.size()-1, counter = 1; i >= 0; i--){
                if(counter%3==0 && i > 0)
                    list.add(i, '.');

                counter++;
            }

            String formatedResult = "";
            for(int i = 0; i < list.size(); i++)
                formatedResult+=list.get(i);

            System.out.println(formatedResult);
            list.clear();
        }
    }
}


