package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCandidato {

	@Test
	public void laCantidadDeVotosDeberiaSer0CuandoNoSeVota() {
		Candidato pepe = new Candidato("Pepe");
		int valorEsperado = 0;
		
		int valorObtenido = pepe.getCantidadVotos();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void laCantidadDeVotosDeberiaSer3C() {
		Candidato pepe = new Candidato("Pepe");
		int valorEsperado = 3;
		
		pepe.sumarVoto();
		pepe.sumarVoto();
		pepe.sumarVoto();
		int valorObtenido = pepe.getCantidadVotos();
		
		assertEquals(valorEsperado, valorObtenido);
	}
}
