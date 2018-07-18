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
//		String tipoInversion = "pfp";
//		double[] parametros = {100, 100, 25, 50000};
//		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);
		String[] parametros = {"pfp", "100", "100", "25", "50000"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		
		double valorEsperado = 12500;
		
		double valorObtenido = plazoFijoPrecancelable.calcularGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDeberiaDevolver6250DeGananciaCuandoElMontoEs50000ElInteresEs25PlazoReal30() {	  
		String[] parametros = {"pfp", "100", "30", "25", "50000"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		

		double valorEsperado = 6250;
		
		double valorObtenido = plazoFijoPrecancelable.calcularGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDeberiaDevolver20000DeGananciaCuandoElMontoEs100000ElInteresEs40PlazoReal300() {	  
		String[] parametros = {"pfp", "365", "300", "40", "100000"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		
		double valorEsperado = 20000;
		
		double valorObtenido = plazoFijoPrecancelable.calcularGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDe10DiasInicialesDeberiaLanzarExcepcionDiasIncorrectos() {	  
		String[] parametros = {"pfp", "10", "6", "25", "50000"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		

		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDe29DiasInicialesDeberiaLanzarExcepcionDiasIncorrectos() {	  
		String[] parametros = {"pfp", "29", "6", "25", "50000"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDeMonto0DeberiaLanzarExcepcionMontoIncorrecto() {	  
		String[] parametros = {"pfp", "100", "30", "25", "0"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeMonto1NegativoDeberiaLanzarExcepcionMontoIncorrecto() {	  
		String[] parametros = {"pfp", "30", "15", "25", "-1"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeInteres0DeberiaLanzarExcepcionInteresIncorrecto() {	  
		String[] parametros = {"pfp", "100", "100", "0", "50000"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeInteres1NegativoDeberiaLanzarExcepcionInteresIncorrecto() {	  
		String[] parametros = {"pfp", "100", "100", "-1", "50000"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDe30DiasInicialesY60DiasRealesDeberiaLanzarExcepcionPlazoRealMayorAInicial() {	  
		String[] parametros = {"pfp", "30", "60", "25", "50000"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		

		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionPlazoRealMayorAInicial e){

	    }
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDe1NegativoDiasRealesDeberiaLanzarExcepcionDiasIncorrectos() {	  
		String[] parametros = {"pfp", "30", "-1", "25", "50000"};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(parametros);		
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}
}
