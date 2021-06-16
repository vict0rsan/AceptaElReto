package volumen4;
import java.util.*;


public class problema437 {//pendiente. hacer antes del concurso
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        s.nextLine();
        
        for(int i = 0; i < casos; i++){
            String hora = s.nextLine();
            String[]datos = hora.split(":");
            
            int horas = Integer.parseInt(datos[0]);
            int minutos = Integer.parseInt(datos[1]); 
            int segundos = Integer.parseInt(datos[2]);
            
            int t_segundos = horas*3600 + minutos*60 + segundos;
            
            
            int horaso = t_segundos/3600;
            double minutoso = t_segundos%3600;       
            
            System.out.printf("%02d:%02d:%02d\n", horaso, minutoso);
            
        }
    }
    
}
