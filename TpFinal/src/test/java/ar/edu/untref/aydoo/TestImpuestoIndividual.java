package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestImpuestoIndividual {
	@Test
	public void elImpuestoAUnaGananciaDe100DeberiaSer0() {	  
		double ganancia = 100;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo();
		double valorEsperado = 0;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void elImpuestoAUnaGananciaDe50001DeberiaSer2500() {	  
		double ganancia = 50001;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo();
		double valorEsperado = 2500;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe50000DeberiaSer2500() {	  
		double ganancia = 50000;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo();
		double valorEsperado = 2500;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe49999DeberiaSer0() {	  
		double ganancia = 49999;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo();
		double valorEsperado = 0;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

}
