package ar.edu.untref.aydoo;

import java.util.Collections;
import java.util.List;

public class Formato {
	
	private String respuestaGenerada;
	private String orientacion;
	private String direccion;
		
	public Formato(String orientacionIngresada, String direccionIngresada) {
		this.aplicarFormatoEstandar(orientacionIngresada, direccionIngresada);
	}

	public void aplicarFormato(List<Integer> listaNumeros){
		this.respuestaGenerada = "fibo<" +listaNumeros.size() + ">: ";
		if(this.verificarOrientacion(this.orientacion ) && this.verificarDireccion(this.direccion)) {
				this.aplicarDireccion(listaNumeros);
				for(int i = 0; i < listaNumeros.size(); i++){
					this.aplicarOrientacion(listaNumeros, i);
				}
		} else {
			this.respuestaGenerada = "Opcion no valida";
		}
	}
	
	private void aplicarOrientacion(List<Integer> listaNumeros, int posicion) {
		if(this.orientacion.equals("v")) {
			this.aplicarOrientacionVertical(listaNumeros, posicion);
		} else {
			this.aplicarOrientacionHorizontal(listaNumeros, posicion);
		}
	}
	
	private void aplicarOrientacionHorizontal(List<Integer> listaNumeros, int posicion) {
		this.respuestaGenerada = this.respuestaGenerada + listaNumeros.get(posicion).toString() + " ";
	}
	
	private void aplicarOrientacionVertical(List<Integer> listaNumeros, int posicion) {
		this.respuestaGenerada = this.respuestaGenerada + "\r\n" +  listaNumeros.get(posicion).toString();
	}
	
	private void aplicarDireccion(List<Integer> listaNumeros) {
		if(this.direccion.equals("i")) {
			Collections.reverse(listaNumeros);
		}
	}	
	
	private boolean verificarOrientacion(String orientacionIngresada) {
		boolean orientacionCorrecta = false;
		if(orientacionIngresada.equals("h")  || orientacionIngresada.equals("v") ) {
			orientacionCorrecta = true;
		}
		return orientacionCorrecta;
	}
	
	private boolean verificarDireccion(String direccionIngresada) {
		boolean direccionCorrecta = false;
		if(direccionIngresada.equals("d" )|| direccionIngresada.equals("i")) {
			direccionCorrecta = true;
		}
		return direccionCorrecta;
	}
	
	private void aplicarFormatoEstandar(String orientacionIngresada, String direccionIngresada) {
		if(orientacionIngresada.equals("") && direccionIngresada.equals("")) {
			this.orientacion = "h";
			this.direccion = "d";
		} else {
			this.orientacion = orientacionIngresada;
			this.direccion = direccionIngresada;
		}
			
	}
	
	public String getSucesion(){
		return respuestaGenerada;
	} 

}
