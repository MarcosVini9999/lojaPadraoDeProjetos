package classVender;


public class main {
	public static void main (String[]args) {
		
		desconto d2 = new desconto();
		vender venda = new vender();
		
        venda.setCpf(45555);
        venda.setCnpj(487511);
        venda.setNomeCliente("Emanuel");
        venda.setQuantidade(50);         // Quantidade de produto desejada
        venda.setQuantidadeProduto(500); // Quantidade de Produto em estoque
        venda.setTypeProduct("VESTUARIOS");
        venda.setValorUnidade(9);
	    venda.efetivarVenda();
		
	}
}
