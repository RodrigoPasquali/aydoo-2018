package ar.edu.untref.aydoo;

public class Voto {

	private Candidato candidato;
	private Provincia pronvincia;

	public Voto(Candidato candidatoVotado, Provincia provinciaVotada) {
		this.candidato = candidatoVotado;
		this.pronvincia = provinciaVotada;
	}

	public Candidato getCandidato() {
		return this.candidato;
	}
	
	public Provincia getProvincia() {
		return this.pronvincia;
	}
	
}
