import java.math.BigDecimal;

public class Matematica {
	
	public BigDecimal fatorial(int n) throws MatematicaException {
		if (n < 0) {
			throw new MatematicaException("Não aceita menor do que 0 "+n);
		}
		if (n == 0 || n == 1) {
			return BigDecimal.ONE;
		}
		return BigDecimal.valueOf(n).multiply(fatorial(n-1));
	}

}
