package classVender;

public class NotaFiscalEletronica extends Vender{
	
	public void emitirNotaFiscalEletronica(String nomeCliente,String nomeLoja,int CNPJ, int quantidadeProduto , double valor ) {
		System.out.println("Nome do Cliente " + nomeCliente);
		System.out.println("Nome da Loja " + nomeLoja);
		System.out.println("CNPJ :" + CNPJ);
		System.out.println("Quantidade de Produtos Comprados : " + quantidadeProduto);
		System.out.println("Valor do Produto " + valor);
	}
}
