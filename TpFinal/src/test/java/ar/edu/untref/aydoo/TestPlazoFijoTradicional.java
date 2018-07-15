package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import excepciones.ExcepcionDiasIncorrectos;

public class TestPlazoFijoTradicional {
	@Test
	public void realizarUnPlazoFijoTradicionalDeberiaDevolver12500DeGananciaCuandoElMontoEs5000YElInteresEs25() {	  
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional();
		double valorEsperado = 12500;
		
		double valorObtenido = plazoFijoTradicional.calcularGanancia(100, 25, 50000);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDe10DiasDeberiaLanzarExcepcionDiasIncorrectos() {	  
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional();
		
		try {
			plazoFijoTradicional.calcularGanancia(10, 25, 50000);
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}
}
