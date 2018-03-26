package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadorFibo {

		@Test
		public void calcularSucesionDeberiaDevolver0(){
			List<Integer> valorEsperado = new LinkedList<Integer>();
			List<Integer> valorObtenido = new LinkedList<Integer>();
			CalculadorFibo calculador = new CalculadorFibo();
			valorObtenido = calculador.calcularSucecion(0);
			valorEsperado.add(0);
			
			Assert.assertEquals(valorEsperado, valorObtenido);
		}
		
		@Test
		public void calcularSucesionDeberiaDevolver01(){
			List<Integer> valorEsperado = new LinkedList<Integer>();
			List<Integer> valorObtenido = new LinkedList<Integer>();
			CalculadorFibo calculador = new CalculadorFibo();
			valorObtenido = calculador.calcularSucecion(1);
			valorEsperado.add(0);
			valorEsperado.add(1);
			
			Assert.assertEquals(valorEsperado, valorObtenido);
		}
		
		@Test
		public void calcularSucesionDeberiaDevolver01123(){
			List<Integer> valorEsperado = new LinkedList<Integer>();
			List<Integer> valorObtenido = new LinkedList<Integer>();
			CalculadorFibo calculador = new CalculadorFibo();
			valorObtenido = calculador.calcularSucecion(5);
			valorEsperado.add(0);
			valorEsperado.add(1);
			valorEsperado.add(1);
			valorEsperado.add(2);
			valorEsperado.add(3);
			
			Assert.assertEquals(valorEsperado, valorObtenido);
		}
}
