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

	public Candidato getCandidatoConMasVotosEnProvincia(Provincia provincia) {
		Candidato candidatoGanador = this.votos.get(0).getCandidato();
		this.contarVotosPorProvincia(provincia);
		for(int i = 1; i < this.votos.size(); i++) {
			Candidato candidatoActual = this.votos.get(i).getCandidato();
			if(candidatoGanador.getCantidadVotos() < candidatoActual.getCantidadVotos()) {
				candidatoGanador = candidatoActual;
			}
		}
		return candidatoGanador;
	}
	
	private void contarVotosPorProvincia(Provincia provincia) {
		for(int i = 0; i < this.votos.size(); i++) {
			Voto votoActual = this.votos.get(i);
			if(provincia.equals(votoActual.getProvincia())) {
				votoActual.getCandidato().sumarVoto();
			}
		}
	}

}
