package ar.edu.untref.aydoo;

import java.util.List;

public class SucesionFibo {
	private Entrada entrada;
	private Orientacion orientacion;
	private Direccion direccion;
	private Salida salida;
	private Funcionamiento funcionamiento;
	private String respuesta;
	
	public SucesionFibo(String[] arg){
		this.entrada = new Entrada(arg);
	}

	public void generarRespuesta() throws Exception{
		this.respuesta = "Opciones no validas";
		this.entrada.procesarParametros();
		if(!this.entrada.getDireccion().equals("Opciones no validas")){
			Integer cantidadSucesiones = this.entrada.getNumero();
			String funcionamientoIngresado = this.entrada.getFuncionamiento();
			if(funcionamientoIngresado.equals("s")) {
				this.funcionamiento = new FuncionamientoLista(cantidadSucesiones, funcionamientoIngresado);
				Integer sumatoria = this.funcionamiento.aplicarFuncionamiento().get(0);
				respuesta = "fibo<"  + cantidadSucesiones.toString() + ">s: " + sumatoria.toString();
				this.salida = new SalidaArchivo(respuesta, entrada.getFormatoSalida());
				this.salida.aplicarSalida();
			} else {
				this.funcionamiento = new FuncionamientoLista(cantidadSucesiones, funcionamientoIngresado);
				this.funcionamiento.aplicarFuncionamiento();
				List<Integer> listaNumeros = this.funcionamiento.getListaNumeros();
				this.direccion = new DireccionDirecta(listaNumeros, entrada.getDireccion());
				this.direccion.aplicarDireccion();
				this.orientacion = new OrientacionHorizontal(listaNumeros, entrada.getOrientacion());
				respuesta = this.orientacion.aplicarOrientacion();
				this.salida = new SalidaArchivo(respuesta, entrada.getFormatoSalida());
				this.salida.aplicarSalida();
			}
		}	
	}
	
	public String getRespuesta() {
		return this.respuesta;
	}
}
