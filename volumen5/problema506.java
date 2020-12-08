package volumen5;

import java.util.Scanner;

public class problema506 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce cuantas muestras quiere tomar: ");
        int veces = input.nextInt();
        String datos;
        input.nextLine(); //limpiamos buffer para poder introducir String despues de Int
        
        for (int i = 0; i < veces; i++) {
            System.out.println("Introduce los datos de la muestra: ");
            datos = input.nextLine(); //
            String datos2 = datos.replaceAll("\\s", "");
            int barra = datos2.indexOf('/');
            /*System.out.println("datos = " + datos);
            System.out.println("datos2 = " + datos2);
            System.out.println("barra = " + barra);*/
            String datos3 = datos2.substring(0, barra);
            String datos4 = datos2.substring(barra + 1);
            int dato1 = Integer.parseInt(datos3);
            int dato2 = Integer.parseInt(datos4);

            if (dato1 >= dato2) {
                System.out.println("BIEN");
            } else {
                System.out.println("MAL");
            }

        }

    }
}
