package volumen5;
import java.util.Scanner;

public class problema577 {
	
	public static void main (String [] args) {  //PERFECTO
		
		
		Scanner input = new Scanner(System.in);
		
		int casosDePrueba = input.nextInt();
		
		for(int i = 0; i < casosDePrueba; i++) {
			
			int cucharadasMafalda = input.nextInt();
			int cucharadasPadre = input.nextInt();
			int cucharadasReales = input.nextInt();
			int posiblesCombinaciones = 0;
				
				
			for(int j = cucharadasMafalda; j <= cucharadasReales; j++) {
				
				for(int k = cucharadasPadre; k >= 0; k--) {
					
					if(k+j == cucharadasReales)
							posiblesCombinaciones++;
					
				}
			}
				
			System.out.println(posiblesCombinaciones);	
			
			
			
		}
		
	}

}
