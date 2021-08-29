package volumen1;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class problema122 { //PERFECTO - RUN TIME ERROR

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> alturas = new ArrayList<>();
        List<Integer> posicionesIniciales = new ArrayList<>();
        List<Integer> tramosPlanos = new ArrayList<>();

        while (true) {

            int altura = input.nextInt();

            if (altura == -1)
                break;

            int posicionInicial = 0;
            int tramosPlano = 0;
            boolean planicie = false;
            boolean posActivada = false;

            while (altura != -1) {
                alturas.add(altura);
                altura = input.nextInt();
            }

            for (int i = 0; i < alturas.size() - 1; i++) {
                if (alturas.get(i) == alturas.get(i + 1)) {
                    planicie = true;
                    tramosPlano++;
                    if (posActivada == false) {
                        posicionInicial = i;
                        posicionesIniciales.add(posicionInicial);
                        posActivada = true;
                    }
                    if (i == alturas.size() - 2)
                        tramosPlanos.add(tramosPlano);

                } else {
                    if (posicionInicial != 0) {
                        tramosPlanos.add(tramosPlano);
                        tramosPlano = 0;
                        posicionInicial = 0;
                        posActivada = false;
                    }
                }
            }

            if (planicie) {
                tramosPlano = Collections.max(tramosPlanos);
                int posicion = tramosPlanos.indexOf(tramosPlano);
                posicionInicial = posicionesIniciales.get(posicion);
                System.out.println(posicionInicial + " " + tramosPlano);
            }
            else
                System.out.println("HOY NO COMEN");

            alturas.clear();
            posicionesIniciales.clear();
            tramosPlanos.clear();
        }
    }
}
