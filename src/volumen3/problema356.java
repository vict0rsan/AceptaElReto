package volumen3;

import java.util.*;

public class problema356 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int casos = s.nextInt();

        for (int i = 0; i < casos; i++) {
            List<Long> valores_moneda = new ArrayList();

            for (int j = 0; j < 3; j++) {
                valores_moneda.add(s.nextLong());
            }

            Collections.sort(valores_moneda);

            for(int j = 0; j < 3; j++){
                if(j!=2)
                    System.out.print(valores_moneda.get(j)+ " ");
                else
                    System.out.print(valores_moneda.get(j));
            }
            
            
            System.out.println("");
        }
    }

}
