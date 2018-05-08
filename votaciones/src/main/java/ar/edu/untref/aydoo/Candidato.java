package ar.edu.untref.aydoo;

public class Candidato {

	private String nombre;
	private Partido partido;

	public Candidato(String nombreCandidato) {
		this.nombre = nombreCandidato;
	}

	public void afiliarAPartido(Partido partidoAAfiliarse) {
		this.partido = partidoAAfiliarse;
	}
	
	public Partido getPartidoAfiliado() {
		return this.partido;
	}

}
