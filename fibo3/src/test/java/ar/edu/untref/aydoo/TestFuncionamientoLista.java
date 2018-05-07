package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestFuncionamientoLista {

		@Test
		public void calcularSucesionDe0DeberiaDevolver0(){
			List<Integer> valorEsperado = new LinkedList<Integer>();
			List<Integer> valorObtenido = new LinkedList<Integer>();
			FuncionamientoLista calculador = new FuncionamientoLista(0, "l");
			
			valorObtenido =calculador.aplicarFuncionamiento();;
			valorEsperado.add(0);
			
			Assert.assertEquals(valorEsperado, valorObtenido);
		}
		
		@Test
		public void calcularSucesionDe1DeberiaDevolver01(){
			List<Integer> valorEsperado = new LinkedList<Integer>();
			List<Integer> valorObtenido = new LinkedList<Integer>();
			FuncionamientoLista calculador = new FuncionamientoLista(1, "l");
			valorEsperado.add(0);
			valorEsperado.add(1);
			
			valorObtenido = calculador.aplicarFuncionamiento();
			
			Assert.assertEquals(valorEsperado, valorObtenido);
		}
		
		@Test
		public void calcularSucesionDeDeberiaDevolver01123(){
			List<Integer> valorEsperado = new LinkedList<Integer>();
			List<Integer> valorObtenido = new LinkedList<Integer>();
			FuncionamientoLista calculador = new FuncionamientoLista(5, "l");
			valorEsperado.add(0);
			valorEsperado.add(1);
			valorEsperado.add(1);
			valorEsperado.add(2);
			valorEsperado.add(3);
	
			valorObtenido = calculador.aplicarFuncionamiento();
			
			Assert.assertEquals(valorEsperado, valorObtenido);
		}
		
		@Test
		public void calcularSucesionDe8DeberiaDevolver011235813(){
			List<Integer> valorEsperado = new LinkedList<Integer>();
			List<Integer> valorObtenido = new LinkedList<Integer>();
			FuncionamientoLista calculador = new FuncionamientoLista(8, "");
			valorEsperado.add(0);
			valorEsperado.add(1);
			valorEsperado.add(1);
			valorEsperado.add(2);
			valorEsperado.add(3);
			valorEsperado.add(5);
			valorEsperado.add(8);
			valorEsperado.add(13);

			valorObtenido = calculador.aplicarFuncionamiento();

			Assert.assertEquals(valorEsperado, valorObtenido);
		}
		
		@Test
		public void calcularSucesionDe3DeberiaDevolver011235813(){
			List<Integer> valorEsperado = new LinkedList<Integer>();
			List<Integer> valorObtenido = new LinkedList<Integer>();
			Funcionamiento calculador = new FuncionamientoLista(3, "");
			valorEsperado.add(0);
			valorEsperado.add(1);
			valorEsperado.add(1);

			valorObtenido = calculador.aplicarFuncionamiento();

			Assert.assertEquals(valorEsperado, valorObtenido);
		}
}
