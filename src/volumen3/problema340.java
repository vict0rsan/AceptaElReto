package volumen3;
import java.util.Scanner;

public class problema340 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce numero de casos: ");
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i++){
            System.out.println("Introduce ancho: ");
            int n = input.nextInt();
            System.out.println("Introduce alto: ");
            int m = input.nextInt();
            System.out.println("Resutado = " + (n*(n+1)+m*(m+1)));
        }
              
    }
    
}
