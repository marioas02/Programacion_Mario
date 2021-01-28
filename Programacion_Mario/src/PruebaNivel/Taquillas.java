package PruebaNivel;

public class Taquillas {
	int numero;
	String codSocio;
	boolean cerrada;
	
	public Taquillas() {
		
	}
	
	public Taquillas(int numero, String socio, boolean cerrada) {
		setNumero(numero);
		setCodSocio(socio);
		setCerrada(cerrada);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCodSocio() {
		return codSocio;
	}

	public void setCodSocio(String codSocio) {
		this.codSocio = codSocio;
	}

	public boolean getCerrada() {
		return cerrada;
	}

	public void setCerrada(boolean cerrada) {
		this.cerrada = cerrada;
	}

	@Override
	public String toString() {
		String estado = "abierta";
		if(this.cerrada)
			estado = "cerrada";
		return "Taquilla no: " +this.numero+"\nPertenece al socio: "+this.codSocio+"\nEstado: "+estado+"\n";
	}
	

}
