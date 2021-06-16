package volumen5;
import java.util.Scanner;


public class problema538 { //que le pasa? funciona bien pero me sale RTError
       
         public static void main(String[] args) {

        final Scanner s = new Scanner(System.in);

        while (true) {
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            if (n1 == 0 && n2 == 0) break;
            System.out.println( (n1 < n2) ? "SENIL" : "CUERDO" );
        }

    }

}
