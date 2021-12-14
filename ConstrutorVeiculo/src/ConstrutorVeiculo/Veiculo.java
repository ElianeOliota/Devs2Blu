package ConstrutorVeiculo;

public class Veiculo {

	public static void main(String[] args) {

		Automovel auto = new Automovel(80, 44, "Média", "Gás Aditivada");
		Moto moto = new Moto(40, 30, "Baixa", "Gasolina");

		// Fazendo sem construtores
		/*
		 * Automovel auto = new Automovel();
		 * 
		 * auto.setVelocidade(80); auto.setLitragem(44); auto.setFrenagem("Média");
		 * auto.setTipoCombustivel("Gás aditivada");
		 */
		System.out.println("====Tabela do Carro====");
		auto.listarDados();
		System.out.println("====Tabela da Moto====");
		moto.listarDadosMoto();

		System.out.println("Velocidade liberada ate: " + auto.ajustarVelocidade());
		System.out.println("A velocidade liberada para a moto é "+moto.ajustarVelocidadeMoto());

	}

}
