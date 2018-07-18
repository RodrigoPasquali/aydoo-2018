package ar.edu.untref.aydoo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ManejadorArgumentosEntrada {
	private String[] argumentos;
	private String tipoCliente;	
//	private List<String> listaInversiones;
//	private double[] valoresDePlazoFijo;
	private List <String[]> listaInveriones;
	
	public ManejadorArgumentosEntrada(String[] argumentosIngresados) {
		this.argumentos = argumentosIngresados;
//		this.listaInversiones = new LinkedList<String>();
		this.listaInveriones = new LinkedList<String[]>();
	}
	
	public void separarArgumentos() {
		this.tipoCliente = this.argumentos[0];
//		String cadena = Arrays.toString(this.argumentos);
//		System.out.println(cadena);
//		for(int i = 0; i < this.argumentos.length; i++) {
//			this.listaInversiones.add(this.argumentos[i]);
//		}
		/*
		System.out.println(listaInversiones);
		for(int i = 0; i < this.listaInversiones.size(); i++) {
			System.out.println(this.listaInversiones.get(i));
		}
*/

		for(int i = 0; i < this.argumentos.length; i++) {
			String[] cadena = this.argumentos[i].split(",");
			this.listaInveriones.add(cadena);
		}	

/*		
		for (int i = 0; i < listaCadenas.size(); i++) {
			System.out.println(listaCadenas.get(i));
			for(int x = 0; x < listaCadenas.get(i).length; x++) {
				System.out.println(listaCadenas.get(i)[x]);
			}
		}
*/	
	}
	
	public List<String[]> getListaInversiones() {
		return this.listaInveriones;
	}
	
}
