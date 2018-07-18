package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import excepciones.ExcepcionInversionNoValida;
import excepciones.ExcepcionUsuarioNoValido;

public class TestIntegral {
	
	@Test
	public void realizarUnPlazoFijoTradicionalDeberiaDevolver100DeGanancia() {	  
		Inversor jorge = new Inversor();
		String[] parametros = {"pft", "90", "10", "1000"};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(parametros);
		double valorEsperado = 24.65;
		
		jorge.realizarInversion(plazoFijoTradicional);		
		double valorObtenido = jorge.calcularGananciasObtenidas();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test	
	public void realizarUnPlazoFijoPrecancelableDeberiaDevolver6250DeGanancia() {	  
		Inversor jorge = new Inversor();
		String[] parametrosPfp = {"pfp", "100", "30", "25", "50000"};
		Inversion plazoFijoPrecancelable = new PlazoFijoTradicional(parametrosPfp);

		double valorEsperado = 6250;				
		jorge.realizarInversion(plazoFijoPrecancelable);
		
		double valorObtenido = jorge.calcularGananciasObtenidas();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}	

	@Test	
	public void realizarUnPlazoFijoTradicionalYUnPlazoFijoPrecancelableDeberiaDevolver6274_65DeGanancia() {	  
		Inversor jorge = new Inversor();
		String[] parametrosPft = {"pft", "90", "10", "1000"};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(parametrosPft);
		String[] parametrosPfp = {"pfp", "100", "30", "25", "50000"};
		Inversion plazoFijoPrecancelable = new PlazoFijoTradicional(parametrosPfp);
		double valorEsperado = 6274.65;				
		jorge.realizarInversion(plazoFijoTradicional);		
		jorge.realizarInversion(plazoFijoPrecancelable);
		
		double valorObtenido = jorge.calcularGananciasObtenidas();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test	
	public void realizarUnPlazoFijoTradicionalYCompraDeDolaresDeberiaDevolver32657_5DeGanancia() {	  
		Inversor jorge = new Inversor();
		String[] parametrosPft = {"pft", "365", "10", "500000"};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(parametrosPft);
		String[] parametrosDol = {"dol", "100000", "18", "27"};
		Inversion comprarDeDolares = new PlazoFijoTradicional(parametrosDol);
		String[] parametrosPfp = {"pfp", "365", "300", "40", "100000"};
		Inversion plazoFijoPrecancelable = new PlazoFijoTradicional(parametrosPfp);
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
		String[] parametrosPft = {"pft", "90", "40", "250000"};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(parametrosPft);
		String[] parametrosDol = {"dol", "20000", "20", "28"};
		Inversion comprarDeDolares = new PlazoFijoTradicional(parametrosDol);
		double valorEsperado = 32657.5;				
		jorge.realizarInversion(plazoFijoTradicional);		
		jorge.realizarInversion(comprarDeDolares);
		
		double valorObtenido = jorge.calcularGananciasObtenidas();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void realizarUnaInversionDeTipoJKKDeberiaDevolverExcepcionInversionNoValida() {	  
		Inversor jorge = new Inversor();
		String[] parametros = {"jkk", "90", "10", "1000"};
		PlazoFijoTradicional plazoFijoTradicional = new PlazoFijoTradicional(parametros);
		jorge.realizarInversion(plazoFijoTradicional);		

		try {
			jorge.calcularGananciasObtenidas();
		}catch (ExcepcionInversionNoValida e){

	    }
	}
	
	@Test	
	public void conUnaGananciaDe120000UnIndividuoDeberiaPagarUnImpuestoDe9600() {	  
		Inversor jorge = new Inversor();
		String[] parametrosPft = {"pft", "365", "10", "500000"};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(parametrosPft);
		String[] parametrosDol = {"dol", "100000", "18", "27"};
		Inversion comprarDeDolares = new PlazoFijoTradicional(parametrosDol);
		String[] parametrosPfp = {"pfp", "365", "300", "40", "100000"};
		Inversion plazoFijoPrecancelable = new PlazoFijoTradicional(parametrosPfp);
		double valorEsperado = 9600;	
		jorge.realizarInversion(plazoFijoPrecancelable);		
		jorge.realizarInversion(plazoFijoTradicional);		
		jorge.realizarInversion(comprarDeDolares);
		double gananciaObtenida = jorge.calcularGananciasObtenidas();
		Impuesto impuesto = new ImpuestosIndividuo("ind");
		
		double valorObtenido = impuesto.aplicarImpuesto(gananciaObtenida);
				
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test	
	public void conUnaGananciaDe120000UnaEmpresaDeberiaPagarUnImpuestoDe18000() {	  
		Inversor jorge = new Inversor();
		String[] parametrosPft = {"pft", "365", "10", "500000"};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(parametrosPft);
		String[] parametrosDol = {"dol", "100000", "18", "27"};
		Inversion comprarDeDolares = new PlazoFijoTradicional(parametrosDol);
		String[] parametrosPfp = {"pfp", "365", "300", "40", "100000"};
		Inversion plazoFijoPrecancelable = new PlazoFijoTradicional(parametrosPfp);
		double valorEsperado = 18000;	
		jorge.realizarInversion(plazoFijoPrecancelable);		
		jorge.realizarInversion(plazoFijoTradicional);		
		jorge.realizarInversion(comprarDeDolares);
		double gananciaObtenida = jorge.calcularGananciasObtenidas();
		Impuesto impuesto = new ImpuestosIndividuo("emp");
		
		double valorObtenido = impuesto.aplicarImpuesto(gananciaObtenida);
				
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test	
	public void conUnaGananciaDe32657_5UnIndividuoDeberiaPagarUnImpuestoDe9600() {	  
		Inversor jorge = new Inversor();
		String[] parametrosPft = {"pft", "90", "40", "250000"};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(parametrosPft);
		String[] parametrosDol = {"dol", "20000", "20", "28"};
		Inversion comprarDeDolares = new PlazoFijoTradicional(parametrosDol);
		double valorEsperado = 0;				
		jorge.realizarInversion(plazoFijoTradicional);		
		jorge.realizarInversion(comprarDeDolares);
		double gananciaObtenida = jorge.calcularGananciasObtenidas();
		Impuesto impuesto = new ImpuestosIndividuo("ind");
		
		double valorObtenido = impuesto.aplicarImpuesto(gananciaObtenida);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test	
	public void conUnaGananciaDe32657_5UnaEmpresaDeberiaPagarUnImpuestoDe9600() {	  
		Inversor jorge = new Inversor();
		String[] parametrosPft = {"pft", "90", "40", "250000"};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(parametrosPft);
		String[] parametrosDol = {"dol", "20000", "20", "28"};
		Inversion comprarDeDolares = new PlazoFijoTradicional(parametrosDol);
		double valorEsperado = 1632.9;				
		jorge.realizarInversion(plazoFijoTradicional);		
		jorge.realizarInversion(comprarDeDolares);
		double gananciaObtenida = jorge.calcularGananciasObtenidas();
		Impuesto impuesto = new ImpuestosIndividuo("emp");
		
		double valorObtenido = impuesto.aplicarImpuesto(gananciaObtenida);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test	
	public void cuandoSeIntoduceTipoDeClienteZZZDeberiaLanzarExcepcionUsuarioNoValido() {	  
		Inversor jorge = new Inversor();
		String[] parametrosPft = {"pft", "90", "40", "250000"};
		Inversion plazoFijoTradicional = new PlazoFijoTradicional(parametrosPft);
		String[] parametrosDol = {"dol", "20000", "20", "28"};
		Inversion comprarDeDolares = new PlazoFijoTradicional(parametrosDol);
		jorge.realizarInversion(plazoFijoTradicional);		
		jorge.realizarInversion(comprarDeDolares);
		double gananciaObtenida = jorge.calcularGananciasObtenidas();
		Impuesto impuesto = new ImpuestosIndividuo("zzz");
		
		
		try {
			impuesto.aplicarImpuesto(gananciaObtenida);
		}catch (ExcepcionUsuarioNoValido e){

	    }
	}
}
