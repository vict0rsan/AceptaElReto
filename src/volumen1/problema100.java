package volumen1;

import java.util.Scanner;

public class problema100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce how many cases you want to check ");
        int casos = input.nextInt();
        input.nextLine();
        

        for (int i = 0; i < casos; i++) {
            int res = 0;
            int contador = 0;
            System.out.println("Introduce the number you want to analize: ");
            String numero = input.nextLine();
            
            do {
                if (Integer.parseInt(numero) == 6174) 
                    break;
                
                if((aMayor(numero) == aMenor(numero)) && (numero.length() == 3) ){
                    numero = numero + "0";
                }
                else if(aMayor(numero) == aMenor(numero)){
                    contador = 8;
                    break;
                }
                
                res = (aMayor(numero) - aMenor(numero));
                
                    contador++;
                    System.out.println("contador = " + contador);
                
                numero = Integer.toString(res);
                
            } while (res != 6174);
            
            System.out.println(contador);
        }
    }

    public static int aMayor(String s) {
        int resultado;
        int l = s.length();
        char[] ch = new char[l];
        String res = "";

        for (int i = 0; i < l; i++) {
            ch[i] = s.charAt(i);
        }

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - 1; j++) {
                char c1 = ch[j];
                char c2 = ch[j + 1];
                int n1 = Character.getNumericValue(c1);
                int n2 = Character.getNumericValue(c2);
                if (n1 < n2) {
                    ch[j] = c2;
                    ch[j + 1] = c1;
                }
            }
        }
        for (int i = 0; i < l; i++) {
            res = res + ch[i];
        }
        resultado = Integer.parseInt(res);

        return resultado;
    }

    public static int aMenor(String s) {
        int resultado;
        int l = s.length();
        char[] ch = new char[l];
        String res = "";

        for (int i = 0; i < l; i++) {
            ch[i] = s.charAt(i);
        }

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - 1; j++) {
                char c1 = ch[j];
                char c2 = ch[j + 1];
                int n1 = Character.getNumericValue(c1);
                int n2 = Character.getNumericValue(c2);
                if (n1 > n2) {
                    ch[j] = c2;
                    ch[j + 1] = c1;
                }
            }
        }
        for (int i = 0; i < l; i++) {
            res = res + ch[i];
        }
        resultado = Integer.parseInt(res);

        return resultado;
    }

}
