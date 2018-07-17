package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TestImpuestoIndividual {
	@Test
	public void elImpuestoAUnaGananciaDe100DeberiaSer0() {	  
		double ganancia = 100;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo("ind");
		double valorEsperado = 0;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void elImpuestoAUnaGananciaDe49999DeberiaSer0() {	  
		double ganancia = 49999;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo("ind");
		double valorEsperado = 0;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe50001DeberiaSer2500() {	  
		double ganancia = 50001;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo("ind");
		double valorEsperado = 2500;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void elImpuestoAUnaGananciaDe50000DeberiaSer2500() {	  
		double ganancia = 50000;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo("ind");
		double valorEsperado = 2500;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe99999DeberiaSer5000() {	  
		double ganancia = 99999;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo("ind");
		double valorEsperado = 5000;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe100000DeberiaSer8000() {	  
		double ganancia = 100000;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo("ind");
		double valorEsperado = 8000;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe499999DeberiaSer4000() {	  
		double ganancia = 499999;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo("ind");
		double valorEsperado = 40000;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe500000DeberiaSer50000() {	  
		double ganancia = 500000;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo("ind");
		double valorEsperado = 50000;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe500001DeberiaSer50000() {	  
		double ganancia = 500001;
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo("ind");
		double valorEsperado = 50000.1;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void deberiaPoderModificarseLaTablaDeImpuestos() {	  
		ImpuestosIndividuo impuesto = new ImpuestosIndividuo("ind");
		Map<Integer[], Double> tablaImpuestos = new HashMap<Integer[], Double>();
		Integer[] limite1 = {0, 1000};
		Integer[] limite2 = {1000, 2000};
		Integer[] limite3= {2000, 5000};
		tablaImpuestos.put(limite1, 0d);
		tablaImpuestos.put(limite2, 10d);
		tablaImpuestos.put(limite3, 20d);
		Map<Integer[], Double> valorEsperado = tablaImpuestos;
		
		impuesto.modificarTablaDeImpuestos(tablaImpuestos);
		Map<Integer[], Double> valorObtenido = impuesto.getTablaImpuestos();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
