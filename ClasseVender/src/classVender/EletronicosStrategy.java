package classVender;

public class EletronicosStrategy implements Strategy{

	@Override
	public double calcularDesconto(double valor) {
		double desconto = 0;
		desconto = (0.15*valor);
		System.out.println("Desconto aplicado para o produto eletrônico");
		return desconto;
	}

}
