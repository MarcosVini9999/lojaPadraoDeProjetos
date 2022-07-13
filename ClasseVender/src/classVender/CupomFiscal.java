package classVender;

public class CupomFiscal extends Vender {


	public void emitirCupomFiscal(String nomeLoja,int CNPJ,int qntd,double valor) {
		System.out.println("Nome da Loja " + nomeLoja);
		System.out.println("CNPJ :" + CNPJ);
		System.out.println("Quantidade de Produtos Comprados : " + qntd);
		System.out.println("Valor do Produto " + valor);
	}

}
