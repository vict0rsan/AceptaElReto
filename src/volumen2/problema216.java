package volumen2;

import java.util.Scanner;

public class problema216 {

    public static void main(String[] args) { //PERFECT - ACCEPTED
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for(int i=0; i<cases; i++) {
            int drops = s.nextInt();

            int hours = drops/3600;
            int minutes = (drops/60) - (hours*60);
            int seconds = drops - (minutes*60) - (hours*3600);

            System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
            System.out.println();
        }
    }
}
