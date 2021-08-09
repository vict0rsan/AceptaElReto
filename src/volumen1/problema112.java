package volumen1;
import java.util.Scanner;

public class problema112 {

    public static void main(String[] args) { //PERFECTO - ACCEPTED

        Scanner input = new Scanner(System.in);

        while(true){

            int distanciaEntreCamaras = input.nextInt();
            int velocidadMaximaPermitida = input.nextInt();
            int tiempoUsado = input.nextInt();

            if(distanciaEntreCamaras == 0 && velocidadMaximaPermitida == 0 && tiempoUsado == 0)
                break;

            double distanciaEntreCamarasKilometros = distanciaEntreCamaras/(double)1000;
            double tiempoUsadoHoras = tiempoUsado/(double)3600;
            double velocidadMedia = distanciaEntreCamarasKilometros/tiempoUsadoHoras;

            if(distanciaEntreCamaras <= 0 || velocidadMaximaPermitida <= 0 || tiempoUsado <= 0)
                System.out.println("ERROR");
            else if(velocidadMedia >= velocidadMaximaPermitida + velocidadMaximaPermitida*0.2)
                System.out.println("PUNTOS");
            else if(velocidadMedia > velocidadMaximaPermitida)
                System.out.println("MULTA");
            else
                System.out.println("OK");
        }
    }
}
