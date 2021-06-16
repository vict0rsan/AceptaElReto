package volumen1;
import java.util.Scanner;


public class problema117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Introduce personas a las que deseas saludar: ");
        int p = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < p; i++){
           // System.out.println("Introduce nombre de la persona numero: " + (i +1));
            String presentacion = input.nextLine();
            int espacio = presentacion.indexOf(" ");
            String nombre = presentacion.substring(espacio+1);
            System.out.println("Hola, " + nombre+".");
        }
    }
    
}
