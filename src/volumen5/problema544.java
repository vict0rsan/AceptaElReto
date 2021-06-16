package volumen5;
import java.util.*;


public class problema544 { //Perfecto pero runtime error
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Long> pesosUvas = new ArrayList();
        
        while(s.hasNext()){
            long nUvas = s.nextInt();
            long pMax = s.nextInt();
            
            for(long i = 0; i < nUvas; i++){
                pesosUvas.add(s.nextLong());
            }
            
            Collections.sort(pesosUvas);
            
            for(int i = pesosUvas.size()-1; i >= 0; i--){
                //System.out.println("peso i:"+pesosUvas.get(i));
                for(int j = pesosUvas.size()-2; j >= 0; j--){
                   // System.out.println("peso j:" + pesosUvas.get(j));
                    if(pesosUvas.get(i)+pesosUvas.get(j)>pMax){
                        pesosUvas.remove(i);
                        //System.out.println("Eliminando objeto");
                        break;
                    }
                }
            }
            
            
            System.out.println(pesosUvas.size());
            pesosUvas.clear();
        }
    }
    
}
