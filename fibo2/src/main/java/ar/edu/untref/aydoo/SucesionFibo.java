package ar.edu.untref.aydoo;

import java.util.List;

public class SucesionFibo {
	private Entrada entrada;
	private Formato formateador ;
	private CalculadorFibo calculador;
	
	public SucesionFibo(){
		this.entrada = new Entrada();
		this.formateador = new Formato();
		this.calculador = new CalculadorFibo();
	}

	public String generarRespuesta(String[] arg) throws Exception{
		int cantidadSucesiones = this.entrada.getNumero(arg);
		List<Integer> listaNumeros = this.calculador.calcularSucecion(cantidadSucesiones);
		this.formateador.aplicarFormato(listaNumeros);
		String cadenaObtenida = this.formateador.getSucesion();
		return cadenaObtenida;	
	}
}
