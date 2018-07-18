package ar.edu.untref.aydoo;

import excepciones.ExcepcionCotizacionDolarIncorrecta;
import excepciones.ExcepcionMontoMenorACotizacionDolar;

public class CompraDeDolares extends Inversion{	
	private double montoPesosInicial;
	private double cotizacionInicial;
	private double cotizacionFinal;

	public CompraDeDolares(String[] inversionIngresada) {
		super(inversionIngresada);
	}
	
	public double calcularGanancia() {
		double gananciaObtenida = 0;	
		if(this.getTipoInversion().equals("dol")) {
			this.obtenerParametros();
			if(this.montoPesosInicial < this.cotizacionInicial) {
				throw new ExcepcionMontoMenorACotizacionDolar();
			}
			if(this.cotizacionInicial <= 0 || this.cotizacionFinal <= 0) {
				throw new ExcepcionCotizacionDolarIncorrecta();
			}
			double montoDolares = this.montoPesosInicial / this.cotizacionInicial;
			double montoPesosFinal = montoDolares * this.cotizacionFinal;
			return gananciaObtenida = montoPesosFinal - montoPesosInicial;
		} else {
			InversionNoValida compraDolares = new InversionNoValida(this.getInversionRealizada());
			this.setInversionSiguiente(compraDolares); 
			return this.getInversionSiguiente().calcularGanancia();
		}
	}
	
	private void obtenerParametros() {
		this.montoPesosInicial = Double.parseDouble(this.getInversionRealizada()[1]);
		this.cotizacionInicial = Double.parseDouble(this.getInversionRealizada()[2]);
		this.cotizacionFinal = Double.parseDouble(this.getInversionRealizada()[3]);
	}
}
