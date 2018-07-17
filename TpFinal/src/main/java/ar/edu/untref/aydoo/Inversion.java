package ar.edu.untref.aydoo;

public abstract class Inversion {
	private Inversion inversionSiguiente;
	protected String inversion;
	private double gananciaObtenida;
	protected double monto;
	protected double[] parametros;
	
	public Inversion(String inversionIngresada, double[] parametrosIngresados) {
		this.inversion = inversionIngresada;
		this.parametros = parametrosIngresados;
	}
	
	public String getInversion() {
		return inversion;
	}
	
	public double[] getParametrosEntrada() {
		return this.parametros;
	}
	
	public abstract void calcularGanancia();
	
	protected void setInversionSiguiente(Inversion inversion) {
		this.inversionSiguiente = inversion;
	}
	
	protected Inversion getInversionSiguiente() {
		return this.inversionSiguiente;
	}
	
	protected void setGanancia(double ganancia) {
		this.gananciaObtenida = ganancia;
	}
	
	public double getGanancia() {
		return this.gananciaObtenida;
	}
}
