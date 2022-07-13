package classVender;

public class CupomFiscalAdapter implements Notas{

	private CupomFiscal cf;
	public CupomFiscalAdapter(CupomFiscal cf) {
		this.cf = cf;
	}
	@Override
	public void emitirNotas(String nomeCliente, int CPF, String nomeLoja, int CNPJ, int quandidadeProduto,
			double valor) {
	//	this.cf.emitirCupomFiscal(null,0,nomeLoja,CNPJ,quandidadeProduto,valor);
		this.cf.emitirCupomFiscal(nomeLoja, CNPJ, quandidadeProduto,valor);
		
	}

}
