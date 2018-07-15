package ar.edu.untref.aydoo;

public class Inversor {
	private double gananciaObtenida;
	
	public Inversor() {
		this.gananciaObtenida = 0;
	}
	
	public void realizarInversion(PlazoFijoTradicional inversion, int plazo, int interes, int monto) {
		this.gananciaObtenida = inversion.calcularGanancia(plazo, interes, monto);
	}
	
	public double getGanancias() {
		return this.gananciaObtenida;
	}
}
