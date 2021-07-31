package volumen5;
import java.util.Scanner;

public class problema532 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        
        for( int i = 0; i < casos; i++){
            int nproducto = input.nextInt();
            int tproducto = input.nextInt();
            System.out.println(tproducto - nproducto);
        }
    }
}
