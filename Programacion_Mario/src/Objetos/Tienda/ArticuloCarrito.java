package Objetos.Tienda;

public class ArticuloCarrito {
	Articulo elemento;
	int cantidad;

	/**
	 * Constructor vacio
	 */
	public ArticuloCarrito() {

	}

	/**
	 * Constructor con parametros.
	 * 
	 * @param a
	 * @param cantidad
	 */
	public ArticuloCarrito(Articulo articulo, int cantidad) {
		this.elemento = articulo;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return this.elemento + "x" + this.cantidad + "\n";
	}
}
