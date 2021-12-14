package ConstrutorVeiculo;

public class Veiculo {

	public static void main(String[] args) {

		Automovel auto = new Automovel(80, 44, "M�dia", "G�s Aditivada");
		Moto moto = new Moto(40, 30, "Baixa", "Gasolina");

		// Fazendo sem construtores
		/*
		 * Automovel auto = new Automovel();
		 * 
		 * auto.setVelocidade(80); auto.setLitragem(44); auto.setFrenagem("M�dia");
		 * auto.setTipoCombustivel("G�s aditivada");
		 */
		System.out.println("====Tabela do Carro====");
		auto.listarDados();
		System.out.println("====Tabela da Moto====");
		moto.listarDadosMoto();

		System.out.println("Velocidade liberada ate: " + auto.ajustarVelocidade());
		System.out.println("A velocidade liberada para a moto � "+moto.ajustarVelocidadeMoto());

	}

}
