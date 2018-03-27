package ar.edu.untref.aydoo;

import org.junit.Assert;

import org.junit.Test;

public class TestIntegracion {
	
	@Test
	public void resultadoDeberiaSer0_1_1_2_3Para5() throws Exception{
		String[] cadena = {"5"};
		SucesionFibo sucesion = new SucesionFibo();
		String valorObtenido = sucesion.generarRespuesta(cadena);	
		String valorDeseado = "fibo<5>: 0 1 1 2 3 ";
		
		Assert.assertEquals(valorDeseado, valorObtenido);
	}
	
	@Test
	public void resultadoDeberiaSer0_1_1_2_3_5_8_13Para8() throws Exception{
		String[] cadena = {"8"};
		SucesionFibo sucesion = new SucesionFibo();
		String valorObtenido = sucesion.generarRespuesta(cadena);	
		String valorDeseado = "fibo<8>: 0 1 1 2 3 5 8 13 ";
		
		Assert.assertEquals(valorDeseado, valorObtenido);
	}

}
