package Objetos.Tienda;

import java.util.ArrayList;

public class Carrito {
	ArrayList<ArticuloCarrito> pedido;
	float total;
	boolean confirmado;
	
	public static boolean CONFIRMADO = true;
	public static boolean PENDIENTE = false;
	
	public Carrito() {
		pedido = new ArrayList<ArticuloCarrito>();
		total = 0;
		confirmado = PENDIENTE;
	}
	
	@SuppressWarnings("unused")
	private float calculaTotal() {
		float acumulado = 0;
		for(ArticuloCarrito ac: this.pedido) {
			acumulado += ac.elemento.getPrecio()*ac.cantidad;
		}
		return acumulado;
	}
	

}
