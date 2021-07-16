package volumen5;
import java.util.Scanner;


public class problema512 { //PERRFECTO - ACCEPTED

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i++){

            int conejo = input.nextInt();
            int caballo = input.nextInt();
            int pconejo = Math.round((conejo*100)/(conejo+caballo));

            System.out.println(pconejo);

        }
    }
    
}

