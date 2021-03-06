package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class CalculadorFibo {
	
	private List<Integer> sucesionFibo;
	
	public CalculadorFibo(){
		sucesionFibo = new LinkedList<Integer>();
	}
	
	public List<Integer> calcularSucecion(int numeroSuceciones){
		int numero1 = 0;
		int numero2 = 1;
		int total = 0;	
		sucesionFibo.add(numero1);
 		if(numeroSuceciones >= 1){
 			numeroSuceciones = numeroSuceciones -1;
 			sucesionFibo.add(numero2);
 			for(int i = 1; i < numeroSuceciones; i++ ){
				total = numero1 + numero2;
				numero1 = numero2;
				numero2 = total;
				sucesionFibo.add(total);
			}
		}
		return sucesionFibo;
	}	
}
