package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {
	
	private HacedorDeTe tetero;
	private Lechero lechero;
	
	public HacedorDeTeConLeche() {
		this.tetero = new HacedorDeTe();
		this.lechero = new Lechero();
	}
	
	public Vaso prepararEnEsteVaso(Vaso unVaso) {
		this.lechero.prepararEnEsteVaso(unVaso);
		this.tetero.prepararEnEsteVaso(unVaso);
		return unVaso;
	}

}
