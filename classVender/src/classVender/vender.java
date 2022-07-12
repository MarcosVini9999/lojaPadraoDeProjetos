package classVender;


public class vender {
	
	private int Id_produto;
	private String nomeProduto;
	protected int quantidade;
	private int quantidadeProduto ;
	protected double valorUnidade;
	protected double valorDesconto;
	protected String nomeLoja;
	protected int cnpj;
	protected String nomeCliente;
	protected int cpf;
	
	public boolean verificarDisponibilidadeProduto(int Id_produto,int quantidade) {
		if (quantidadeProduto < quantidade){
			return false;
		} else {
		return true;
		}
		
	}
	

   public double verificarRealizacaoDesconto(int qntd , double valorUnidade) {
	   return 0;
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

