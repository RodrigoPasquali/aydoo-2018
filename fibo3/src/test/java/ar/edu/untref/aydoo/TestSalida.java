package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestSalida {
	
	@Test
	public void salidaPorConsolaDeberiaDevolverElStringFinal() {
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13));
		Salida salida = new SalidaConsola(listaNumeros);
		String valorEsperado = "fibo<8>: 0 1 1 2 3 5 8 13 ";
		
		salida.aplicarSalida();
		String valorObtenido = salida.getCadenaSalida();
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
