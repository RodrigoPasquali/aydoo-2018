package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestEntrada {
	
	@Test
	public void getNumeroDeberiaDEvolverNumero8() throws Exception {
		String[] cadena = {"8"};
		Entrada entrada = new Entrada(cadena);
		
		int valorObtenido = entrada.getNumero();
		int valorEsperado = 8;
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

}
