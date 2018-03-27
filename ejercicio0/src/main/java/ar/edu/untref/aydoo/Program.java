package ar.edu.untref.aydoo;

import java.io.IOException;

public class Program {
	
	public static final void main(String arg[]) throws IOException {
		CalculadorFibo calculador = new CalculadorFibo();
	/*	calculador.calcularSucecion(0);
		calculador.calcularSucecion(1);
		calculador.calcularSucecion(5);
		calculador.calcularSucecion(8);
	*/
		
		Formato formateador = new Formato();
		
		formateador.aplicarFormato(calculador.calcularSucecion(5));
		System.out.println(formateador.getSucesion());
		
		formateador.aplicarFormato(calculador.calcularSucecion(8));
		System.out.println(formateador.getSucesion());
	}
}
