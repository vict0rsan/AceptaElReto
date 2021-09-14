package volumen1;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class problema185 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, String> ingredientesBuenos = new HashMap<>();
        Map<String, String> ingredientesMalos = new HashMap<>();

        while (true) {

            int casos = input.nextInt();

            if (casos == 0)
                break;

            input.nextLine();

            for (int i = 0; i < casos; i++) {

                String ingredientes = input.nextLine();

                String[] datos = ingredientes.split(" ");
                datos[0] = datos[0].substring(0, 2);

                if (datos[0].equals("SI")) {
                    for (int j = 1; j < datos.length - 1; j++) {
                        ingredientesBuenos.put(datos[j], "SI");
                        ingredientesMalos.remove(datos[j]);
                    }
                } else {
                    for (int j = 1; j < datos.length - 1; j++) {
                        if (ingredientesBuenos.get(datos[j]) == null)
                            ingredientesMalos.put(datos[j], "NO");
                    }
                }
            }

            String ingredientes = "";

            for (Map.Entry<String, String> entry : ingredientesMalos.entrySet())
                ingredientes += entry.getKey() + " ";

            String[] alimentosNoGustanBebe = ingredientes.split(" ");
            Arrays.sort(alimentosNoGustanBebe);
            String answer = "";
            for (String s : alimentosNoGustanBebe)
                answer += s + " ";

            System.out.println(answer.trim());
            ingredientesBuenos.clear();
            ingredientesMalos.clear();
        }
    }
}
