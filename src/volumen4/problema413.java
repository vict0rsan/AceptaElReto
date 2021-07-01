package volumen4;
import java.util.Scanner;

public class problema413 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();

        for(int i = 0; i < casos; i++){

            int ancho = input.nextInt();
            int alto = input.nextInt();

            int total = ancho * alto;

            if(total%2==0)
                System.out.println(total/2 + " " + total/2);
            else
                System.out.println((total/2+1) + " " + total/2);
        }
    }
}
