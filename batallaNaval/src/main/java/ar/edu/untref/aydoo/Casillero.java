package ar.edu.untref.aydoo;

public class Casillero {

	private Barco barco = null;

	public boolean hayBarco() {
		
		return this.barco != null;
	}

	public void ponerBarco(Barco unBarco){
		this.barco = unBarco;
	}

}
