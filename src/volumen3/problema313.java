package volumen3;
import java.util.Scanner;

public class problema313 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i++){

            int inicio = input.nextInt();
            int fin = input.nextInt();
            boolean check = inicio + fin >= 0;

            System.out.println(check?"SI":"NO");
        }
    }
}
