package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPartido {

	@Test
	public void partidoRojoDeberiaTener0VotosSiNoRecibioVotos() {
		Partido rojo = new Partido("Rojo");
		int valorEsperado = 0;
		
		int valorObtenido = rojo.getVotos();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void partidoRojoDeberiaTener2VotosSiLoVotaron2Veces() {
		Partido rojo = new Partido("Rojo");
		Partido azul = new Partido("Azul");
		int valorEsperado = 2;
		
		azul.sumarVoto();
		rojo.sumarVoto();
		rojo.sumarVoto();
		int valorObtenido = rojo.getVotos();
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
