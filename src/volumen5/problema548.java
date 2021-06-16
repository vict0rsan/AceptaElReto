package volumen5;

import java.util.*;

public class problema548 {
	public static void main(String [] args) { //FUNCIONA CORRECTO PERO RUN-TIME ERROR
		
		Scanner input = new Scanner(System.in);
		
		ArrayList <Integer> tramosYparadas = new ArrayList();
		ArrayList <Integer> tiempoEntreTramos = new ArrayList();
		ArrayList <Integer> guardadoDeSumas = new ArrayList();
		
		
		
		while(true) {
			
			int tramos = input.nextInt();
			int paradas = input.nextInt();
			
			tramosYparadas.add(tramos);
			tramosYparadas.add(paradas);
			
			for(int i = 0; i < tramos; i++) {
				
				int tiempoEspera = input.nextInt();
				tiempoEntreTramos.add(tiempoEspera);
			}
			
			int sumaElementos = sumaElementosArray(tiempoEntreTramos);
			
			try {
			
				double tiempoMedioParadas = sumaElementos/((double)paradas);
			
				int suma = 0;
			
				for(int i= 0; i < tiempoEntreTramos.size(); i++) {
				
					if(suma + tiempoEntreTramos.get(i) >= tiempoMedioParadas) {
						guardadoDeSumas.add(suma);
						suma = 0;
					}
				
					suma += tiempoEntreTramos.get(i);
				}
			
				int maximaCantidad = Collections.max(guardadoDeSumas);
				System.out.println(maximaCantidad);
			}
			
			catch(Exception e) {
				
				System.out.println(sumaElementosArray(tiempoEntreTramos));
			}
			
			finally {
				tramosYparadas.clear();
				tiempoEntreTramos.clear();
				guardadoDeSumas.clear();
			}
		}
		
		
		
		
		
	}
	
	public static int sumaElementosArray(ArrayList <Integer> tiempoEspera) {
		
		int sum = 0;
		
		for(int num : tiempoEspera) {
			sum+=num;
		}
		
		return sum;
	}
	

}
