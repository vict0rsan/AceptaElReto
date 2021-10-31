package volumen1;

import java.util.Scanner;

public class problema164 { //PERFECT - ACCEPTED
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int posXpointA, posYpointA, posXpointB, posYpointB;

        while(true){
            posXpointA = input.nextInt();
            posYpointA = input.nextInt();
            posXpointB = input.nextInt();
            posYpointB = input.nextInt();

            int width = posXpointB - posXpointA;
            int height = posYpointB - posYpointA;

            if(width < 0 || height < 0)
                break;

            System.out.println(width*height);
        }
    }
}
