package ar.edu.untref.aydoo;

import java.util.List;

public class SucesionFibo {
	private Entrada entrada;
	private CalculadorFibo calculador;
	private Orientacion orientacion;
	private Direccion direccion;
	private Salida salida;
	
	public SucesionFibo(String[] arg){
		this.entrada = new Entrada(arg);
		this.calculador = new CalculadorFibo();
	}

	public String generarRespuesta() throws Exception{
		String respuesta = "Opciones no validas";
		this.entrada.procesarParametros();
		if(!this.entrada.getDireccion().equals("Opciones no validas")){
			int cantidadSucesiones = this.entrada.getNumero();
			List<Integer> listaNumeros = this.calculador.calcularSucecion(cantidadSucesiones);
			this.direccion = new DireccionDirecta(listaNumeros, entrada.getDireccion());
			this.direccion.aplicarDireccion();
			this.orientacion = new OrientacionHorizontal(listaNumeros, entrada.getOrientacion());
			respuesta = this.orientacion.aplicarOrientacion();
			this.salida = new SalidaArchivo(respuesta, entrada.getFormatoSalida());
			this.salida.aplicarSalida();
			if(this.entrada.getFormatoSalida().contains("-f=")) {
				respuesta = "";
			} else {
				respuesta = this.salida.getCadenaSalida();
			}		
		}	
		return respuesta;	
	}
}
