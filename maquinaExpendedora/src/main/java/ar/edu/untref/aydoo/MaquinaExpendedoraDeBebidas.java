package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {
	
	void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.setCantidadDeAzucar(cantidadAzucar);
		unVaso.setSustancia("cafe");
	}

	public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.setCantidadDeAzucar(cantidadAzucar);
		unVaso.setSustancia("te");
	}

}
