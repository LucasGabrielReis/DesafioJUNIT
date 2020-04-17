public class JulgamentoPrisioneiro {
	private int PENA_INOCENCIA = 10;
	private int PENA_CONDENACAO_MUTUA = 15;
	private int PENA_CONDENACAO_INDIVIDUAL = 10;
	private int PENA_CONDENACAO_CUMPLICES = 11;

	public int calculaPena(String StringPrisioneiroA, String StringPrisioneiroB) {
		if (StringPrisioneiroA == String.DELACAO) {
			if (StringPrisioneiroB == String.DELACAO) {
				return PENA_CONDENACAO_MUTUA;
			} else {
				return PENA_INOCENCIA;
			}
		} else {
			if (StringPrisioneiroB == String.DELACAO) {
				return PENA_CONDENACAO_INDIVIDUAL;
			} else {
				return PENA_CONDENACAO_CUMPLICES;
			}
		}
	}
}
