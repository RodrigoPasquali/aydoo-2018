package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class CalculadorFibo {
	
	private List<Integer> sucesionFibo;
	
	public CalculadorFibo(){
		sucesionFibo = new LinkedList<Integer>();
	}
	
	public List<Integer> calcularSucecion(int numeroSuceciones){
		//String respuesta;
		int numero1 = 0;
		int numero2 = 1;
		int total = 0;	
		sucesionFibo.add(numero1);
 		if(numeroSuceciones > 0){
 			for(int i = 0; i < numeroSuceciones; i++ ){
				total = numero1 + numero2;
				numero1 = numero2;
				numero2 = total;
				sucesionFibo.add(total);
			}
		}
		//respuesta = String.valueOf(total);
		System.out.println(sucesionFibo);
		return sucesionFibo;
	}

}
