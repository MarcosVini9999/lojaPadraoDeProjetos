package classVender;


public class Main {
	public static void main (String[]args) {
		
		Vender venda = new Vender();
		
        venda.setCpf(45555);
        venda.setCnpj(487511);
        venda.setNomeCliente("Emanuel");
        venda.setQuantidade(10);         // Quantidade de produto desejada
        venda.setQuantidadeProduto(11); // Quantidade de Produto em estoque
        venda.setTypeProduct("VESTUARIOS");
        venda.setValorUnidade(9);
	    venda.efetivarVenda();
		
	}
}
