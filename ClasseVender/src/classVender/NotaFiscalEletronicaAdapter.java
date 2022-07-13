package classVender;

public class NotaFiscalEletronicaAdapter implements Notas {
	
      NotaFiscalEletronica nfe = new NotaFiscalEletronica();
      
      public NotaFiscalEletronicaAdapter(NotaFiscalEletronica nfe) {
    	  this.nfe = nfe;
      }
      
	@Override
	public void emitirNotas(String nomeCliente, int CPF, String nomeLoja, int CNPJ, int quandidadeProduto,
			double Valor) {
		this.nfe.emitirNotaFiscalEletronica(nomeCliente, nomeLoja, CNPJ, quandidadeProduto, Valor);
		
	}

}
