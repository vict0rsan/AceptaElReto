package volumen6;
import java.util.*;

public class problema604 {
	public static void main(String [] args) { //PERFECTO
		
		Scanner input = new Scanner(System.in);
		
		int casos = input.nextInt();
		
		input.nextLine();
		
		for(int i = 0; i < casos; i++) {
			
			
			int puntosHonor = 0;
			int puntosDistribucion = 0;
			int corazones = 0;
			int diamantes = 0;
			int picas = 0;
			int treboles = 0;
			
			char [] cartas = new char [26];
			
			for(int j = 0; j < cartas.length; j++) {
				cartas[j] = input.next().charAt(0);
			}
			
			for(int j = 0; j < cartas.length; j++) {
				
				if(j%2 == 0) {
					switch(cartas[j]) {
					case 'A': 
						puntosHonor+=4;
						break;
					case 'K': 
						puntosHonor+=3;
						break;
					case 'Q': 
						puntosHonor+=2;
						break;
					case 'J': 
						puntosHonor+=1;
						break;
					default:
						break;
						
					}
					
				}else {
					
				}
					switch(cartas[j]) {
					case 'C': 
						corazones++;
						break;
					case 'D': 
						diamantes++;
						break;
					case 'P': 
						picas++;
						break;
					case 'T': 
						treboles++;
						break;
					default:
						break;
					
				}
			}
			
			if(corazones == 2)
				puntosDistribucion += 1;
			else if (corazones == 1)
				puntosDistribucion += 2;
			else if (corazones == 0) 
				puntosDistribucion += 3;
			
			if(diamantes == 2)
				puntosDistribucion += 1;
			else if (diamantes == 1)
				puntosDistribucion += 2;
			else if (diamantes == 0) 
				puntosDistribucion += 3;
			
			if(picas == 2)
				puntosDistribucion += 1;
			else if (picas == 1)
				puntosDistribucion += 2;
			else if (picas == 0) 
				puntosDistribucion += 3;
			
			if(treboles == 2)
				puntosDistribucion += 1;
			else if (treboles == 1)
				puntosDistribucion += 2;
			else if (treboles == 0) 
				puntosDistribucion += 3;
		
			System.out.println(puntosHonor + puntosDistribucion);
			
			
		}
	}

}
