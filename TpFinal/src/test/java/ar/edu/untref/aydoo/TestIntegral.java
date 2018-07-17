package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import excepciones.ExcepcionInversionNoValida;

public class TestIntegral {
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeberiaDevolver100DeGanancia() {	  
		Inversor jorge = new Inversor();
		String tipoInversion = "pft";
		double[] parametros = {90,10, 1000};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		double valorEsperado = 24.65;
		
		jorge.realizarInversion(plazoFijoTradicional);		
		double valorObtenido = jorge.calcularGananciasObtenidas();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test	
	public void realizarUnPlazoFijoTradicionalDeberiaDevolver6250DeGanancia() {	  
		Inversor jorge = new Inversor();
		String tipoInversionPfp = "pfp";
		double[] parametrosPfp = {100, 30, 25, 50000};
		Inversion plazoFijoPrecancelable = new PlazoFijoTradicional(tipoInversionPfp, parametrosPfp);
		double valorEsperado = 6250;				
		jorge.realizarInversion(plazoFijoPrecancelable);
		
		double valorObtenido = jorge.calcularGananciasObtenidas();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}	

	@Test	
	public void realizarUnPlazoFijoTradicionalYUnPlazoFijoPrecancelableDeberiaDevolver6274_65DeGanancia() {	  
		Inversor jorge = new Inversor();
		String tipoInversionPft = "pft";
		double[] parametrosPft = {90,10, 1000};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(tipoInversionPft, parametrosPft);
		String tipoInversionPfp = "pfp";
		double[] parametrosPfp = {100, 30, 25, 50000};
		Inversion plazoFijoPrecancelable = new PlazoFijoTradicional(tipoInversionPfp, parametrosPfp);
		double valorEsperado = 6274.65;				
		jorge.realizarInversion(plazoFijoTradicional);		
		jorge.realizarInversion(plazoFijoPrecancelable);
		
		double valorObtenido = jorge.calcularGananciasObtenidas();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test	
	public void realizarUnPlazoFijoTradicionalYCompraDeDolaresDeberiaDevolver32657_5DeGanancia() {	  
		Inversor jorge = new Inversor();
		String tipoInversionPft = "pft";
		double[] parametrosPft = {365, 10, 500000};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(tipoInversionPft, parametrosPft);
		String tipoInversionDol = "dol";
		double[] parametrosDol = {100000, 18, 27};
		Inversion comprarDeDolares = new PlazoFijoTradicional(tipoInversionDol, parametrosDol);
		String tipoInversionPfp = "pfp";
		double[] parametrosPfp = {365, 300, 40, 100000};
		Inversion plazoFijoPrecancelable = new PlazoFijoTradicional(tipoInversionPfp, parametrosPfp);
		double valorEsperado = 120000;	
		jorge.realizarInversion(plazoFijoPrecancelable);		
		jorge.realizarInversion(plazoFijoTradicional);		
		jorge.realizarInversion(comprarDeDolares);
		
		double valorObtenido = jorge.calcularGananciasObtenidas();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test	
	public void realizarUnPlazoFijoTradicional_PlazoFijoPrecancelableYCompraDeDolaresDeberiaDevolver120000DeGanancia() {	  
		Inversor jorge = new Inversor();
		String tipoInversionPft = "pft";		
		double[] parametrosPft = {90, 40, 250000};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(tipoInversionPft, parametrosPft);
		String tipoInversionDol = "dol";
		double[] parametrosDol = {20000, 20, 28};
		Inversion comprarDeDolares = new PlazoFijoTradicional(tipoInversionDol, parametrosDol);
		double valorEsperado = 32657.5;				
		jorge.realizarInversion(plazoFijoTradicional);		
		jorge.realizarInversion(comprarDeDolares);
		
		double valorObtenido = jorge.calcularGananciasObtenidas();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void realizarUnaInversionDeTipoJKKDeberiaDevolverExcepcionInversionNoValida() {	  
		Inversor jorge = new Inversor();
		String tipoInversion = "jkk";
		double[] parametros = {90,10, 1000};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(tipoInversion, parametros);
		jorge.realizarInversion(plazoFijoTradicional);		

		try {
			jorge.calcularGananciasObtenidas();
		}catch (ExcepcionInversionNoValida e){

	    }
	}
}
