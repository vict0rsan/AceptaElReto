package volumen4;
import java.util.Scanner;

public class problema428 {

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Indtroduce el numero de casos de prueba: ");
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i++){
            System.out.println("Introduce numero de midiclorianos del joven Padawan: ");
            int midiclorianos = input.nextInt();
            String base5 = base5(midiclorianos);
            checkDarkSide(base5);
        }
    }

    public static String base5(int numero) {

        String resultado = "";
        int q = 0;
        int r = 0;
        do {
            q = numero / 5;
            r = numero % 5;
            System.out.println("r = " + r);
            
            
            if(r ==0 && q == 0)
                break;
            
            resultado = r + resultado;
            System.out.println("resultado = " + resultado);
            numero = q;
            
        } while (numero != 0 || r != 0);

        return resultado;
    }
    
    public static String checkDarkSide(String base5){
        String answer = null;
        int contador4s = 0;
        
        for(int i= 0; i<base5.length(); i++)
        if(base5.charAt(i)== '4')
            contador4s++;
        
        if(contador4s >= 2)
            System.out.println("Peligro maestro Jedi, este chico hará cosas terribles\n");
        else
            System.out.println("Futuro yoda\n");
        return answer;
    }
}
