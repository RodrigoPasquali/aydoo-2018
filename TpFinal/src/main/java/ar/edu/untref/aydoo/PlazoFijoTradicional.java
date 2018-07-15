package ar.edu.untref.aydoo;

import excepciones.ExcepcionDiasIncorrectos;

public class PlazoFijoTradicional {

	public double calcularGanancia(int plazo, double interes, double monto) {
		double gananciaObtenida = 0;
		if(plazo < 30) {
			throw new ExcepcionDiasIncorrectos();
		} else {
			gananciaObtenida = (monto * interes) / 100;
		}
		return gananciaObtenida;
	}

}
	