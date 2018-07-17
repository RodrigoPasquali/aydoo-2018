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
		String tipoInversion = "pfp";
		double[] parametros = {100, 100, 25, 50000};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);
		double valorEsperado = 12500;
		
		plazoFijoPrecancelable.calcularGanancia();
		double valorObtenido = plazoFijoPrecancelable.getGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDeberiaDevolver6250DeGananciaCuandoElMontoEs50000ElInteresEs25PlazoReal30() {	  
		String tipoInversion = "pfp";
		double[] parametros = {100, 30, 25, 50000};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);
		double valorEsperado = 6250;
		
		plazoFijoPrecancelable.calcularGanancia();
		double valorObtenido = plazoFijoPrecancelable.getGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDeberiaDevolver20000DeGananciaCuandoElMontoEs100000ElInteresEs40PlazoReal300() {	  
		String tipoInversion = "pfp";
		double[] parametros = {365, 300, 40, 100000};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);
		double valorEsperado = 20000;
		
		plazoFijoPrecancelable.calcularGanancia();
		double valorObtenido = plazoFijoPrecancelable.getGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDe10DiasInicialesDeberiaLanzarExcepcionDiasIncorrectos() {	  
		String tipoInversion = "pfp";
		double[] parametros = {10, 6, 25, 50000};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);

		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDe29DiasInicialesDeberiaLanzarExcepcionDiasIncorrectos() {	  
		String tipoInversion = "pfp";
		double[] parametros = {29, 6, 25, 50000};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDeMonto0DeberiaLanzarExcepcionMontoIncorrecto() {	  
		String tipoInversion = "pfp";
		double[] parametros = {100, 30, 25, 0};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeMonto1NegativoDeberiaLanzarExcepcionMontoIncorrecto() {	  
		String tipoInversion = "pfp";
		double[] parametros = {30, 15, 25, -1};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionMontoIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeInteres0DeberiaLanzarExcepcionInteresIncorrecto() {	  
		String tipoInversion = "pfp";
		double[] parametros = {100, 100, 0, 50000};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeInteres1NegativoDeberiaLanzarExcepcionInteresIncorrecto() {	  
		String tipoInversion = "pfp";
		double[] parametros = {100, 100, -1, 50000};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionInteresIncorrecto e){

	    }
	}
	
	@Test
	public void realizarUnPlazoFijoPrecancelableDe30DiasInicialesY60DiasRealesDeberiaLanzarExcepcionPlazoRealMayorAInicial() {	  
		String tipoInversion = "pfp";
		double[] parametros = {30, 60, 25, 50000};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);

		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionPlazoRealMayorAInicial e){

	    }
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDe1NegativoDiasRealesDeberiaLanzarExcepcionDiasIncorrectos() {	  
		String tipoInversion = "pfp";
		double[] parametros = {30, -1, 25, 50000};
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable(tipoInversion, parametros);
		
		try {
			plazoFijoPrecancelable.calcularGanancia();
		}catch (ExcepcionDiasIncorrectos e){

	    }
	}

}
