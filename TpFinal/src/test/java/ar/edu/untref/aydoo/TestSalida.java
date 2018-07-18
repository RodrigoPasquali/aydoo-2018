package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestSalida {
	@Test
	public void elImpuestoAUnaGananciaDe100DeberiaSer0() {	  
		double ganancia = 10000;
		double impuesto = 55;
		Salida salida = new Salida(ganancia, impuesto);
		String valorEsperado = "ganancia: 10000, impuesto: 55";
		
		String valorObtenido = salida.generarSalida();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
