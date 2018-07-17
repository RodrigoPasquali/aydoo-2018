package ar.edu.untref.aydoo;

import excepciones.ExcepcionDiasIncorrectos;
import excepciones.ExcepcionInteresIncorrecto;
import excepciones.ExcepcionMontoIncorrecto;
import excepciones.ExcepcionPlazoRealMayorAInicial;

public class PlazoFijoPrecancelable extends Inversion{	
	private double plazoInicial;
	private double plazoReal;
	private double interes;
	private double monto;

	public PlazoFijoPrecancelable(String inversionIngresada, double[] parametrosIngresados) {
		super(inversionIngresada, parametrosIngresados);
	}
	
	public double calcularGanancia() {
		if(this.getInversion().equals("pfp")) {
			this.obtenerParametros();
			double gananciaObtenida = 0;
			if(this.plazoInicial < 30) {
				throw new ExcepcionDiasIncorrectos();
			}
			if(this.plazoReal < 0) {
				throw new ExcepcionDiasIncorrectos();
			}
			if(this.monto <= 0) {
				throw new ExcepcionMontoIncorrecto();
			}
			if(this.interes <= 0) {
				throw new ExcepcionInteresIncorrecto();
			}
			if(this.plazoReal > plazoInicial) {
				throw new ExcepcionPlazoRealMayorAInicial();
			}
			
			gananciaObtenida = (this.monto * this.interes) / 100; 
			if(this.plazoReal < this.plazoInicial) {
				gananciaObtenida = gananciaObtenida/2;
			}
			return gananciaObtenida;
		} else {
			CompraDeDolares compraDolares = new CompraDeDolares(this.getInversion(), this.getParametrosEntrada());
			this.setInversionSiguiente(compraDolares); 
			return this.getInversionSiguiente().calcularGanancia();
		}
	}
	
	private void obtenerParametros() {
		this.plazoInicial = this.getParametrosEntrada()[0];
		this.plazoReal = this.getParametrosEntrada()[1];
		this.interes = this.getParametrosEntrada()[2];
		this.monto = this.getParametrosEntrada()[3];
	}
}
