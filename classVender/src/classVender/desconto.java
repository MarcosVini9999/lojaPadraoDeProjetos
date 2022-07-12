package classVender;

public final class desconto extends vender{
	protected double precoDesconto;
	private static desconto instanciaDesconto;
	
	
   //this.precoDesconto = this.quantidade*this.valorUnidade - this.valorDesconto;
	public double aplicarDesconto() {
		setPrecoDesconto(this.quantidade*this.valorUnidade - this.valorDesconto);
		return getPrecoDesconto();
	}
	public static desconto getInstancia() {
		if (instanciaDesconto == null) {
			instanciaDesconto = new desconto();
		}
		return instanciaDesconto;
	}

	public double getPrecoDesconto() {
		return precoDesconto;
	}

	public void setPrecoDesconto(double precoDesconto) {
		this.precoDesconto = precoDesconto;
	}
}