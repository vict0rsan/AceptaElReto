package volumen2;

import java.util.Scanner;

public class problema205 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce cuantos numeros quieres meter: ");
        int casos = input.nextInt();
        int invertido = 0;
        int resto;

        for (int i = 0; i < casos; i++) {
            boolean equal = true;
            int numFinal;
            int contador = 0;
            String numFin;
            System.out.println("Indtroduce el numero: " + i + " para ver si es valido: ");
            int numero = input.nextInt();
            int numeroOrg = numero;
            
            //Do-While para sumar hacer el proceso numero + dado la vuelta tantas veces como sea necesario
            do {
                // While para obtener el numero girado      
                while (numero > 0) {
                    resto = numero % 10;
                    invertido = invertido * 10 + resto;
                    numero = numero / 10;
                }

                numFinal = numeroOrg + invertido;
                System.out.println("numFinal: "+numFinal);
                System.out.println("numORG "+numeroOrg);
                System.out.println("invertido: "+invertido);

                // Converimos la suma de su numero y el mismo invertido a una cadena para poder comparar
                numFin = Integer.toString(numFinal);
                System.out.println("String que se va a recorrer: " + numFin);

                //Ciclo for para comprobar si el numero es capicua
                for (int j = 0; j < numFin.length(); j++) {
                    if (numFin.charAt(j) != numFin.charAt(numFin.length() - j -1 )) {
                        equal = false;
                        System.out.println("equal = " + equal);
                    }
                    else{
                        equal = true;
                    }
                    contador++;
                    System.out.println("contador = " + contador);
                }
                numFinal = Integer.parseInt(numFin);
                System.out.println("numFinal = " + numFinal);;
                numero = numFinal;
                System.out.println("numero = " + numero);
                numeroOrg = numFinal;
                System.out.println("numeroOrg = " + numeroOrg);
                invertido = 0;
                System.out.println(equal);

            } while (equal == false && numFinal < 100000);

            if (equal == false || numFinal > 100000) {
                System.out.println("Lychrel?");
            } else {
                System.out.println(contador + " " + numFin);
            }
        }

    }
}
