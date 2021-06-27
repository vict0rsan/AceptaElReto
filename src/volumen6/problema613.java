package volumen6;
import java.util.Scanner;

public class problema613 {
	
	public static void main (String [] args) { //PERFECTO
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			int numero = input.nextInt();
			
			int i = 1;
			int num = 1;
			
			while(true) {
				
				//System.out.println(i);
				num = numero * i++;
				//System.out.println(num);
				
				
				String unos = Integer.toString(num);
				String res = unos.replaceAll("1", " ");
				res = res.replaceAll("\\s+","");
				//if(res.equals("111"));
				//System.out.println(res.length());
				
				//System.out.println();
				
				
				if(res.length() == 0) {
					System.out.println(unos.length());
					break;
				}
					
				
			}
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
