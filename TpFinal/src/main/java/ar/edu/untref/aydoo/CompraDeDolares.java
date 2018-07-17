package ar.edu.untref.aydoo;

import excepciones.ExcepcionCotizacionDolarIncorrecta;
import excepciones.ExcepcionMontoMenorACotizacionDolar;

public class CompraDeDolares extends Inversion{	
	private double montoPesosInicial;
	private double cotizacionInicial;
	private double cotizacionFinal;

	public CompraDeDolares(String inversionIngresada, double[] parametrosIngresados) {
		super(inversionIngresada, parametrosIngresados);
	}
	
	public double calcularGanancia() {
		double gananciaObtenida = 0;	
		if(this.getInversion().equals("dol")) {
			this.obtenerParametros();
			if(this.montoPesosInicial < this.cotizacionInicial) {
				throw new ExcepcionMontoMenorACotizacionDolar();
			}
			if(this.cotizacionInicial <= 0 || this.cotizacionFinal <= 0) {
				throw new ExcepcionCotizacionDolarIncorrecta();
			}
			double montoDolares = this.montoPesosInicial / this.cotizacionInicial;
			double montoPesosFinal = montoDolares * this.cotizacionFinal;
			gananciaObtenida = montoPesosFinal - montoPesosInicial;
		}
		return gananciaObtenida;
	}
	
	private void obtenerParametros() {
		this.montoPesosInicial = this.getParametrosEntrada()[0];
		this.cotizacionInicial = this.getParametrosEntrada()[1];
		this.cotizacionFinal = this.getParametrosEntrada()[2];
	}
}
