package volumen3;

import java.util.*;

public class problema386 {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList <EstudianteHambriento> estudiantes = new ArrayList();
		
		while(true) {
			
			int microondasUtilizados = 1;
			
			int personasQueUsanElMicroondas = input.nextInt();
			int tiempoEsperaPermitido = input.nextInt();
			
			if(personasQueUsanElMicroondas == 0 && tiempoEsperaPermitido == 0)
				break;
			
			for(int i = 0; i < personasQueUsanElMicroondas; i++){
				
				int tiempoLlegada = input.nextInt();
				int tiempoCalentarComida = input.nextInt();
				
				estudiantes.add(new EstudianteHambriento(tiempoLlegada, tiempoCalentarComida));
			}
			
			int sumaLlegadas = 0;
			int sumaEsperas = 0;
			
			
		}
	}
}

class EstudianteHambriento{
	
	private int tiempoLlegada;
	private int tiempoParaCalentarComida;
	
	public EstudianteHambriento(int tiempoLlegada, int tiempoParaCalentarComida) {
		
		this.tiempoLlegada = tiempoLlegada;
		this.tiempoParaCalentarComida = tiempoParaCalentarComida;
	}
	
	public int getTiempoLlegada() {
		return this.tiempoLlegada;
	}
	
	public int getTiempoParaCalentarComida() {
		return this.tiempoParaCalentarComida;
	}
}
