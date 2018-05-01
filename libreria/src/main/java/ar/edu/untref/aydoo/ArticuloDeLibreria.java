package ar.edu.untref.aydoo;


public class ArticuloDeLibreria extends Producto {
	 static final double IVA = 1.21;
		
	public ArticuloDeLibreria(double precioProducto) {
		super(precioProducto);
	}
	
	@Override
	public double getPrecio() {
		return this.calcularPrecioConIva();
	}
	
	private double calcularPrecioConIva() {
		double precioConIva = this.precio * IVA;
		return precioConIva;
	}

}
