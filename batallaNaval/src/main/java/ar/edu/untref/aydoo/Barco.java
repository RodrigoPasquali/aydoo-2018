package ar.edu.untref.aydoo;

public class Barco {

	private int tamanio;
	private int parteDaniada;

	public Barco(int tamanioBarco) {
		this.tamanio = tamanioBarco;
		this.parteDaniada = 0;
	}

	public int obtenerTamanio() {		
		return this.tamanio;
	}

	public String tocado() {
		String mensaje;
		if(this.tamanio > this.parteDaniada) {
			this.parteDaniada++;
			mensaje = "¡El barco ha sido dañado!";
		}else{
			mensaje = "El barco esta hundido";
		}
		return mensaje;
	}
	
	public boolean estaTocado() {
		boolean tocado = false;
		if((this.tamanio > this.parteDaniada) && (this.parteDaniada > 0)) {
			tocado = true;
		}
		return tocado;
	}

	public boolean estaHundido() {
		return this.parteDaniada == this.tamanio;
	}
	
}
