package volumen4;
import java.util.Scanner;

public class problema400 { //INACABADO
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("empieza");
            String dato = s.nextLine();
            String[]datos = dato.split(".");
            System.out.println(datos.length);
            for(String e : datos){
                System.out.println(e);
            }
        
        
    }
    
}
