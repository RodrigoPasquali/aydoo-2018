package ar.edu.untref.aydoo;

import java.util.List;

public class SucesionFibo {
	private Entrada entrada;
	private FuncionamientoLista calculador;
	private Orientacion orientacion;
	private Direccion direccion;
	private Salida salida;
	private String respuesta;
	
	public SucesionFibo(String[] arg){
		this.entrada = new Entrada(arg);
		this.calculador = new FuncionamientoLista();
	}

	public void generarRespuesta() throws Exception{
		this.respuesta = "Opciones no validas";
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
		}	
	}
	
	public String getRespuesta() {
		return this.respuesta;
	}
}
