package volumen1;

import java.util.Scanner;

public class problema116 { //PERFEC - ACCEPTED

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int helloWorldTimes = input.nextInt();

        if(helloWorldTimes >= 0 && helloWorldTimes <=5 ){
        for (int i = 1; i <= helloWorldTimes; i++)
            System.out.println("Hola mundo.");
        }
    }
}
