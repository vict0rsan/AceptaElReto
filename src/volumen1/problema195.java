package volumen1;

import java.util.*;

public class problema195 { //PERFECTO - RUN TIME ERROR

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        List <Double> notas = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            double num = input.nextDouble();
            notas.add(num);
        }

        double max1 = Collections.max(notas);
        notas.remove(max1);
        double max2 = Collections.max(notas);
        notas.remove(max2);

        double min1 = Collections.min(notas);
        notas.remove(min1);
        double min2 = Collections.min(notas);
        notas.remove(min2);

        double suma = notas.get(0) + notas.get(1) + notas.get(2);

        int puntuacion = (int) Math.round(suma*2);

        System.out.println(puntuacion);

        notas.clear();
    }
}
