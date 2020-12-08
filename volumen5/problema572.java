package volumen5;

import java.util.Scanner;

public class problema572 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos a los que se quiere evaluar: ");
        int alumnos = input.nextInt();
        double notas[];
        boolean media = true;

        for (int i = 0; i < alumnos; i++) {
            System.out.println("Introduce las notas del alumno nº: " + (i + 1));
             notas = new double[5];
            for (int j = 0; j < 5; j++) {
                notas[j] = input.nextDouble();
                //System.out.println("notas[i] = " + notas[i]);

            }
            for (int k = 0; k < 5; k++) {
                if (notas[k] == 0) {
                    //System.out.println(notas[k]);
                    media = false;
                    //System.out.println("media1 = " + media);
                    for (int n = 0; n < 5; n++) {
                        if (notas[n] >= 9) {
                            media = true;
                            //System.out.println("media2 = " + media);
                            break;
                        }
                    }
                } 
            }
            if (media == true) {
            System.out.println("MEDIA");
        } else {
            System.out.println("SUSPENSO DIRECTO");
        }
        
        }
    }
}
