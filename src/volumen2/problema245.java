package volumen2;

import java.util.Scanner;

public class problema245 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean dalton = true;
        int numeroPersonajes;

        
        
        
        
        
        do {
            System.out.println("Introduce el numero de Dalton que aparecen en la foto: ");
            numeroPersonajes = input.nextInt();
            if(numeroPersonajes == 0)
                break;
            System.out.println("Introduce la altura de los Dalton: ");
            int h[] = new int[numeroPersonajes];

            for (int i = 0; i < numeroPersonajes; i++) {
                h[i] = input.nextInt();
            }
            for (int j = 0; j < numeroPersonajes - 1; j++) {
                if (h[j] >= h[j + 1]) {
                    dalton = false;
                }
            }
            if (dalton == true) 
                System.out.println("DALTON");
             else 
                System.out.println("DESCONOCIDOS");
            
            

        } while (numeroPersonajes != 0);

    }

}
