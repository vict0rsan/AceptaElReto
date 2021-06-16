package volumen4;
import java.util.Scanner;


public class problema480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        
        for(int i = 0; i < casos; i++){
            int uvas_compradas = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            
            int uvas_extra = uvas_compradas%b;
            
            if(uvas_extra >= a)
               uvas_extra = a;
            
            
            System.out.println((uvas_compradas/b)*a + uvas_extra);
        }
        
    }
}
