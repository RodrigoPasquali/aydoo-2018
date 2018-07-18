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

	public PlazoFijoPrecancelable(String[] inversionIngresada) {
		super(inversionIngresada);
	}

	public double calcularGanancia() {
		if(this.getTipoInversion().equals("pfp")) {
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
			CompraDeDolares compraDolares = new CompraDeDolares(this.getInversionRealizada());
			this.setInversionSiguiente(compraDolares); 
			return this.getInversionSiguiente().calcularGanancia();
		}
	}
	
	private void obtenerParametros() {
		this.plazoInicial = Double.parseDouble(this.getInversionRealizada()[1]);
		this.plazoReal = Double.parseDouble(this.getInversionRealizada()[2]);
		this.interes = Double.parseDouble(this.getInversionRealizada()[3]);
		this.monto = Double.parseDouble(this.getInversionRealizada()[4]);
	}
}
