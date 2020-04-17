public class JulgamentoPrisioneiro {
	private int PENA_INOCENCIA = 0;
	private int PENA_CONDENACAO_MUTUA = 5;
	private int PENA_CONDENACAO_INDIVIDUAL = 10;
	private int PENA_CONDENACAO_CUMPLICES = 1;

	public int calculaPena(String StringPrisioneiroA, String StringPrisioneiroB) {
		if (StringPrisioneiroA.equalsIgnoreCase("Culpado")) {
			if (StringPrisioneiroB.equalsIgnoreCase("Culpado")){
				return PENA_CONDENACAO_MUTUA;
			} else {
				return PENA_CONDENACAO_INDIVIDUAL;
			}
		}
		else {
			if (StringPrisioneiroB.equalsIgnoreCase("Culpado")){
				return PENA_CONDENACAO_CUMPLICES;
			} else {
				return PENA_INOCENCIA;
			}
		}
	}
}
