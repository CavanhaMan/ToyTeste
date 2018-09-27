import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatematicaTest {
	
	private Matematica matematica; 
	
	@Before
	public void init() {
		matematica = new Matematica();
	}
	
	@Test
	public void testaFatorialZero() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(0);
		Assert.assertEquals(resposta,BigDecimal.ONE);
	}
	
	@Test
	public void testaFatorialUm() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(1);
		Assert.assertEquals(resposta,BigDecimal.ONE);
	}


	@Test(expected=MatematicaException.class)
	public void testaFatorialMenorZero() throws MatematicaException {
		matematica.fatorial(-5);
	}
	
	@Test
	public void testaFatorialCinco() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(5);
		Assert.assertEquals(resposta,new BigDecimal(120));
	}
	
	@Test
	public void testaFatorialDoze() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(12);
		Assert.assertEquals(resposta,new BigDecimal(479001600));
	}
	
	@Test
	public void testaFatorialTreze() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(13);
		Assert.assertEquals(resposta,new BigDecimal(6227020800l));
	}
	
	@Test
	public void testaFatorialCem() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(100);
		Assert.assertEquals(resposta,new BigDecimal(6227020800l));
	}

}
