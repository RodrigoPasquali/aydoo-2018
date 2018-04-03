package ar.edu.untref.aydoo;

public class Vaso {
	
	private int cantidadDeAzucar;
	private String sustancia;
	
	public void setCantidadDeAzucar(int cantidad){
		this.cantidadDeAzucar = cantidad;
	}

	public int getCantidadDeAzucar() {
		return this.cantidadDeAzucar;
	}

	public void setSustancia(String unaSustancia) {
		this.sustancia = unaSustancia;
	}
	
	public boolean tieneCafe() {
		boolean poseeCafe = false;
		this.sustancia = this.sustancia.toLowerCase();
		if(this.sustancia == "cafe"){
			poseeCafe = true;
		}
		return poseeCafe;		
	}

	public boolean tieneAzucar() {
		boolean poseeAzucar = false;
		if(this.cantidadDeAzucar > 0 ){
			poseeAzucar = true;
		}
		return poseeAzucar;
	}

}
