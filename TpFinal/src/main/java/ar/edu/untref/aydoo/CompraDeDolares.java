package ar.edu.untref.aydoo;

import excepciones.ExcepcionCotizacionDolarIncorrecta;
import excepciones.ExcepcionMontoMenorACotizacionDolar;

public class CompraDeDolares extends Inversion{	
	private double montoPesosInicial;
	private double cotizacionInicial;
	private double cotizacionFinal;

	public CompraDeDolares(double montoPesosInicialIngresado, double cotizacionInicialIngresado, double cotizacionFinalIngresado) {
		this.montoPesosInicial = montoPesosInicialIngresado;
		this.cotizacionInicial = cotizacionInicialIngresado;
		this.cotizacionFinal = cotizacionFinalIngresado;
	}
	
	public double calcularGanancia() {
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
		return gananciaObtenida;
	}
}
