package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import excepciones.ExcepcionDiasIncorrectos;
import excepciones.ExcepcionInteresIncorrecto;
import excepciones.ExcepcionMontoIncorrecto;
import excepciones.ExcepcionPlazoRealMayorAInicial;

public class TestPlazoFijoPrecancelable {	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeberiaDevolver12500DeGananciaCuandoElMontoEs5000YElInteresEs25() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(100, 100, 25, 50000);
		double valorEsperado = 12500;
		
		double valorObtenido = plazoFijoPrecancelable.calcularGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDeberiaDevolver6250DeGananciaCuandoElMontoEs5000ElInteresEs25PlazoReal30() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(100, 30, 25, 50000);
		double valorEsperado = 12500;
		
		double valorObtenido = plazoFijoPrecancelable.calcularGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDe10DiasInicialesDeberiaLanzarExcepcionDiasIncorrectos() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(10, 6, 25, 50000);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDe29DiasInicialesDeberiaLanzarExcepcionDiasIncorrectos() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(29, 6, 25, 50000);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDeMonto0DeberiaLanzarExcepcionMontoIncorrecto() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(100, 30, 25, 0);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeMonto1NegativoDeberiaLanzarExcepcionMontoIncorrecto() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(30, 15, 25, -1);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeInteres0DeberiaLanzarExcepcionInteresIncorrecto() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(100, 100, 0, 50000);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeInteres1NegativoDeberiaLanzarExcepcionInteresIncorrecto() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(100, 100, -1, 50000);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDe30DiasInicialesY60DiasRealesDeberiaLanzarExcepcionPlazoRealMayorAInicial() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(30, 60, 25, 50000);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionPlazoRealMayorAInicial e){

	    }
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDe1NegativoDiasRealesDeberiaLanzarExcepcionDiasIncorrectos() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(30, -1, 25, 50000);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}

}
