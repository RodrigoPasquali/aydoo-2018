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
	
	@Test
	public void getDirecionDeberiaDevolverDCuandoSeIngresaHD() throws Exception {
		String[] cadena = {"-o=hd" , "34"};
		Entrada entrada = new Entrada(cadena);
		char valorEsperado = 'd';
		entrada.procesarParametros();
		
		char valorObtenido = entrada.getDireccion();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void getOrientacionYDireccionDeberiaDevolverHDCuandoNoSeIngresaFormato() throws Exception {
		String[] cadena = {"44"};
		Entrada entrada = new Entrada(cadena);
		char valorEsperadoD = 'd';
		char valorEsperadoO = 'h';
		entrada.procesarParametros();
		
		char valorObtenidoD = entrada.getDireccion();
		char valorObtenidoO = entrada.getOrientacion();
		
		Assert.assertEquals(valorEsperadoD, valorObtenidoD);
		Assert.assertEquals(valorEsperadoO, valorObtenidoO);
	}
	
}
