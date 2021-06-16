package volumen3;

import java.util.*;

public class problema300 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] vocales = new char[]{'a', 'e', 'i', 'o', 'u'};

        //System.out.println("Introduce casos de prueba: ");
        int casos = input.nextInt();
        input.nextLine();

        for (int i = 0; i < casos; i++) {
            boolean[] check = new boolean[]{false, false, false, false, false};
            boolean comp = true;
            //System.out.println("Introduce una palabra: ");
            String s = input.nextLine();

            for (int j = 0; j < vocales.length; j++) {
                for (int k = 0; k < s.length(); k++) {
                   // System.out.println("vocal en j = " + vocales[j]);
                    if (s.charAt(k) == vocales[j]) {
                        check[j] = true;
                        break;
                    }
                    //System.out.print(s.charAt(k) + " = ");
                    //System.out.println(vocales[j]);
                }
            }
            for (int m = 0; m < check.length; m++) {
                if (check[m] == false) {
                    comp = false;
                    break;
//                System.out.println("check[m] = " + check[m]);
                }
            }
            System.out.println(comp ? "SI" : "NO");
        }
    }
}
