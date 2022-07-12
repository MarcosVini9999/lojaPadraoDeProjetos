package classVender;


public class main {
	public static void main (String[]args) {
		desconto d1 = desconto.getInstancia();
		cupomFiscal f1 = new cupomFiscal();
		notas n = new cupomFiscalAdapter(new cupomFiscal());
		notas n1 = new notaFiscalEletronicaAdapter(new notaFiscalEletronica());
		vender v = new vender();
		
		v.quantidade = 10;
		v.valorUnidade = 5;
		v.nomeLoja = "Lagoa";
		v.cnpj = 1258788;
		v.nomeCliente = "Emanuel";
		v.cpf = 55588;
		notaFiscalEletronica nfe = new notaFiscalEletronica();
		desconto d2 = desconto.getInstancia();
		desconto d3 = desconto.getInstancia();
		System.out.println(d1);
		d1.quantidade = 10;
		d1.valorUnidade = 10;
		d1.valorDesconto = 15;
		d3.valorDesconto = 20;
		System.out.println(d2.aplicarDesconto());
		//f1.emitirCupomFiscal(v.nomeLoja, v.cnpj, v.valorUnidade, v.quantidade);
		n.emitirNotas(v.nomeCliente, v.cpf, v.nomeLoja, v.cnpj, v.quantidade, v.valorUnidade);
		System.out.println();
		n1.emitirNotas(v.nomeCliente, v.cpf, v.nomeLoja, v.cnpj, v.quantidade, v.valorUnidade);
		System.out.println();
	}
}
