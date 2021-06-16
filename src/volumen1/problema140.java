package volumen1;

import java.util.Scanner;

public class problema140 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Escribe el numero: ");
            numero = input.nextInt();
            if (numero >= 0) {
                sumaDeDigitos(numero);
            }

        } while (numero >= 0);

        System.out.println("Fin del programa");

    }

    public static void sumaDeDigitos(int numero) {
        String number = Integer.toString(numero);
        int suma = 0;
        String resultado = "";

        for (int i = 0; i < number.length(); i++) {
            if (i == 0) {
                resultado = resultado + number.charAt(i);
            } else {
                resultado = resultado + " + " + number.charAt(i);
            }
            suma += Character.getNumericValue(number.charAt(i));
            //System.out.println("number.charAt(i) = " + number.charAt(i));
        }
        System.out.println(resultado);
        System.out.println("suma = " + suma);
    }

}
