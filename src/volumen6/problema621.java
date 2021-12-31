package volumen6;

import java.util.Scanner;

public class problema621 { //PERFECT - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for(int i = 0; i < cases; i++){
            int page = input.nextInt();
            System.out.println(page%2==0 ? page : page - 1 );
        }
    }
}
