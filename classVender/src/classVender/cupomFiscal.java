package classVender;

public class cupomFiscal extends vender {

	public void emitirCupomFiscal(String nomeLoja,int CNPJ,double valorProduto,double valor) {
		System.out.println("Nome da Loja " + nomeLoja);
		System.out.println("CNPJ :" + CNPJ);
		System.out.println("Quantidade de Produtos Comprados : " + valor);
		System.out.println("Valor do Produto " + valorProduto);
	}

}
