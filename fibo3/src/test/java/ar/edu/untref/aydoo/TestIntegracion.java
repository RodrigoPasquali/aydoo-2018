package ar.edu.untref.aydoo;

import org.junit.Assert;

import org.junit.Test;

public class TestIntegracion {
	
	@Test
	public void resultadoDeberiaSer0_1_1_2_3Para5() throws Exception{
		String[] cadena = {"5"};
		SucesionFibo sucesion = new SucesionFibo(cadena);
		String valorEsperado = "fibo<5>: 0 1 1 2 3 ";
		
		String valorObtenido = sucesion.generarRespuesta();	
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void resultadoDeberiaSer0_1_1_2_3_5_8_13Para8() throws Exception{
		String[] cadena = {"8"};
		SucesionFibo sucesion = new SucesionFibo(cadena);	
		String valorEsperado = "fibo<8>: 0 1 1 2 3 5 8 13 ";
		
		String valorObtenido = sucesion.generarRespuesta();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void resultadoDeberiaSerEnVerticalyDirectoCandoSeIngresaVD() throws Exception {
		String[] cadena = {"-o=vd", "5"};
		SucesionFibo sucesion = new SucesionFibo(cadena);	
		String valorEsperado = "fibo<5>: " + "\r\n"
										+ "0" + "\r\n"
										+ "1" + "\r\n"
										+ "1" + "\r\n"
										+ "2" + "\r\n"
										+ "3" ;
		String valorObtenido = sucesion.generarRespuesta();

		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void resultadoDeberiaSerEnVerticalyIndirectoCuandoSeIngresaVI() throws Exception {
		String[] cadena = {"-o=vi", "5"};
		SucesionFibo sucesion = new SucesionFibo(cadena);	
		String valorEsperado = "fibo<5>: " + "\r\n"
										+ "3" + "\r\n"
										+ "2" + "\r\n"
										+ "1" + "\r\n"
										+ "1" + "\r\n"
										+ "0" ;
		String valorObtenido = sucesion.generarRespuesta();

		Assert.assertEquals(valorEsperado, valorObtenido);
	}	

	@Test
	public void resultadoDeberiaSerEnHorizontalyIndirectoCuandoSeIngresaHI() throws Exception {
		String[] cadena = {"-o=hi", "5"};
		SucesionFibo sucesion = new SucesionFibo(cadena);	
		String valorEsperado = "fibo<5>: 3 2 1 1 0 ";
		String valorObtenido = sucesion.generarRespuesta();

		Assert.assertEquals(valorEsperado, valorObtenido);
	}	

	@Test
	public void deberiaDevolverOpcionesNoValidasCuandoSeIngresa_K_ComoDireccion() throws Exception {
		String[] cadena = {"-o=hk", "5"};
		SucesionFibo sucesion = new SucesionFibo(cadena);	
		String valorEsperado = "Opciones no validas";

		String valorObtenido = sucesion.generarRespuesta();

		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void deberiaDevolverOpcionesNovalidasCuandoSeIngresa_U_ComoOrientacion() throws Exception {
		String[] cadena = {"-o=ud", "5"};
		SucesionFibo sucesion = new SucesionFibo(cadena);	
		String valorEsperado = "Opciones no validas";

		String valorObtenido = sucesion.generarRespuesta();

		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
