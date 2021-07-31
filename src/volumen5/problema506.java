package volumen5;

import java.util.Scanner;

public class problema506 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < casos; i++) {

            String datos = input.nextLine();
            String datos2 = datos.replaceAll("\\s", "");
            int barra = datos2.indexOf('/');
            String datos3 = datos2.substring(0, barra);
            String datos4 = datos2.substring(barra + 1);
            int dato1 = Integer.parseInt(datos3);
            int dato2 = Integer.parseInt(datos4);

            if (dato1 >= dato2)
                System.out.println("BIEN");
            else
                System.out.println("MAL");
        }
    }
}
