package classVender;

public final class desconto extends vender{
	
	protected double precoDesconto;
	private static desconto instanciaDesconto;

	public double aplicarDesconto(int qntd,double valor,double desconto) {
		precoDesconto = qntd*valor - desconto;
		return precoDesconto;
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