package volumen5;
import java.util.Scanner;
import java.util.HashMap;

public class problema578 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            
             HashMap<String, Integer> list = new HashMap<String, Integer>();
             int numeroProductos = input.nextInt();

             if(numeroProductos == 0)
                 break;

             input.nextLine();

             for(int i = 0; i < numeroProductos; i++) {
                 String producto = input.nextLine();
                 String productoMinusculas = producto.toLowerCase();
                 list.put(productoMinusculas, 1);
             }
            System.out.println(list.size());
        }
    }
}
