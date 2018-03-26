package ar.edu.untref.aydoo;

import java.io.IOException;

public class Program {
	
	public static final void main(String arg[]) throws IOException {
		CalculadorFibo calculador = new CalculadorFibo();
		calculador.calcularSucecion(0);
		calculador.calcularSucecion(1);
		calculador.calcularSucecion(5);
		calculador.calcularSucecion(8);
	}
}
