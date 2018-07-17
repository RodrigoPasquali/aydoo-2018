package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestIntegral {
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeberiaDevolver100DeGanancia() {	  
		Inversor jorge = new Inversor();
		String tipoInversion = "pft";
		double[] parametros = {90,10, 1000};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		double valorEsperado = 24.65;
		
		jorge.realizarInversion(plazoFijoTradicional);		
		double valorObtenido = jorge.getGanancias();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
}
