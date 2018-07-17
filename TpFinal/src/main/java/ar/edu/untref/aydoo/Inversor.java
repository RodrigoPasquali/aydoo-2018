package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Inversor {
	private List<Inversion> inversiones;
	
	public Inversor() {
		this.inversiones = new LinkedList<Inversion>();
	}
	
	public void realizarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public double calcularGananciasObtenidas() {
		double gananciaObtenida = 0;
		for(int i = 0; i < this.inversiones.size(); i++) {
			gananciaObtenida = gananciaObtenida + this.inversiones.get(i).calcularGanancia();					
		}
		return gananciaObtenida;
	}	
}
