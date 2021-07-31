package volumen5;
import java.util.*;

public class problema589 { //CASOS DE PRUEBA BIEN - MEMORY LIMIT EXCEED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            int numeroCopas = input.nextInt();

            if(numeroCopas == 0)
                break;

            long suma = 0;

            long [] cantidadLiquido = new long[numeroCopas];

            for(int i = 0; i < numeroCopas; i++)
                cantidadLiquido[i] = input.nextLong();

            Arrays.sort(cantidadLiquido);

            for(int i = numeroCopas - 1; i > 0; i--){
                long diferencia = cantidadLiquido[i] - cantidadLiquido[i-1];
                suma += diferencia;
            }

            System.out.println(suma);
        }
    }
}
