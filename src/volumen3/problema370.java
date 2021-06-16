
package volumen3;
import java.util.Scanner;

public class problema370 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Introduce los casos de prueba: ");
        int casos = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < casos; i++){
//            System.out.println("Introduce medidas de la llave: ");
            String llave = input.nextLine();
            llaveMecanico(llave);
        }
        
        
    }
    
    public static void llaveMecanico(String llave){
        int guion = llave.indexOf('-');
        String dato1 = llave.substring(0,guion);
        String dato2 = llave.substring(guion+1);
        int datoN1 = Integer.parseInt(dato1);
        int datoN2 = Integer.parseInt(dato2);
        if((datoN1 + 1 == datoN2 && datoN1%2 == 0) || (datoN2 + 1 == datoN1 && datoN2%2 == 0))
            System.out.println("SI");
        else
            System.out.println("NO");
        
    }
    
}
