package ar.edu.untref.aydoo;

public class Salida {
	private double ganancia;
	private double impuesto;

	public Salida(double gananciaObtenida, double impuestoObtenido) {
		this.ganancia = gananciaObtenida;
		this.impuesto = impuestoObtenido;
	}
	
	public String generarSalida() {
		String cadenaSalida = "ganancia: " + this.ganancia + ", impuesto: " + this.impuesto;
		return cadenaSalida;
	}
}