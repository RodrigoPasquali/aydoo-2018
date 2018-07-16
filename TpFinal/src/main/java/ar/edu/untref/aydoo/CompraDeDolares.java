package ar.edu.untref.aydoo;

public class CompraDeDolares {
	public double calcularGanancia(double montoPesosInicial, double cotizacionInicial, double cotizacionFinal) {
		double gananciaObtenida = 0;		
		double montoDolares = montoPesosInicial / cotizacionInicial;
		double montoPesosFinal = montoDolares * cotizacionFinal;
		gananciaObtenida = montoPesosFinal - montoPesosInicial;
		return gananciaObtenida;
	}
}
