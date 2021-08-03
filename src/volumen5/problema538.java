package volumen5;
import java.util.Scanner;


public class problema538 { //PERFECTO - ACCEPTED
       
    public static void main(String[] args) {

        final Scanner input = new Scanner(System.in);

        while (true) {

            int n1 = input.nextInt();
            int n2 = input.nextInt();

            if (n1 == 0 && n2 == 0)
                break;

            System.out.println(n1 < n2 ? "SENIL" : "CUERDO" );
        }

    }

}
