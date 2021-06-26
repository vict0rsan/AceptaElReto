package volumen6;

import java.util.Scanner;

public class problema605 {
	
	public static void main(String [] args) //PERFECTO
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			int verano = 0;
			int invierno = 0;
			char c = input.next().charAt(0);
			
			if(c == '.')
				break;
			
			do {
				
				if(c == 'V')
					verano++;
				if(c == 'I')
					invierno++;
				c = input.next().charAt(0);
				
				
			}while(c != '.');
			
			if(verano > invierno)
				System.out.println("VERANO");
			else if(invierno > verano)
				System.out.println("INVIERNO");
			else
				System.out.println("EMPATE");
			
			
			
		}
	}
	

}
