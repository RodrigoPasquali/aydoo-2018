package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class TestCompra {
	
	@Test
	public void laFechaDeLaCompraDeberiaSerAnio2018Mes4Dia22() {
		Compra compra = new Compra(null, 2018, 5, 22);
		int anioEsperado = 2018;
		int mesEsperado = 4;
		int diaEsperado = 22;
		Calendar fecha = compra.getFecha();
		
		int anioObtenido = fecha.get(Calendar.YEAR);
		int mesObtenido = fecha.get(Calendar.MONTH);
		int diaObtenido = fecha.get(Calendar.DAY_OF_MONTH);

		
		assertEquals(anioEsperado, anioObtenido);
		assertEquals(mesEsperado, mesObtenido);
		assertEquals(diaEsperado, diaObtenido);
	}

}
