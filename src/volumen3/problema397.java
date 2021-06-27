package volumen3;

import java.util.*;

public class problema397 {
	
	public static void main (String [] args) { //TIME LIMIT EXCEEDED
		
		Scanner input = new Scanner(System.in);
		
		int casos = input.nextInt();
		
		for(int i = 0; i < casos; i++) {
			
			long sum = 0;
			
			int numero = input.nextInt();
			
			for(int j = 1; j <= numero; j++) 
				sum += j;
			
			System.out.println(sum%3==0 ? "SI":"NO");
			
		}
	}

}
