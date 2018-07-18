package ar.edu.untref.aydoo;

import excepciones.ExcepcionDiasIncorrectos;
import excepciones.ExcepcionInteresIncorrecto;
import excepciones.ExcepcionMontoIncorrecto;
import excepciones.ExcepcionParametroNoNumerico;

public class PlazoFijoTradicional extends Inversion{
	private double plazo;
	private double interes;
	private double monto;

	public PlazoFijoTradicional(String[] inversionIngresada) {
		super(inversionIngresada);
	}

	@Override
	public double calcularGanancia() {
		if(this.getTipoInversion().equals("pft")) {
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
			PlazoFijoPrecancelable plazoFijo = new PlazoFijoPrecancelable(this.getInversionRealizada());
			this.setInversionSiguiente(plazoFijo); 
			return this.getInversionSiguiente().calcularGanancia();
		}
	}

	private void obtenerParametros() {
		try {
			this.plazo = Double.parseDouble(this.getInversionRealizada()[1]);
			this.interes = Double.parseDouble(this.getInversionRealizada()[2]);
			this.monto = Double.parseDouble(this.getInversionRealizada()[3]);			
		} catch (Exception e){
			throw new ExcepcionParametroNoNumerico();
		}
	}
}
	