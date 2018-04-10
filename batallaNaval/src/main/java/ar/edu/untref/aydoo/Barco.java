package ar.edu.untref.aydoo;

public class Barco {

	private int tamanio;
	private int parteDaniada;
	private boolean barcoTocado;

	public Barco(int tamanioBarco) {
		this.tamanio = tamanioBarco;
		this.parteDaniada = 0;
		this.barcoTocado = false;
	}

	public int obtenerTamanio() {		
		return this.tamanio;
	}

	public void tocado() {
		if(this.tamanio > this.parteDaniada) {
			this.parteDaniada++;
			this.barcoTocado = true;
		}
	}
	
	public boolean estaTocado() {
		return this.barcoTocado;
	}

	public boolean estaHundido() {
		return this.parteDaniada == this.tamanio;
	}
	
}
