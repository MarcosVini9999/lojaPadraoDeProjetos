package classVender;

import org.junit.Assert;
import org.junit.Test;

public class VenderTest {
	Vender v = new Vender();
	@Test
	public void verificarDisponibilidadeProdutoTeste() {
		v.setQuantidadeProduto(11);
		v.setQuantidade(10);
		Assert.assertTrue(v.verificarDisponibilidadeProduto(v.getQuantidade()));
	}
	@Test
	public void verificarQuantidadeVendida() {
		v.setQuantidade(100);
		Assert.assertEquals(v.getQuantidade(), 100);
	}
	@Test
	public void verificarValorSetadoPorProduto() {
		v.setValorUnidade(15.00);
		Assert.assertEquals(v.getValorUnidade(), 15.00, 0);
	}
}
