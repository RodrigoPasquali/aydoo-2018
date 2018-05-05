package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestOrientacion {
	
	@Test
	public void deberiaDevolverOpcionNoValidaCuandoSeIngresaOrientacionF() {
		String orientacionIngresada = "f";
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(5);
		Orientacion orientacionNoValida = new OrientacionHorizontal(listaNumeros, orientacionIngresada);
		String valorEsperado = "Opciones no validas";
		
		String valorObtenido = orientacionNoValida.aplicarOrientacion();
		
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void deberiaDevolver01123CuandoSeIngresa5OrientacionHorizontal() {
		String orientacionIngresada = "h";
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0, 0);
		listaNumeros.add(1, 1);
		listaNumeros.add(2, 1);
		listaNumeros.add(3, 2);
		listaNumeros.add(4, 3);
		Orientacion orientacionNoValida = new OrientacionHorizontal(listaNumeros, orientacionIngresada);
		String valorEsperado = "fibo<5>: 0 1 1 2 3 ";
		
		String valorObtenido = orientacionNoValida.aplicarOrientacion();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void deberiaDevolver01123CuandoSeIngresa5OrientacionVertical() {
		String orientacionIngresada = "v";
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0, 0);
		listaNumeros.add(1, 1);
		listaNumeros.add(2, 1);
		listaNumeros.add(3, 2);
		listaNumeros.add(4, 3);
		Orientacion orientacionNoValida = new OrientacionHorizontal(listaNumeros, orientacionIngresada);
		String valorEsperado = "fibo<5>: " + "\r\n"
									+ "0" + "\r\n"
									+ "1" + "\r\n"
									+ "1" + "\r\n"
									+ "2" + "\r\n"
									+ "3";
		
		String valorObtenido = orientacionNoValida.aplicarOrientacion();
		
		assertEquals(valorEsperado, valorObtenido);
	}
}
