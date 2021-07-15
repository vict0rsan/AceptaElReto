package volumen3;

import java.util.*;
import java.util.Scanner;

public class problema388 {  //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            int posiciones = input.nextInt();

            if(posiciones == 0)
                break;

            List <Posicion> datos = new ArrayList<>();

            for(int i = 0; i < posiciones; i++) {

                int fila = input.nextInt();
                int columna = input.nextInt();

                datos.add(new Posicion(fila, columna));

            }

            int distanciaMax = 0;

            for(int i = 0; i < datos.size(); i++){
                for(int j = 0; j < datos.size(); j++){
                    int distancia = Math.abs(datos.get(i).fila-datos.get(j).fila);
                    int distacia2 = Math.abs(datos.get(i).columna-datos.get(j).columna);

                    if(distanciaMax < distancia + distacia2)
                        distanciaMax = distancia + distacia2;
                }
            }

            System.out.println(distanciaMax);



        }
    }

    static class Posicion{
        int fila;
        int columna;

        public Posicion(int fila, int columna){
            this.fila = fila;
            this.columna = columna;
        }

    }
}
