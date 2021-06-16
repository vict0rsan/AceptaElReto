package volumen3;
import java.util.*;

public class problema378 {
    public static void main(String[] args) { //por que me sale wrong answer. casos de prueba bien
        Scanner s = new Scanner(System.in);
        List<loteriaCiudad> lista = new ArrayList();
        
          
        while(true){
            
            int ciudades = s.nextInt();
            
            if(ciudades == 0)
                break;
            
            for(int i = 0; i < ciudades; i++){
                lista.add(new loteriaCiudad(s.nextInt(), s.nextInt()));
            }
            
            int max_precio = 0;
            int posicioni = 0;
            for(int i = 0; i < ciudades; i++){
                if(max_precio < lista.get(i).dinero_gastado){
                    max_precio = lista.get(i).dinero_gastado;
                    posicioni = i;
                }
            }
            System.out.println("max_precio = " + max_precio);
            System.out.println("posicioni = " + posicioni);
            
            int max_premios = 0;
            int posicionj = 0;
            for(int i = 0; i < ciudades; i++){
                if(max_premios < lista.get(i).premios_obtenidos){
                    max_premios = lista.get(i).premios_obtenidos;
                    posicionj = i;
                }
            }
            System.out.println("max_premios = " + max_premios);
            System.out.println("posicionj = " + posicionj);
            
            
            
            lista.clear();
            System.out.println(posicionj==posicioni?"SI":"NO");
        }
                
                
                
    }
    
}
class loteriaCiudad{
    public int dinero_gastado;
    public int premios_obtenidos;
    
    public loteriaCiudad(int dinero, int premios){
        this.dinero_gastado = dinero;
        this.premios_obtenidos = premios;
    }
}
