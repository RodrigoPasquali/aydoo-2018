package ar.edu.untref.aydoo;

public class Salida {
	private double ganancia;
	private double impuesto;

	public Salida(double gananciaObtenida, double impuestoObtenido) {
		this.ganancia = gananciaObtenida;
		this.impuesto = impuestoObtenido;
	}
	
	@SuppressWarnings("static-access")
	public String generarSalida() {
		String cadenaSalida = "ganancia: " + "%.0f" + ", impuesto: " + "%.0f";
		return cadenaSalida.format(cadenaSalida, this.ganancia,this.impuesto);
	}
}										