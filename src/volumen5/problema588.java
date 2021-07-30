package volumen5;

import java.util.*;
import java.math.*;

public class problema588 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            BigInteger numero = new BigInteger(s.nextLine(), 10);

            if (numero.toString().equals("0")) {
                break;
            }

            String binary = numero.toString(2);
            binary= binary.replaceAll("0*$", "");
            String reversed = reverseString(binary);

            System.out.println(binary.equals(reversed)?"SI":"NO");
        }
    }

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}