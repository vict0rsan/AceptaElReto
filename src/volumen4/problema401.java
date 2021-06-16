package volumen4;

import java.util.*;

public class problema401 { //INACABADO

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca casos de prueba: ");
        int n = input.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Introduce primera palabra: ");
            String palabra1 = input.nextLine();
            System.out.println("Introduce segunda palabra: ");
            String palabra2 = input.nextLine();
            palabra1.replace('b','v');
            palabra2.replace('b', 'v');
            
        }

    }

}
