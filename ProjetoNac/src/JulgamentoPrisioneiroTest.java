import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JulgamentoPrisioneiroTest {
	
	JulgamentoPrisioneiro obj = new JulgamentoPrisioneiro();

	@Test
	void testCalculaPenaMutua() {
		int resultadoEsperado = 5;
		int resultadoReal = obj.calculaPena("Culpado", "Culpado");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCalculaInocencia() {
		int resultadoEsperado = 0;
		int resultadoReal = obj.calculaPena("Inocente", "Inocente");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCalculaPenaIndividual() {
		int resultadoEsperado = 10;
		int resultadoReal = obj.calculaPena("Culpado", "Inocente");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCalculaPenaCumplices() {
		int resultadoEsperado = 1;
		int resultadoReal = obj.calculaPena("Inocente", "Culpado");
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
