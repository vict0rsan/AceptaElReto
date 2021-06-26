package volumen6;
import java.util.Scanner;

public class problema607 {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int casos = input.nextInt();
		
		for(int i = 0; i < casos; i++) {
			
			int copiasNecesarias = input.nextInt();
			int fotocopias = 0;
			
			while(Math.pow(2.0, (double) fotocopias) < copiasNecesarias) {
				fotocopias++;
			}
			
			System.out.println(fotocopias);
			
		
		
	}

}
}
