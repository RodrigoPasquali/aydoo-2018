package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {
	
	private HacedorDeCafe cafetero;
	private Lechero lechero;
	
	public HacedorDeCafeConLeche() {
		this.cafetero = new HacedorDeCafe();
		this.lechero = new Lechero();
	}
	
	public Vaso prepararEnEsteVaso(Vaso unVaso) {
		this.lechero.prepararEnEsteVaso(unVaso);
		this.cafetero.prepararEnEsteVaso(unVaso);
		return unVaso;
	}

}
