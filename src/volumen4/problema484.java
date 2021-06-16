package volumen4;

import java.util.Scanner;
import java.math.*;

public class problema484 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            //System.out.println("empieza");
            String dato = s.nextLine();
            if(dato.contains(".")){
            String[] datos = dato.split("\\.");
            
            BigInteger entero = new BigInteger(datos[0]);
//            int entero = Integer.parseInt(datos[0]);

            String s_entero = entero.toString();
            
            
             BigInteger decimal = new BigInteger(datos[1]);

//            double decimal = Double.parseDouble(sDecimal);

            if (decimal.equals(0)) {
                System.out.println(s_entero);
            } else {
                System.out.println(entero+"."+decimal);
            }
            
            }
            else
                System.out.println(new BigInteger(dato));
        }
    }
}
