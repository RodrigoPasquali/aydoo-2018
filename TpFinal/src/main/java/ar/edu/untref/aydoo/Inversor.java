package ar.edu.untref.aydoo;

public class Inversor {
	private double gananciaObtenida;
	
	public Inversor() {
		this.gananciaObtenida = 0;
	}
	
	public void realizarInversion(Inversion inversion) {
		inversion.calcularGanancia();
		this.gananciaObtenida = inversion.getGanancia();
	}
	
	public double getGanancias() {
		return this.gananciaObtenida;
	}
}
