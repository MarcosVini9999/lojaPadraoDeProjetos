package classVender;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DescontoTest {
	Desconto d = new Desconto();
	@Test
	public void aplicarDescontoTest() {
		Assert.assertTrue(d.aplicarDesconto(10, 10, 10) == 90);
	}
	
	@Test
	public void verificarPrecoDesconto() {
		d.setPrecoDesconto(20);
		Assert.assertEquals(d.getPrecoDesconto(), 20,0);
	}

}