package ar.edu.untref.aydoo;

public abstract class Inversion {
	private Inversion inversionSiguiente;
	private String tipoInversion;
	private double[] parametros;
	private String[] inversionRealizada;

	public Inversion(String[] inversionRealizada) {
		this.tipoInversion = inversionRealizada[0];
		this.inversionRealizada = inversionRealizada;
	}
	
	public String getTipoInversion() {
		return tipoInversion;
	}
	
	public double[] getParametrosEntrada() {
		return this.parametros;
	}
	
	public abstract double calcularGanancia();
	
	protected void setInversionSiguiente(Inversion inversion) {
		this.inversionSiguiente = inversion;
	}
	
	protected Inversion getInversionSiguiente() {
		return this.inversionSiguiente;
	}

	protected String[] getInversionRealizada() {
		return inversionRealizada;
	}	
}
