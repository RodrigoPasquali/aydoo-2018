package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestFormato {
	
	@Test
	public void formatoDeberiaDevolver0_1_1_2_3(){
		Formato formateador = new Formato("", "");
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		formateador.aplicarFormato(listaNumeros);
		
		String valorObtenido = formateador.getSucesion();
		String valorEsprado = "fibo<5>: 0 1 1 2 3 ";
		
		Assert.assertEquals(valorEsprado, valorObtenido);
	}
	
	@Test
	public void formatoDeberiaDevolver0_1_1_2_3_5_8_13(){
		Formato formateador = new Formato("", "");
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		listaNumeros.add(5 , 5);
		listaNumeros.add(6 , 8);
		listaNumeros.add(7 , 13);
		
		formateador.aplicarFormato(listaNumeros);
		
		String valorObtenido = formateador.getSucesion();
		String valorEsprado = "fibo<8>: 0 1 1 2 3 5 8 13 ";
		
		Assert.assertEquals(valorEsprado, valorObtenido);
	}
	
	@Test
	public void formatoDeberiaDevolverFormatoHorizontalCuandoArgumentoEsH() {
		String orientacion = "h";
		Formato formateador = new Formato(orientacion, "d");
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		listaNumeros.add(5 , 5);
		listaNumeros.add(6 , 8);
		listaNumeros.add(7 , 13);
		
		formateador.aplicarFormato(listaNumeros);
		
		String valorObtenido = formateador.getSucesion();
		String valorEsprado = "fibo<8>: 0 1 1 2 3 5 8 13 ";
		
		Assert.assertEquals(valorEsprado, valorObtenido);
	}
	
	@Test
	public void formatoDeberiaDevolverFormatoVerticalCuandoArgumentoEsV() {
		String orientacion = "v";
		Formato formateador = new Formato(orientacion, "d");
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		listaNumeros.add(5 , 5);
		listaNumeros.add(6 , 8);
		listaNumeros.add(7 , 13);
		
		formateador.aplicarFormato(listaNumeros);
		
		String valorObtenido = formateador.getSucesion();
		String valorEsprado = "fibo<8>: " + "\r\n"
										+ "0" + "\r\n"
										+ "1" + "\r\n"
										+ "1" + "\r\n"
										+ "2" + "\r\n"
										+ "3" + "\r\n"
										+ "5" + "\r\n"
										+ "8" + "\r\n"
										+ "13";
		
		Assert.assertEquals(valorEsprado, valorObtenido);
	}
	
	@Test
	public void formatoDeberiaDevolverFormatoDirectoCuandoArgumentoEsD() {
		String direccion = "d";
		Formato formateador = new Formato("h", direccion);
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		listaNumeros.add(5 , 5);
		listaNumeros.add(6 , 8);
		listaNumeros.add(7 , 13);
		
		formateador.aplicarFormato(listaNumeros);
		
		String valorObtenido = formateador.getSucesion();
		String valorEsprado = "fibo<8>: 0 1 1 2 3 5 8 13 ";
		
		Assert.assertEquals(valorEsprado, valorObtenido);
	}
	
	@Test
	public void formatoDeberiaDevolverFormatoIndirectoCuandoArgumentoEsI() {
		String direccion = "i";
		Formato formateador = new Formato("h", direccion);
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		listaNumeros.add(5 , 5);
		listaNumeros.add(6 , 8);
		listaNumeros.add(7 , 13);
		
		formateador.aplicarFormato(listaNumeros);
		
		String valorObtenido = formateador.getSucesion();
		String valorEsprado = "fibo<8>: 13 8 5 3 2 1 1 0 ";
		
		Assert.assertEquals(valorEsprado, valorObtenido);
	}
	
	@Test
	public void formatoDeberiaDevolverFormatoIndirectoYVerticalCuandoArgumentosSonVI() {
		String posicion = "v";
		String direccion = "i";
		Formato formateador = new Formato(posicion, direccion);
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		listaNumeros.add(5 , 5);
		listaNumeros.add(6 , 8);
		listaNumeros.add(7 , 13);
		
		formateador.aplicarFormato(listaNumeros);
		
		String valorObtenido = formateador.getSucesion();
		String valorEsprado = "fibo<8>: " + "\r\n"
				+ "13" + "\r\n"
				+ "8" + "\r\n"
				+ "5" + "\r\n"
				+ "3" + "\r\n"
				+ "2" + "\r\n"
				+ "1" + "\r\n"
				+ "1" + "\r\n"
				+ "0";
		
		Assert.assertEquals(valorEsprado, valorObtenido);
	}
	
	@Test
	public void formatoDeberiaVolverOpcionNovalidaCuandoSeIngresaZD() {
		String posicion = "z";
		String direccion = "d";
		Formato formateador = new Formato(posicion, direccion);
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		listaNumeros.add(5 , 5);
		listaNumeros.add(6 , 8);
		listaNumeros.add(7 , 13);
		String valorEsperado = "Opcion no valida";
		formateador.aplicarFormato(listaNumeros);
		
		String valorObtenido = formateador.getSucesion();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void formatoDeberiaVolverOpcionNovalidaCuandoSeIngresaHK() {
		String posicion = "h";
		String direccion = "k";
		Formato formateador = new Formato(posicion, direccion);
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		listaNumeros.add(5 , 5);
		listaNumeros.add(6 , 8);
		listaNumeros.add(7 , 13);
		String valorEsperado = "Opcion no valida";
		formateador.aplicarFormato(listaNumeros);
		
		String valorObtenido = formateador.getSucesion();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
