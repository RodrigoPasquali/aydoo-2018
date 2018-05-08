package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Paso {

	private List<Voto> votos;
	private String anio;
	
	public Paso(String anioDePaso) {
		this.anio = anioDePaso;
		this.votos = new LinkedList<Voto>();
	}

	public void aniadirVoto(Voto voto) {
		this.votos.add(voto);
	}

	public Candidato getCandidatoConMasVotosEnProvincia(Provincia bsas) {
		Candidato candidatoGanador = this.votos.get(0).getCandidato();

		return candidatoGanador;
	}

}
