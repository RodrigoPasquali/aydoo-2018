package ar.edu.untref.aydoo;

public class PlazoFijoTradicional {

	public double calcularGanancia(int plazo, double interes, double monto) {
		double gananciaObtenida = 0;
		if(plazo < 0) {
			//arrojar expecion
		} else {
			gananciaObtenida = (monto * interes) / 100;
		}
		return gananciaObtenida;
	}

}
	