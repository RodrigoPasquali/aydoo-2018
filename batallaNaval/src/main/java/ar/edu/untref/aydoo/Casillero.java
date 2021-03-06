package ar.edu.untref.aydoo;

public class Casillero {

	private Barco barco;
	private EstadoCasillero estado;

	public Casillero() {
		this.barco = null;
		this.estado = EstadoCasillero.AGUA;
	}
	
	public boolean estaVacio() {
		return this.barco == null;
	}

	public void ponerBarco(Barco unBarco){
		this.barco = unBarco;
	}
	
	public Barco obtenerBarco() {
		return this.barco;
	}
	
	public EstadoCasillero obtenerEstado() throws Exception {
		if(this.barco != null) {
			if(this.barco.estaHundido()) {
				this.estado = EstadoCasillero.HUNDIDO;
			}else if(this.barco.estaTocado()) {
				throw new Exception("El barco ya fue tocado");
			}else{
				this.barco.tocado();
				if(this.barco.estaHundido()) {
					this.estado = EstadoCasillero.HUNDIDO;
				}else{
					this.estado = EstadoCasillero.TOCADO;
				}
			}
		}
		return this.estado;
	}

}
