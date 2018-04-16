package ar.edu.untref.aydoo;

public class Program {
	
	public static final void main(String arg[]) throws Exception {
		SucesionFibo sucesion = new SucesionFibo(arg);
		System.out.println(arg[0]);
		System.out.println(sucesion.generarRespuesta());
	}
}
