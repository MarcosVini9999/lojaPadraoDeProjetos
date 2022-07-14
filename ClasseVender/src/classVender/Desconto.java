package classVender;

public final class Desconto extends Vender{
	
	protected double precoDesconto;
	private static Desconto instanciaDesconto;

	public double aplicarDesconto(int qntd,double valor,double desconto) {
		precoDesconto = qntd*valor - desconto;
		return precoDesconto;
	}
	public static Desconto getInstancia() {
		if (instanciaDesconto == null) {
			instanciaDesconto = new Desconto();
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