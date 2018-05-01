package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

	private String nombre;
	private String direccion;
	private CuentaCorriente cuentaCorriente;
	private List<Compra> listaDeCompras;
	private List<Suscripcion> listaDeSuscripciones;

	public Cliente(String nombreIngresado, String direccionIngresado) {
		this.nombre = nombreIngresado;
		this.direccion = direccionIngresado;
		this.listaDeCompras = new LinkedList<Compra>();
		this.listaDeSuscripciones = new LinkedList<Suscripcion>();
	}

	public void setCuentaCorriente(CuentaCorriente cuentaCorrienteIngresada) {
		this.cuentaCorriente = cuentaCorrienteIngresada;
	}

	public void realizarComprar(Compra compraRealizada) {
		this.listaDeCompras.add(compraRealizada);
	}
	
	public List<Compra> getListaCompras() {
		return this.listaDeCompras;
	}

	public void realizarSuscripcion(Suscripcion suscripcionNueva) {
		this.listaDeSuscripciones.add(suscripcionNueva);
	}

	public List<Suscripcion> getListaSuscripciones() {
		return this.listaDeSuscripciones;
	}

}
