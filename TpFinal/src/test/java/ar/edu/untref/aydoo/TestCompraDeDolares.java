package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import excepciones.ExcepcionCotizacionDolarIncorrecta;
import excepciones.ExcepcionMontoMenorACotizacionDolar;

public class TestCompraDeDolares {
	@Test
	public void realizarLaCompraDeDolaresCon1000PesosCotizacionInicial20CotizacionFinal28DeberiaDevolverGananciaDe400() {	  
		String[] parametros = {"dol", "1000", "20", "28"};
		CompraDeDolares comprarDolares = new CompraDeDolares(parametros);
		double valorEsperado = 400;
		
		double valorObtenido = comprarDolares.calcularGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarLaCompraDeDolaresCon20000PesosCotizacionInicial20CotizacionFinal28DeberiaDevolverGananciaDe8000() {	  
		String[] parametros = {"dol", "20000", "20", "28"};
		CompraDeDolares comprarDolares = new CompraDeDolares(parametros);
		double valorEsperado = 8000;
		
		double valorObtenido = comprarDolares.calcularGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarLaCompraDeDolaresCon100000PesosCotizacionInicial18CotizacionFinal27DeberiaDevolverGananciaDe8000() {	  
		String[] parametros = {"dol", "100000", "18", "27"};
		CompraDeDolares comprarDolares = new CompraDeDolares(parametros);
		double valorEsperado = 50000;
		
		double valorObtenido = comprarDolares.calcularGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarLaCompraDeDolaresCon10PesosCotizacionInicial20DeberiaLanzarExcepcionMontoMenorACotizacionDolar() {	  
		String[] parametros = {"dol", "10", "20", "28"};
		CompraDeDolares comprarDolares = new CompraDeDolares(parametros);
		
		try {
			comprarDolares.calcularGanancia();
		}catch (ExcepcionMontoMenorACotizacionDolar e){

	    }		
	}
	
	@Test
	public void realizarLaCompraDeDolaresConCotizacionInicial0DeberiaLanzarExcepcionCotizacionDolarIncorrecta() {	  
		String[] parametros = {"dol", "10", "0", "28"};
		CompraDeDolares comprarDolares = new CompraDeDolares(parametros);
		
		try {
			comprarDolares.calcularGanancia();
		}catch (ExcepcionCotizacionDolarIncorrecta e){

	    }		
	}
	
	@Test
	public void realizarLaCompraDeDolaresConCotizacionFinal0DeberiaLanzarExcepcionCotizacionDolarIncorrecta() {	  
		String[] parametros = {"dol", "10", "0", "28"};
		CompraDeDolares comprarDolares = new CompraDeDolares(parametros);
		
		try {
			comprarDolares.calcularGanancia();
		}catch (ExcepcionCotizacionDolarIncorrecta e){

	    }		
	}
}