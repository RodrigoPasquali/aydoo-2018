package ar.edu.untref.aydoo;

import excepciones.ExcepcionCotizacionDolarIncorrecta;
import excepciones.ExcepcionMontoMenorACotizacionDolar;

public class CompraDeDolares extends Inversion{	
	private double montoPesosInicial;
	private double cotizacionInicial;
	private double cotizacionFinal;

	public CompraDeDolares(String inversionIngresada, double[] parametrosIngresados) {
		super(inversionIngresada, parametrosIngresados);
		this.montoPesosInicial = parametrosIngresados[0];
		this.cotizacionInicial = parametrosIngresados[1];
		this.cotizacionFinal = parametrosIngresados[2];
	}
	
	public void calcularGanancia() {
		if(this.getInversion().equals("dol")) {
			double gananciaObtenida = 0;	
			if(this.montoPesosInicial < this.cotizacionInicial) {
				throw new ExcepcionMontoMenorACotizacionDolar();
			}
			if(this.cotizacionInicial <= 0 || this.cotizacionFinal <= 0) {
				throw new ExcepcionCotizacionDolarIncorrecta();
			}
			double montoDolares = this.montoPesosInicial / this.cotizacionInicial;
			double montoPesosFinal = montoDolares * this.cotizacionFinal;
			gananciaObtenida = montoPesosFinal - montoPesosInicial;
			this.setGanancia(gananciaObtenida);			
		}
	}
}
