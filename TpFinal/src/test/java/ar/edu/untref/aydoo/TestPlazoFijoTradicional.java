package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import excepciones.ExcepcionDiasIncorrectos;
import excepciones.ExcepcionInteresIncorrecto;
import excepciones.ExcepcionMontoIncorrecto;

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
	
	@Test
	public void realizarUnPlazoFijoTradicionalDe29DiasDeberiaLanzarExcepcionDiasIncorrectos() {	  
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional();
		
		try {
			plazoFijoTradicional.calcularGanancia(29, 25, 50000);
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}

	@Test
	public void realizarUnPlazoFijoTradicionalDeMonto0DeberiaLanzarExcepcionMontoIncorrecto() {	  
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional();
		
		try {
			plazoFijoTradicional.calcularGanancia(50, 25, 0);
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeMonto1NegativoDeberiaLanzarExcepcionMontoIncorrecto() {	  
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional();
		
		try {
			plazoFijoTradicional.calcularGanancia(50, 25, -1);
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeInteres0DeberiaLanzarExcepcionInteresIncorrecto() {	  
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional();
		
		try {
			plazoFijoTradicional.calcularGanancia(50, 0, 1000);
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeInteres1NegativoDeberiaLanzarExcepcionInteresIncorrecto() {	  
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional();
		
		try {
			plazoFijoTradicional.calcularGanancia(50, -1, 1000);
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}

}
