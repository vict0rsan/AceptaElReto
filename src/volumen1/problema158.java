package volumen1;
import java.util.*;

public class problema158 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();

        for (int i = 0; i < casos; i++){

            int saltosArriba = 0;
            int saltosAbajo = 0;

            int muros = input.nextInt();
            List<Integer> alturas = new ArrayList<>();

            for(int j = 0; j < muros; j++)
                alturas.add(input.nextInt());

            for(int j = 0; j < muros-1; j++){
                if(alturas.get(j) < alturas.get(j+1))
                    saltosArriba++;
                else if(alturas.get(j) > alturas.get(j+1))
                    saltosAbajo++;
            }

            System.out.println(saltosArriba + " " + saltosAbajo);

        }

    }
}
