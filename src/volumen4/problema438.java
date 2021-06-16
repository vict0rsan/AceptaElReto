package volumen4;
import java.util.*;

public class problema438 { //Esta bien pero el juez en linea me lo marca como WRONG ANSWER POR QUE?
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext()){
            String line = s.nextLine();
            line = line.replaceAll("\\s","");
            line = line.replaceAll("\\d", "");
            int longitud = line.length();
            line = line.replaceAll("\\p{Punct}", "");
            int longitud2 = line.length();
            int eliminados = longitud - longitud2;
            
            System.out.println(eliminados<=longitud2?"escrito":"ESGRITO");
        }
    }
    
}
