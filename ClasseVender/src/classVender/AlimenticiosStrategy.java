package classVender;

public class AlimenticiosStrategy implements Strategy{
	 vender v = new vender();

	@Override
	public double calcularDesconto(double valor) {
		double desconto = 0;
		desconto = (0.25*valor);
		System.out.println("Desconto aplicado para o produto alimenticios");
		return desconto;
	}


}
