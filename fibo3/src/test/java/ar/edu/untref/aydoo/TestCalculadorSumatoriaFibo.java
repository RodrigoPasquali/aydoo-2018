package ar.edu.untref.aydoo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadorSumatoriaFibo {
	
	@Test
	public void calcularLaSumatoriaDeLaListaNumerosDeberiaDevolver7() {
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.addAll(Arrays.asList(0, 1, 1, 2, 3));
		FuncionamientoSumatoria calculador = new FuncionamientoSumatoria();
		int valorEsperado = 7;
		
		int valorObtenido = calculador.calcularSumatoria(listaNumeros);
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

}
