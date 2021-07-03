package ar.edu.untref.aydoo;

public class Partido {

	private String nombre;
	private int votos;

	public Partido(String nombrePartido) {
		this.nombre = nombrePartido;
		this.votos = 0;
	}
	
	public void sumarVoto() {
		this.votos++;
	}
	
	public int getVotos() {
		return this.votos;
	}

}
