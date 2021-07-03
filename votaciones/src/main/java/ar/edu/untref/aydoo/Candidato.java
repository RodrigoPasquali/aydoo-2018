package ar.edu.untref.aydoo;

public class Candidato {

	private String nombre;
	private Partido partido;
	private int cantidadVotos;

	public Candidato(String nombreCandidato) {
		this.nombre = nombreCandidato;
		this.cantidadVotos = 0;
	}

	public void afiliarAPartido(Partido partidoAAfiliarse) {
		this.partido = partidoAAfiliarse;
	}
	
	public Partido getPartidoAfiliado() {
		return this.partido;
	}
	
	public void sumarVoto() {
		this.cantidadVotos++;
	}
	
	public int getCantidadVotos() {
		return this.cantidadVotos;
	}

}
