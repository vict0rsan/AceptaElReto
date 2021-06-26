
package volumen3;
import java.util.Scanner;


public class problema355 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de casos de prueba: ");
        int casos = input.nextInt();
        
        for(int i=0; i<casos; i++){
            System.out.println("Introduce el año que quieras comprobar: ");
            int anos = input.nextInt();
            boolean bisiesto = anoBisiesto(anos);
            if(bisiesto == true)
                System.out.println("29 DIAS EN FEBRERO (BISIESTO)");
            else
                System.out.println("28 DIAS EN FEBRERO (NO BISIESTO)");
        }
    }
    public static boolean anoBisiesto(int ano){   //metodo para comprobar si el año es bisiesto
        boolean bisiesto = false;
        if(ano%4==0){
            bisiesto = true;
            if(ano%100 == 0){
                bisiesto = false;
                if(ano%400==0){
                    bisiesto = true;
                }
            }
                
        }
        return bisiesto;    
    }
    
}
