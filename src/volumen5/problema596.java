package volumen5;

import java.util.Scanner;

public class problema596 {

    public static void main(String[] args) { //PERFECT - ACCEPTED
        Scanner input = new Scanner(System.in);

        while(input.hasNextLine()){

            String codedMessage = input.nextLine();
            String decodedMessage = "";

            for(int i = 0; i < codedMessage.length()-2; i++){
                if(codedMessage.charAt(i) != '.' && codedMessage.charAt(i+1) == '.' && codedMessage.charAt(i+2) == '.')
                    decodedMessage+=codedMessage.charAt(i);
            }
            System.out.println(decodedMessage);
        }
    }
}
