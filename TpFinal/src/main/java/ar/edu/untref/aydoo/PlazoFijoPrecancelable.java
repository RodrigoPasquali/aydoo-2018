package ar.edu.untref.aydoo;

import excepciones.ExcepcionDiasIncorrectos;
import excepciones.ExcepcionInteresIncorrecto;
import excepciones.ExcepcionMontoIncorrecto;
import excepciones.ExcepcionPlazoRealMayorAInicial;

public class PlazoFijoPrecancelable extends Inversion{	
	private int plazoInicial;
	private int plazoReal;
	private double interes;
	private double monto;

	public PlazoFijoPrecancelable(int plazoInicialIngresado, int plazoRealIngresado, double interesIngresado, double montoIngresado) {
		this.plazoInicial = plazoInicialIngresado;
		this.plazoReal = plazoRealIngresado;
		this.interes = interesIngresado;
		this.monto = montoIngresado;
	}
	
	public double calcularGanancia() {
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
		if(this.plazoInicial < this.plazoReal) {
			gananciaObtenida = gananciaObtenida/2;
		}
		return gananciaObtenida;
	}
}
