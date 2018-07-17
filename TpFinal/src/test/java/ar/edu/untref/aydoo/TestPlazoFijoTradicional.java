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
		String tipoInversion = "pft";
		double[] parametros = {365, 10, 500000};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		double valorEsperado = 50000;
		
		plazoFijoTradicional.calcularGanancia();
		double valorObtenido = plazoFijoTradicional.getGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test	
	public void realizarUnPlazoFijoTradicionalDeberiaDevolver12500DeGananciaCuandoElMontoEs5000YElInteresEs25() {	  
		String tipoInversion = "pft";
		double[] parametros = {90, 40, 250000};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		double valorEsperado = 24657.5;
		
		plazoFijoTradicional.calcularGanancia();
		double valorObtenido = plazoFijoTradicional.getGanancia();

		assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoTradicionalDe10DiasDeberiaLanzarExcepcionDiasIncorrectos() {	  
		String tipoInversion = "pft";
		double[] parametros = {10, 25, 50000};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDe29DiasDeberiaLanzarExcepcionDiasIncorrectos() {	  
		String tipoInversion = "pft";
		double[] parametros = {29, 25, 50000};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}

	@Test
	public void realizarUnPlazoFijoTradicionalDeMonto0DeberiaLanzarExcepcionMontoIncorrecto() {	  
		String tipoInversion = "pft";
		double[] parametros = {50, 25, 0};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeMonto1NegativoDeberiaLanzarExcepcionMontoIncorrecto() {	  
		String tipoInversion = "pft";
		double[] parametros = {50, 25, -1};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeInteres0DeberiaLanzarExcepcionInteresIncorrecto() {	  
		String tipoInversion = "pft";
		double[] parametros = {50, 0, 1000};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeInteres1NegativoDeberiaLanzarExcepcionInteresIncorrecto() {	  
		String tipoInversion = "pft";
		double[] parametros = {50, -1, 1000};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		
		try {
			plazoFijoTradicional.calcularGanancia();
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
}
