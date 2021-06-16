
package volumen3;
import java.util.Scanner;


public class problema355 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de casos de prueba: ");
        int casos = input.nextInt();
        
        for(int i=0; i<casos; i++){
            System.out.println("Introduce el año que quieras comprobar: ");
            int años = input.nextInt();
            boolean bisiesto = añoBisiesto(años);
            if(bisiesto == true)
                System.out.println("29 DIAS EN FEBRERO (BISIESTO)");
            else
                System.out.println("28 DIAS EN FEBRERO (NO BISIESTO)");
        }
    }
    public static boolean añoBisiesto(int año){   //metodo para comprobar si el año es bisiesto
        boolean bisiesto = false;
        if(año%4==0){
            bisiesto = true;
            if(año%100 == 0){
                bisiesto = false;
                if(año%400==0){
                    bisiesto = true;
                }
            }
                
        }
        return bisiesto;    
    }
    
}
