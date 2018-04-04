package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {
	private HacedorDeCafeConLeche hacedor;
	private Azucarero azucarero;
	
	public MaquinaExpendedoraDeBebidas() {
		this.hacedor = new HacedorDeCafeConLeche();
		this.azucarero = new Azucarero();
	}
	
	void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		this.hacedor.prepararEnEsteVaso(unVaso);
		this.azucarero.agregarAzucar(unVaso, cantidadAzucar);
	}

	public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.setCantidadDeAzucar(cantidadAzucar);
		unVaso.setSustancia("te");
	}

}
