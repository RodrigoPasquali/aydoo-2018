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
	}

	@Override
	public double calcularGanancia() {
		if(this.getInversion().equals("pft")) {
			this.obtenerParametros();
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
			
			double porcentajeEnDias = (plazo / 365);
			return gananciaObtenida = ((monto * interes) / 100) * porcentajeEnDias;
		} else {
			PlazoFijoPrecancelable plazoFijo = new PlazoFijoPrecancelable(this.getInversion(), this.getParametrosEntrada());
			this.setInversionSiguiente(plazoFijo); 
			return this.getInversionSiguiente().calcularGanancia();
		}
	}
		
	private void obtenerParametros() {
		this.plazo = this.getParametrosEntrada()[0];
		this.interes = this.getParametrosEntrada()[1];
		this.monto = this.getParametrosEntrada()[2];
	}
}
	