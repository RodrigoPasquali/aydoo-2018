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
		this.plazoInicial = parametrosIngresados[0];
		this.plazoReal = parametrosIngresados[1];
		this.interes = parametrosIngresados[2];
		this.monto = parametrosIngresados[3];
	}
	
	public void calcularGanancia() {
		if(this.getInversion().equals("pfp")) {
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
			this.setGanancia(gananciaObtenida);
		} else {
			CompraDeDolares compraDolares = new CompraDeDolares(this.getInversion(), this.getParametrosEntrada());
			this.setInversionSiguiente(compraDolares); 
			this.getInversionSiguiente().calcularGanancia();
		}
	}
}
