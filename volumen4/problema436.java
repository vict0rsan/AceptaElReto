package volumen4;
import java.util.Scanner;

public class problema436 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de casos de prueba: ");
        int casos = input.nextInt();
        int doblado = 0;
        
        for(int i = 0; i < casos; i++){
            System.out.println("Introduce grosor del papel: ");
            double grosor = input.nextInt();
            grosor = grosor *  Math.pow(10, -6);
            //System.out.println("grosor = " + grosor);
            System.out.println("Introduce altura del edificio: ");
            int altura = input.nextInt();
            for(int j = 0; grosor < altura; j++){
                grosor = grosor*2;
                doblado = j + 1;
                
            }
            System.out.println("Veces doblado = " + doblado + "\n");
        }
    }
    
}
