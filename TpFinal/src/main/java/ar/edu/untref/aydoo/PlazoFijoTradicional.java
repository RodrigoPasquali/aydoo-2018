package ar.edu.untref.aydoo;

import excepciones.ExcepcionDiasIncorrectos;
import excepciones.ExcepcionInteresIncorrecto;
import excepciones.ExcepcionMontoIncorrecto;

public class PlazoFijoTradicional extends Inversion{
	private double plazo;
	private double interes;
	private double monto;
	
	public PlazoFijoTradicional(String inversionIngresada, double[] parametrosIngresados) {
		super(inversionIngresada, parametrosIngresados);
		this.plazo = parametrosIngresados[0];
		this.interes = parametrosIngresados[1];
		this.monto = parametrosIngresados[2];
		PlazoFijoPrecancelable plazoFijo = new PlazoFijoPrecancelable(inversionIngresada, parametrosIngresados);
		this.setInversionSiguiente(plazoFijo); 
	}

	@Override
	public void calcularGanancia() {
		if(this.getInversion().equals("pft")) {
			double gananciaObtenida = 0;
			if(plazo < 30) {
				throw new ExcepcionDiasIncorrectos();
			}
			if(monto <= 0) {
				throw new ExcepcionMontoIncorrecto();
			}
			if(interes <= 0) {
				throw new ExcepcionInteresIncorrecto();
			}
			
			double porcentajeEnDias = (this.plazo / 365);
			gananciaObtenida = ((this.monto * this.interes) / 100) * porcentajeEnDias;
			this.setGanancia(gananciaObtenida);
		} else {
			//this.inversionSiguiente.calcularGanancia();
		}
	}
}
	