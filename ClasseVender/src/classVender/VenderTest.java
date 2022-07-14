package classVender;

import org.junit.Assert;
import org.junit.Test;

public class VenderTest {
	Vender v = new Vender();
	@Test
	public void verificarRetornoPrecoFinal() {
		v.setPrecoFinal(23.2);
		Assert.assertEquals(v.getPrecoFinal(), 23.2, 0);
	}
	@Test
	public void verificarRetornoTipoProduto() {
		v.setTypeProduct("VESTUARIOS");
		Assert.assertEquals(v.getTypeProduct(), "VESTUARIOS");
	}
	@Test
	public void verificarDisponibilidadeProdutoTesteTrue() {
		v.setQuantidadeProduto(11);
		v.setQuantidade(10);
		Assert.assertTrue(v.verificarDisponibilidadeProduto(v.getQuantidade()));
	}
	@Test
	public void verificarDisponibilidadeProdutoTesteFalse() {
		v.setQuantidadeProduto(10);
		v.setQuantidade(11);
		Assert.assertFalse(v.verificarDisponibilidadeProduto(v.getQuantidade()));
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
	@Test
	public void efetivarVendaTesteTrueComVendaMaiorOuIgualDezPorcentoDaQuantiadeDeProduto() {
		v.setCpf(45555);
        v.setCnpj(487511);
        v.setNomeCliente("Emanuel");
        v.setQuantidade(10);
        v.setQuantidadeProduto(11);
        v.setTypeProduct("VESTUARIOS");
        v.setValorUnidade(9);
        v.efetivarVenda();
        Assert.assertTrue(v.getValorDesconto()==27.0);
	}
	@Test
	public void verificarRetornoDoGetQuantidadeProduto() {
		v.setQuantidadeProduto(10);
		Assert.assertEquals(v.getQuantidadeProduto(), 10);
	}
	@Test
	public void verificarRetornoDoNomeDaLoja() {
		v.setNomeLoja("Loja");
		Assert.assertEquals(v.getNomeLoja(), "Loja");
	}
	@Test
	public void verificarRetornoDoCNPJ() {
		v.setCnpj(50);
		Assert.assertEquals(v.getCnpj(), 50);
	}
	@Test
	public void verificarRetornoDoNomeCliente() {
		v.setNomeCliente("MARIA");
		Assert.assertEquals(v.getNomeCliente(), "MARIA");
	}
	@Test
	public void verificarRetornoDoCPF() {
		v.setCpf(101010);
		Assert.assertEquals(v.getCpf(), 101010);
	}
	@Test
	public void verificarRetornoIDProduto() {
		v.setId_produto(2);
		Assert.assertEquals(v.getId_produto(), 2);
	}
	@Test
	public void verificarRetornoNomeProduto() {
		v.setNomeProduto("Ovo");
		Assert.assertEquals(v.getNomeProduto(), "Ovo");
	}
	@Test
	public void verificarRetornoQuantidade() {
		v.setQuantidade(10);
		Assert.assertEquals(v.getQuantidade(), 10);
	}
	@Test
	public void verificarRetornoValorUnidade() {
		v.setValorUnidade(5);
		Assert.assertEquals(v.getValorUnidade(), 5, 0);
	}
	@Test
	public void verificarRetornoValorDesconto() {
		v.setValorDesconto(23);
		Assert.assertEquals(v.getValorDesconto(), 23, 0);
	}
}
