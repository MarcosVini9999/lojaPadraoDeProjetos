package classVender;


public class Vender {
	
	private int Id_produto;
	private String nomeProduto;
	public int quantidade;
	private int quantidadeProduto ;
	public String typeProduct;
	protected double valorUnidade;
	protected double valorDesconto;
	protected double precoFinal;
	protected String nomeLoja = "MAGALU";
	protected int cnpj;
	
    
	public String getTypeProduct() {
		return typeProduct;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}


	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public void setTypeProduct(String typeProduct) {
		this.typeProduct = typeProduct;
	}

	protected String nomeCliente;
	protected int cpf;
	
	
	public boolean verificarDisponibilidadeProduto(int quantidade) {
		if (quantidadeProduto < quantidade){
			return false;
		} else {
		return true;
		}
		
	}
	
	public void efetivarVenda() {
	   if(verificarDisponibilidadeProduto(quantidade)) {
		   if (quantidade >= 0.1*quantidadeProduto) {
				   //setQuantidade(quantidade);
				   TipoProduto tipo = TipoProduto.valueOf(typeProduct);
				   Desconto d1 = Desconto.getInstancia(); 
				   
				   Notas n = new CupomFiscalAdapter(new CupomFiscal());
				   Notas n1 = new NotaFiscalEletronicaAdapter(new NotaFiscalEletronica());
				   
				   setValorDesconto( tipo.conseguirDesconto().calcularDesconto(valorUnidade*quantidade));
				   
				   System.out.println("========");
				   n.emitirNotas(getNomeCliente(), getCpf(), getNomeLoja(), getCnpj(), quantidade, valorUnidade);
				   System.out.println("========");
				   System.out.println();
				   System.out.println("========");
				   n1.emitirNotas(nomeCliente, cpf, nomeLoja, cnpj, quantidade, valorUnidade);
				   System.out.println("========");
				   System.out.println("\nPreco de Atacado : "+d1.aplicarDesconto(quantidade, valorUnidade, getValorDesconto()));
		      } else {
			        Notas n = new CupomFiscalAdapter(new CupomFiscal());
			        Notas n1 = new NotaFiscalEletronicaAdapter(new NotaFiscalEletronica());
				    n.emitirNotas(getNomeCliente(), getCpf(), getNomeLoja(), getCnpj(), quantidade, valorUnidade);
				    System.out.println();
				    n1.emitirNotas(nomeCliente, cpf, nomeLoja, cnpj, quantidade, valorUnidade);
		    	    System.out.println("\nPre�o de Varejo : "+getQuantidade()*getValorUnidade());
		      }
		   } else {

		            System.out.println("\nQuantidade Superior a de Estoque !\n");
	   }
   
   }
	
	public int getQuantidadeProduto() {
	return quantidadeProduto;
	}


	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	
	public String getNomeLoja() {
		return nomeLoja;
	}
	
	
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
	
	public int getCnpj() {
		return cnpj;
	}
	
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
	public int getCpf() {
		return cpf;
	}
	
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	

	public int getId_produto() {
		return Id_produto;
	}

	public void setId_produto(int id_produto) {
		Id_produto = id_produto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnidade() {
		return valorUnidade;
	}

	public void setValorUnidade(double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	
}

