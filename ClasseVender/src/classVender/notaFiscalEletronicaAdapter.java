package classVender;

public class notaFiscalEletronicaAdapter implements notas {
	
      notaFiscalEletronica nfe = new notaFiscalEletronica();
      
      public notaFiscalEletronicaAdapter(notaFiscalEletronica nfe) {
    	  this.nfe = nfe;
      }
      
	@Override
	public void emitirNotas(String nomeCliente, int CPF, String nomeLoja, int CNPJ, int quandidadeProduto,
			double Valor) {
		this.nfe.emitirNotaFiscalEletronica(nomeCliente, nomeLoja, CNPJ, quandidadeProduto, Valor);
		
	}

}
