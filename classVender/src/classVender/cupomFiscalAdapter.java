package classVender;

public class cupomFiscalAdapter implements notas{

	private cupomFiscal cf;
	public cupomFiscalAdapter(cupomFiscal cf) {
		this.cf = cf;
	}
	@Override
	public void emitirNotas(String nomeCliente, int CPF, String nomeLoja, int CNPJ, int quandidadeProduto,
			double valor) {
	//	this.cf.emitirCupomFiscal(null,0,nomeLoja,CNPJ,quandidadeProduto,valor);
		this.cf.emitirCupomFiscal(nomeLoja, CNPJ, quandidadeProduto,valor);
		
	}

}
