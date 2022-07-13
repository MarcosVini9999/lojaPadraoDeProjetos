package classVender;

public class VestuariosStrategy implements Strategy{

	@Override
	public double calcularDesconto(double valor) {
		 double desconto = 0;
		desconto=(0.3*valor);
		System.out.println("Desconto aplicado para o produto vestuarios");
		return desconto;
	}

}
