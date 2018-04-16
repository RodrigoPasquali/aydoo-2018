package ar.edu.untref.aydoo;

import java.util.List;

public class SucesionFibo {
	private Entrada entrada;
	private Formato formateador ;
	private CalculadorFibo calculador;
	
	public SucesionFibo(String[] arg){
		this.entrada = new Entrada(arg);
		this.formateador = new Formato("", "");
		this.calculador = new CalculadorFibo();
	}

	public String generarRespuesta() throws Exception{
		int cantidadSucesiones = this.entrada.getNumero();
		List<Integer> listaNumeros = this.calculador.calcularSucecion(cantidadSucesiones);
		this.formateador.aplicarFormato(listaNumeros);
		String cadenaObtenida = this.formateador.getSucesion();
		return cadenaObtenida;	
	}
}
