package volumen4;
import java.util.Scanner;

public class problema483 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        s.nextLine();
        
        for(int i = 0; i < casos; i ++){
            hora inicio = new hora(s.nextLine());
            hora fin = new hora(s.nextLine());
            int campanadas = s.nextInt();
            int campanada_deseada = s.nextInt();
            
            int segundos_totales1 = inicio.horas*3600 + inicio.minutos*60 + inicio.segundos;
            int segundos_totales2 = fin.horas*3600 + fin.minutos*60 + fin.segundos;
            int segundos_diferencia = segundos_totales1 - segundos_totales2;
            
            System.out.println(segundos_diferencia);
        }
        
        
        
    }
}
class hora{
    public int horas;
    public int minutos;
    public int segundos;
    
    public hora(String dato){
        int dosPuntos1 = dato.indexOf(':');
        int dosPuntos2 = dato.indexOf(':', dosPuntos1+1);
        
        this.horas = Integer.parseInt(dato.substring(0,dosPuntos1));
        this.minutos = Integer.parseInt(dato.substring(dosPuntos1+1, dosPuntos2));
        this.minutos = Integer.parseInt(dato.substring(dosPuntos2+1));
    }
}
