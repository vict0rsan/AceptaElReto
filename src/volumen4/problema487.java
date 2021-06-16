package volumen4;

import java.util.Scanner;

public class problema487 { //CASOS DE PRUEBA BIEN PERO WRONG ANSWER
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		int casos = input.nextInt();
		
		for(int i = 0; i < casos; i++) {
			
			long horasQueDeseasRetroceder = input.nextLong();
			long horasAux;
			long numeroVueltasNecesarias;
			long vueltasExtra = 0;
			
			/*while(horasAux/3600!=0) {
				
				vueltasExtra = horasAux/3600;
				horasAux += vueltasExtra;
				horasAux -= 3600;
				counter++;
				
			}*/
			
			horasAux = horasQueDeseasRetroceder + horasQueDeseasRetroceder/3600;
			vueltasExtra = horasAux/3600;
			
			
			
			
			//numeroVueltasNecesarias = horasQueDeseasRetroceder + counter;
			numeroVueltasNecesarias = horasQueDeseasRetroceder + vueltasExtra;
			
			System.out.println(numeroVueltasNecesarias);
		}
		
		input.close();
	}

}
