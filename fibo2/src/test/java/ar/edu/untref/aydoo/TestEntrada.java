package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestEntrada {
	
	@Test
	public void getNumeroDeberiaDEvolverNumero8() throws Exception {
		String[] cadena = {"8"};
		Entrada entrada = new Entrada(cadena);
		entrada.procesarParametros();
		
		int valorObtenido = entrada.getNumero();
		int valorEsperado = 8;
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void getNumeroDeberiaDevoverExcepcionCuandoEnLaCadenaNoHayNumeros() throws Exception {
		String[] cadena = {"a"};
		Entrada entrada = new Entrada(cadena);
		
		try {
			 entrada.getNumero();
	    }catch (Exception e){

	    }
	}
	
	@Test
	public void getOrientacionDeberiaDevolverHCuandoSeIngresaHD() throws Exception {
		String[] cadena = {"-o=hd" , "5"};
		Entrada entrada = new Entrada(cadena);
		char valorEsperado = 'h';
		entrada.procesarParametros();
		
		char valorObtenido = entrada.getOrientacion();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
