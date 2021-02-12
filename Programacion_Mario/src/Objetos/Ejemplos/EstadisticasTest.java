package Objetos.Ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EstadisticasTest {

	@Test
	@DisplayName(value = "Test media tres notas: 7, 8.2, 4")
	void testMedia() {
		float notas [] = {7.0F, 8.2F, 4.0F};
		
		float notamedia = Estadisticas.media(notas);
		assertEquals(notamedia, 6.4F);
//		fail("Not yet implemented");
	}

	@Test
	@DisplayName(value = "Test media tres notas: 7, 8.2, 4")
	void testMedia1() {
		float notas [] = {7.0F, 8.2F, 4.0F};
		
		float notamedia = Estadisticas.media(notas);
		assertEquals(notamedia, 0F);
//		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName(value="Test moda notas del curso: 7, 7, 7, 8, 2, 6, 6, 4, 6, 5, 1, 6, 9")
	void testModa() {
		float notas[]= { 7, 7, 7, 8, 2, 6, 6, 4, 6, 5, 1, 6, 9};
		
		float notamedia = Estadisticas.moda(notas);
		assertEquals(notamedia, 6);
//		fail("Not yet implemented");
	}

	@Test
	void testPermutaciones() {
		fail("Not yet implemented");
	}

	@Test
	void testVariacionSR() {
		fail("Not yet implemented");
	}

	@Test
	void testVariacionCR() {
		fail("Not yet implemented");
	}

}
