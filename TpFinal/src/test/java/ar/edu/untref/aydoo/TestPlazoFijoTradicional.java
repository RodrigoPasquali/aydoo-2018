package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import excepciones.ExcepcionDiasIncorrectos;
import excepciones.ExcepcionInteresIncorrecto;
import excepciones.ExcepcionMontoIncorrecto;

public class TestPlazoFijoTradicional {
	@Test
	public void realizarUnPlazoFijoTradicionalDeberiaDevolver50000DeGananciaCuandoElMontoEs50000YElInteresEs10() {	  
		String[] parametros = {"pft", "365", "10", "500000"};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(parametros);
		double valorEsperado = 50000;
		
		double valorObtenido = plazoFijoTradicional.calcularGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test	
	public void realizarUnPlazoFijoTradicionalDeberiaDevolver12500DeGananciaCuandoElMontoEs5000YElInteresEs25() {	  
		String[] parametros = {"pft", "90", "40", "250000"};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(parametros);
		double valorEsperado = 24657.5;
		
		double valorObtenido = plazoFijoTradicional.calcularGanancia();

		assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoTradicionalDe10DiasDeberiaLanzarExcepcionDiasIncorrectos() {	  
		String[] parametros = {"pft", "10", "25", "50000"};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(parametros);

		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDe29DiasDeberiaLanzarExcepcionDiasIncorrectos() {	  
		String[] parametros = {"pft", "29", "25", "50000"};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(parametros);
		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}

	@Test
	public void realizarUnPlazoFijoTradicionalDeMonto0DeberiaLanzarExcepcionMontoIncorrecto() {	  
		String[] parametros = {"pft", "50", "25", "0"};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(parametros);
		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeMonto1NegativoDeberiaLanzarExcepcionMontoIncorrecto() {	  
		String[] parametros = {"pft", "50", "25", "-1"};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(parametros);
		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeInteres0DeberiaLanzarExcepcionInteresIncorrecto() {	  
		String[] parametros = {"pft", "50", "0", "1000"};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(parametros);
		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeInteres1NegativoDeberiaLanzarExcepcionInteresIncorrecto() {	  
		String[] parametros = {"pft", "50", "-1", "1000"};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(parametros);
	
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
}
