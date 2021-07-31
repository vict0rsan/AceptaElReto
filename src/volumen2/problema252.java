package volumen2;
import java.util.Scanner;


public class problema252 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String texto;
        
        while(true){

            texto = input.nextLine();

            if(texto.equals("XXX"))
                break;

            palindromo(texto);
            
        }
    }
    
    public static void palindromo(String s){

        String textWihoutBlankSpaces = s.replaceAll("\\s+", "");
        textWihoutBlankSpaces = textWihoutBlankSpaces.toLowerCase();
        int l = textWihoutBlankSpaces.length();
        boolean check = true;

        for(int i = 0; i < l; i++){
            if(textWihoutBlankSpaces.charAt(i)!= textWihoutBlankSpaces.charAt(l-i-1))
            check = false;
        }

        System.out.println(check ? "SI":"NO");
    }
    
}
