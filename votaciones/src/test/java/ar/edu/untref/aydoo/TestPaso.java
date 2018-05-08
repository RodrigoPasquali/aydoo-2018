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

	@Test
	public void elGanadorDeLaProvinciaDeBsAsDeberiaSerPepeCon3Votos() {
		Paso paso = new Paso("2018");
		Partido rojo = new Partido("Rojo");
		Candidato juan = new Candidato("Juan");
		Candidato pepe = new Candidato("Pepe");
		Provincia bsas = Provincia.BUENOS_AIRES;
		Provincia cordoba = Provincia.CORDOBA;
		juan.afiliarAPartido(rojo);
		Voto voto1 = new Voto(juan, bsas);
		Voto voto2 = new Voto(juan, cordoba);	
		Voto voto3 = new Voto(pepe, bsas);
		Voto voto4 = new Voto(pepe, bsas);
		Voto voto5 = new Voto(juan, cordoba);
		
		Candidato valorEsperado = pepe;
		
		paso.aniadirVoto(voto1);
		paso.aniadirVoto(voto2);
		paso.aniadirVoto(voto3);
		paso.aniadirVoto(voto4);
		paso.aniadirVoto(voto5);
		
		Candidato valorObtenido = paso.getCandidatoConMasVotosEnProvincia(bsas);
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void elGanadorDeLaProvinciaDeCordobaDeberiaSerJuanCon2Votos() {
		Paso paso = new Paso("2018");
		Partido rojo = new Partido("Rojo");
		Candidato juan = new Candidato("Juan");
		Candidato pepe = new Candidato("Pepe");
		Provincia bsas = Provincia.BUENOS_AIRES;
		Provincia cordoba = Provincia.CORDOBA;
		juan.afiliarAPartido(rojo);
		Voto voto1 = new Voto(juan, bsas);
		Voto voto2 = new Voto(juan, cordoba);	
		Voto voto3 = new Voto(pepe, bsas);
		Voto voto4 = new Voto(pepe, bsas);
		Voto voto5 = new Voto(juan, cordoba);
		
		Candidato valorEsperado = juan;
		
		paso.aniadirVoto(voto1);
		paso.aniadirVoto(voto2);
		paso.aniadirVoto(voto3);
		paso.aniadirVoto(voto4);
		paso.aniadirVoto(voto5);
		
		Candidato valorObtenido = paso.getCandidatoConMasVotosEnProvincia(cordoba);
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void elPartidoGanadorNacionalDeberiaSerPartidoRojoCon2VotosCuandoSeVotaACandidatoDeSuPartido() {
		Paso paso = new Paso("2018");
		Partido rojo = new Partido("Rojo");
		Candidato juan = new Candidato("Juan");
		Provincia bsas = Provincia.BUENOS_AIRES;
		Provincia cordoba = Provincia.CORDOBA;
		juan.afiliarAPartido(rojo);
		Voto voto1 = new Voto(juan, bsas);
		Voto voto2 = new Voto(juan, cordoba);	
		
		Partido valorEsperado = rojo;
		
		paso.aniadirVoto(voto1);
		paso.aniadirVoto(voto2);
		
		Partido valorObtenido = paso.getPartidoConMasVotosANivelNacional();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void elPartidoGanadorNacionalDeberiaSerPartidoRojoCon3VotosCuandoSeVotaACandidatoDeSuPartido() {
		Paso paso = new Paso("2018");
		Partido rojo = new Partido("Rojo");
		Partido azul = new Partido("Azul");
		Candidato juan = new Candidato("Juan");
		Candidato pepe = new Candidato("Pepe");
		Provincia bsas = Provincia.BUENOS_AIRES;
		Provincia cordoba = Provincia.CORDOBA;
		Provincia santaCruz = Provincia.SANTA_CRUZ;
		juan.afiliarAPartido(rojo);
		pepe.afiliarAPartido(azul);
		Voto voto1 = new Voto(juan, bsas);
		Voto voto2 = new Voto(juan, cordoba);	
		Voto voto3 = new Voto(pepe,santaCruz);
		Voto voto4 = new Voto(juan, santaCruz);	
		Voto voto5 = new Voto(pepe, bsas);
				
		Partido valorEsperado = rojo;
		
		paso.aniadirVoto(voto1);
		paso.aniadirVoto(voto2);
		paso.aniadirVoto(voto3);
		paso.aniadirVoto(voto4);
		paso.aniadirVoto(voto5);

		
		Partido valorObtenido = paso.getPartidoConMasVotosANivelNacional();
		
		assertEquals(valorEsperado, valorObtenido);
	}

}