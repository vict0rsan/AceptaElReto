package volumen2;
import java.util.Scanner;


public class problema252 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String s;
        
        do{
            System.out.println("Introduce un texto: ");
            s = input.nextLine();
            if(s.equals("XXX")==true)
                break;
            else
                palindromo(s);
            
        }while(s.equals("XXX")!=true);
        
        System.out.println("PROGRAMA FINALIZADO");
    }
    
    public static void palindromo(String s){
        String blank = s.replaceAll("\\s+", "");
//        System.out.println("blank = " + blank);
        int l = blank.length();
        boolean check = true;
        for(int i = 0; i < l; i++){
            if(blank.charAt(i)!= blank.charAt(l-i-1))
            check = false;
        }
        System.out.println("Palindromo: " + ((check==true)? "YES":"NO"));
        
        
    }
    
}
