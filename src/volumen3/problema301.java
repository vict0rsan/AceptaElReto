package volumen3;
import java.util.Scanner;


public class problema301 { //hacer con programacion dinamica//como demonios se hace este ejercicio???
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce cuantos tipos de monedas vas a usar: ");
        int tipos = input.nextInt();
        int [] monedas = new int [tipos];
        int [] cantidades = new int [tipos];
        
        System.out.println("Introduce los tipos de monedas:");
        for(int i = 0; i < tipos; i++){
            monedas[i] = input.nextInt();
        }
        
        System.out.println("Introduce cuantas monedas tienes de cada tipo");
        for(int j = 0; j < tipos; j++){
            cantidades[j] = input.nextInt();
        }
        
        System.out.println("Introduce el precio del producto: ");
        int precio = input.nextInt();
        
        
    }
    
    public static void gdp(int n, int [] monedas){
        int res = monedas[monedas.length-1];
        for(int i = 0; i < monedas.length - 2; i++){
            res *= monedas[i];
        }
        
    }
    
    
}
