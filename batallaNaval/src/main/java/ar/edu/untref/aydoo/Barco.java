package ar.edu.untref.aydoo;

public class Barco {

	private int tamanio;
	private int parteDaniada;
	private boolean barcoTocado;

	public Barco(int tamanioBarco) throws Exception {
		if(this.tamanio > 2) {
			throw new Exception("Los tamaños posibles son 1 o 2");
		}else {
			this.tamanio = tamanioBarco;
			this.parteDaniada = 0;
			this.barcoTocado = false;
		}
	}

	public int obtenerTamanio() {		
		return this.tamanio;
	}

	public void tocado() throws Exception {
		if(this.tamanio > this.parteDaniada) {
			this.parteDaniada++;
			this.barcoTocado = true;
		}else{
			throw new Exception("El barco ya esta hundido");
		}
	}
	
	public boolean estaTocado() {
		return this.barcoTocado;
	}

	public boolean estaHundido() {
		return this.parteDaniada == this.tamanio;
	}
	
}
