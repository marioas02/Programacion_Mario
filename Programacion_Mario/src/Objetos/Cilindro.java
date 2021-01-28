package Objetos;

public class Cilindro {
	// ATRIBUTOS O PROPIEDADES
		double altura;
		double radio;

		public Cilindro(double altura, double radio) {
			this.altura=altura;
			this.radio = radio;
	
		}
		
		public Cilindro() {
			
		}
		
		// METODOS
		public double area(double altura, double radio) {
			double area1 = (2*3.14*radio*altura)+(2*3.14*radio*2);
			return area1;
		}

		// METODOS
		public double volumen(double altura, double radio) {
			double volumen1=(3.14*radio*radio*altura);
			return volumen1;
		}
	}


