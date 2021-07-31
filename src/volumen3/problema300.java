package volumen3;

import java.util.*;

public class problema300 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char[] vocales = new char[]{'a', 'e', 'i', 'o', 'u'};

        int casos = input.nextInt();
        input.nextLine();

        for (int i = 0; i < casos; i++) {

            boolean[] check = new boolean[]{false, false, false, false, false};
            boolean comp = true;
            String s = input.nextLine();

            for (int j = 0; j < vocales.length; j++) {
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == vocales[j]) {
                        check[j] = true;
                        break;
                    }
                }
            }

            for (int m = 0; m < check.length; m++) {
                if (check[m] == false) {
                    comp = false;
                    break;
                }
            }

            System.out.println(comp ? "SI" : "NO");
        }
    }
}
