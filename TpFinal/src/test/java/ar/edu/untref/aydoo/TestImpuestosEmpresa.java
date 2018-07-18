package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import excepciones.ExcepcionUsuarioNoValido;

public class TestImpuestosEmpresa {
	@Test
	public void elImpuestoAUnaGananciaDe100DeberiaSer0() {	  
		double ganancia = 100;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 0;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe19999DeberiaSer0() {	  
		double ganancia = 19999;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 0;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe20000DeberiaSer1000() {	  
		double ganancia = 20000;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 1000;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe49999DeberiaSer2500() {	  
		double ganancia = 49999;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 2500;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe50000DeberiaSer5000() {	  
		double ganancia = 50000;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 5000;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe50001DeberiaSer5000() {	  
		double ganancia = 50001;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 5000.1;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}	

	@Test
	public void elImpuestoAUnaGananciaDe99999DeberiaSer9999() {	  
		double ganancia = 99999;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 10000;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe100000DeberiaSer15000() {	  
		double ganancia = 100000;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 15000;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe499999DeberiaSer4000() {	  
		double ganancia = 499999;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 74999.8;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe500000DeberiaSer100000() {	  
		double ganancia = 500000;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 100000;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elImpuestoAUnaGananciaDe500001DeberiaSer50000() {	  
		double ganancia = 500001;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
		double valorEsperado = 100000.2;
		
		double valorObtenido = impuesto.aplicarImpuesto(ganancia);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void deberiaPoderModificarseLaTablaDeImpuestos() {	  
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("emp");
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
	
	@Test
	public void introducirTipoDeClienteZXXDeberiaLanzarExcepcionUsuarioNoValido() {	  
		double ganancia = 500001;
		ImpuestosEmpresa impuesto = new ImpuestosEmpresa("zxx");
		
		try {
			impuesto.aplicarImpuesto(ganancia);
		}catch (ExcepcionUsuarioNoValido e){

	    }
	}
}
