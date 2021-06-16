package volumen5;
import java.util.Scanner;


public class problema529 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Introduce numero de casos: ");
        int casos = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < casos; i++){
            int contadorI = 0;
            int contadorO = 0;
            String s = input.nextLine();
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j)=='I')
                    contadorI++;
                else
                    contadorO++;
            }
            
            System.out.println(contadorI>contadorO? contadorI : contadorO);
        }
        
    }
    
}
