package volumen1;

import java.util.Scanner;

public class problema123 {

    public static void main(String[] args) { //PERFECTO - WRONG ANSWER SIN MOTIVO

        Scanner input = new Scanner(System.in);

        String[] pronombres = {"yo", "tu", "el", "nosotros", "vosotros", "ellos"};
        String[] presente = {"o", "as", "a", "amos", "ais", "an"};
        String[] presente2 = {"o", "es", "e", "emos", "eis", "en"};
        String[] presente3 = {"o", "es", "e", "imos", "is", "en"};
        String[] pasado = {"e", "aste", "o", "amos", "asteis", "aron"};
        String[] pasado2 = {"i", "iste", "io", "imos", "isteis", "ieron"};
        String[] futuro = {"are", "aras", "ara", "aremos", "areis", "aran"};
        String[] futuro2 = {"ere", "eras", "era", "eremos", "ereis", "eran"};
        String[] futuro3 = {"ire", "iras", "ira", "iremos", "ireis", "iran"};

        while(true) {
            boolean ar = false;
            boolean er = false;
            boolean ir = false;

            String texto = input.nextLine();
            String[] datos = texto.split(" ");
            String verbo = datos[0];
            String tiempoVerbal = datos[1];

            if (tiempoVerbal.equals("T"))
                break;

            String raiz = verbo.substring(0, verbo.length() - 2);

            if (verbo.contains("ar"))
                ar = true;
            else if (verbo.contains("er"))
                er = true;
            else
                ir = true;

            String[] res = new String[6];

            if (ar && tiempoVerbal.equals("A")) {
                for (int i = 0; i < 6; i++)
                    res[i] = pronombres[i] + " " + raiz + presente[i];
            } else if (ar && tiempoVerbal.equals("P")) {
                for (int i = 0; i < 6; i++)
                    res[i] = pronombres[i] + " " + raiz + pasado[i];
            } else if (ar && tiempoVerbal.equals("F")) {
                for (int i = 0; i < 6; i++)
                    res[i] = pronombres[i] + " " + raiz + futuro[i];
            } else if (er && tiempoVerbal.equals("A")) {
                for (int i = 0; i < 6; i++)
                    res[i] = pronombres[i] + " " + raiz + presente2[i];
            } else if (er && tiempoVerbal.equals("P")) {
                for (int i = 0; i < 6; i++)
                    res[i] = pronombres[i] + " " + raiz + pasado2[i];
            } else if (er && tiempoVerbal.equals("F")) {
                for (int i = 0; i < 6; i++)
                    res[i] = pronombres[i] + " " + raiz + futuro2[i];
            } else if (ir && tiempoVerbal.equals("A")) {
                for (int i = 0; i < 6; i++)
                    res[i] = pronombres[i] + " " + raiz + presente3[i];
            } else if (ir && tiempoVerbal.equals("P")) {
                for (int i = 0; i < 6; i++)
                    res[i] = pronombres[i] + " " + raiz + pasado2[i];
            } else if(ir && tiempoVerbal.equals("F")) {
                for (int i = 0; i < 6; i++)
                    res[i] = pronombres[i] + " " + raiz + futuro3[i];
            }

            for (String s : res) {
                System.out.println(s);
            }
        }


    }
}
