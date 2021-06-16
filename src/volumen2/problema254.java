package volumen2;

import java.util.Arrays;
import java.util.Scanner;

public class problema254 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int esquiadores;
        int suma = 0;
        int[] prueba = {1, 2, 3, 7, 2, 54, 2, 745, 342, 12};
        prueba = ordenador(prueba);
        for (int i = 0; i < prueba.length; i++) {
            System.out.println(prueba[i]);
        }

        do {
            System.out.println("Introduce el numero de esquiadores: ");
            esquiadores = input.nextInt();
            if(esquiadores == 0)
                break;
            int alturas[] = new int[esquiadores];
            int esquis[] = new int[esquiadores];
            int resultado[] = new int[esquiadores];
            for (int i = 0; i < esquiadores; i++) {
                System.out.println("Introduce la altura del esquiador numero: " + (i + 1));
                alturas[i] = input.nextInt();
            }
            for (int j = 0; j < esquiadores; j++) {
                System.out.println("Introduce la longitud de los esquis numero: " + (j + 1));
                esquis[j] = input.nextInt();
            }
            alturas = ordenador(alturas);
            esquis = ordenador(esquis);
            for (int k = 0; k < esquiadores; k++) {
                resultado[k] = Math.abs(alturas[k] - esquis[k]);
                suma = suma + resultado[k];
                System.out.println("resultado[k] = " + resultado[k]);
            }
            System.out.println("Suma minima: " + suma);

        } while (esquiadores != 0);
    }

    public static int[] ordenador(int[] array) {
        int aux;
        
            for(int i = 0; i<array.length-1; i++){
                for(int j = 0; j < array.length-1; j++){
                    if(array[j]>array[j+1]){
                        aux = array[j];
                        array[j]=array[j+1];
                        array[j+1]=aux;
                    }
                }
            
        }
        return array;
    }

}
