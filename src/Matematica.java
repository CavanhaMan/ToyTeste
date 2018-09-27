
public class Matematica {
	
	public int fatorial(int n) throws MatematicaException {
		if (n < 0) {
			throw new MatematicaException("Não aceita menor do que 0 "+n);
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fatorial(n-1);
	}

}
