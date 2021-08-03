package volumen5;
import java.util.Scanner;

public class problema539 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        while(input.hasNext()) {
            int dato1 = input.nextInt();
            int dato2 = input.nextInt();
            decadaNueva(dato1, dato2);
        }
    }

    public static void decadaNueva(int dato1, int dato2){
        int resta = dato2 - dato1;
        if(resta % 10 == 9 )
            System.out.println("FELIZ DECADA NUEVA");
        else
            System.out.println("TOCA ESPERAR");
    }
}
    
    

