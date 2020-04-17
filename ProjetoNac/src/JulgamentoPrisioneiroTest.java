import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JulgamentoPrisioneiroTest {

	@Test
	void testCalculaPena() {
		JulgamentoPrisioneiro obj = new JulgamentoPrisioneiro();
		int resultadoEsperado = 5;
		int resultadoReal = obj.calculaPena("Culpado", "Culpado");
		assertEquals(resultadoEsperado, resultadoReal);
		
	}

}
