package volumen4;

import java.util.*;

public class problema441 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Character> list = new ArrayList();

        while (s.hasNext()) {
            int contador = 0;
            String numero = s.nextLine();
            numero = numero.replaceAll("\\p{Punct}", "");
            int num = Integer.parseInt(numero);
            num += 1;
            numero = Integer.toString(num);

            for (int i = 0; i < numero.length(); i++) {
                list.add(numero.charAt(i));
            }
            for (int i = list.size()-1; i >= 0; i--) {
                contador++;
                if (contador % 3 == 0 || list.listIterator().hasPrevious()) {
                    list.add(i, '.');
                }
            }

            for (char c : list) {
                System.out.print(c);
            }
            System.out.println("");
            list.clear();
        }

    }

}
