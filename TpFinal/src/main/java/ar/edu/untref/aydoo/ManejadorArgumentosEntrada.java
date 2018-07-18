package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class ManejadorArgumentosEntrada {
	private String[] argumentos;
	private String tipoCliente;	
	private List <String[]> listaInveriones;
	
	public ManejadorArgumentosEntrada(String[] argumentosIngresados) {
		this.argumentos = argumentosIngresados;
		this.listaInveriones = new LinkedList<String[]>();
	}
	
	public void separarArgumentos() {
		this.tipoCliente = this.argumentos[0];
		for(int i = 1; i < this.argumentos.length; i++) {
			String[] cadena = this.argumentos[i].split(",");
			this.listaInveriones.add(cadena);
		}	
	}
	
	public List<String[]> getListaInversiones() {
		return this.listaInveriones;
	}
	
	public String getTipoCliente() {
		return this.tipoCliente;
	}
	
}
