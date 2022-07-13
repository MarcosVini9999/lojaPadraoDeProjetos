package classVender;

public enum TipoProduto {
	
	VESTUARIOS
 {
		@Override
		public Strategy conseguirDesconto() {
			// TODO Auto-generated method stub
			return new VestuariosStrategy();
		}
	},
 ALIMENTICIOS
 {
		@Override
		public Strategy conseguirDesconto() {
			// TODO Auto-generated method stub
			return new AlimenticiosStrategy();
		}
	},
 ELETRONICOS
	
 {
		@Override
		public Strategy conseguirDesconto() {
			// TODO Auto-generated method stub
			return new EletronicosStrategy();
		}
	};
	
	public abstract Strategy conseguirDesconto();
}
