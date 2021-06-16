package volumen1;

import java.util.*;
import java.util.Map.Entry;

public class problema186 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;
        HashMap<Integer, Integer> map = new HashMap();
        String datos1 = input.nextLine();
        int[] data = new int[2];
        int i = 0;
        while (input.hasNextInt()) {
            data[i] = input.nextInt();
            i++;
        }

        for (int j = 0; j < data[1]; j++) {
            String datos2 = input.nextLine();
            if (map.get(Character.getNumericValue(datos2.charAt(0))) == null) {
                map.put(Character.getNumericValue(datos2.charAt(0)), map.get(Character.getNumericValue(datos2.charAt(0)) + 1));

            } else {
                map.put(Character.getNumericValue(datos2.charAt(0)), 1);
            }

        }
        int maxValueInMap =  0;

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                contador++;
                if (contador > 1) {
                    System.out.println("EMPATE");
                    break;
                   
                }
                else
                    System.out.println(entry.getKey());
            }

        }
    }

}
