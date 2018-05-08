package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPaso {
	
	@Test
	public void elGanadorDeLaProvinciaDeBsAsDeberiaSerJuan() {
		Paso paso = new Paso("2018");
		Partido rojo = new Partido("Rojo");
		Candidato juan = new Candidato("Juan");
		Provincia bsas = Provincia.BUENOS_AIRES;
		juan.afiliarAPartido(rojo);
		Voto voto1 = new Voto(juan, bsas);
		Candidato valorEsperado = juan;
		
		paso.aniadirVoto(voto1);
		Candidato valorObtenido = paso.getCandidatoConMasVotosEnProvincia(bsas);
		
		assertEquals(valorEsperado, valorObtenido);
	}

}