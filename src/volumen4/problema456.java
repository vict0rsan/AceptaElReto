
package volumen4;
import java.util.Scanner;


public class problema456 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de casos: ");
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i++){
            System.out.println("Introduce el ancho de la tableta: ");
            int ancho = input.nextInt();
            System.out.println("Introduce el alto de la tableta: ");
            int alto = input.nextInt();
            System.out.println("Introduce el numero de cuadraditos necesarios: ");
            int cuadraditos = input.nextInt();
            
            int tabletas = selectorTabletas(alto, ancho, cuadraditos);
            System.out.println("Son necesarias " + tabletas + " tabletas para la receta");
            
        }
        
    }
    
    public static int selectorTabletas(int ancho, int alto, int cuadraditos){
        int resultado = 1;
        int tabletasExtra;
        tabletasExtra = cuadraditos / (ancho*alto);
        resultado += tabletasExtra;
        return resultado;
    }
    
}
