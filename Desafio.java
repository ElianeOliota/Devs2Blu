import javax.swing.JOptionPane;

import semana1.Exercicio1;

public class Main {

	public static void main(String[] args) {
		int opcao;
		String menu;
		menu = "Escolha um exercicio";
		menu += "\n 0 Sair";
		menu += "\n 1 Exercicio1";
		menu += "\n 2 Exercicio2";
		menu += "\n 3 Exercicio3";
		menu += "\n 4 Exercicio4";

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcao) {

			case 1:
				exercicio1();
				break;
			case 2:
				exercicio2();
				break;

			}

		} while (opcao != 0);

	}

	public static void exercicio1() {
		/*
		 * Desenvolva um programa que mo usuário informe 10 numeros e no final informar
		 * o maior o menor número
		 */

		int num, menor = 0, maior = 0;

		for (int i = 1; i <= 5; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + i + "ª número"));
			if (i == 1) {
				// o primeiro número é o maior e o menor pq não existe outro
				menor = num;
				maior = num;

			} else {

				// para o segundo número até o último tenho q comparar com os anteriores
				if (num > maior) {

					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
		}
		System.out.println("O menor número é " + menor);
		System.out.println("O maior número é " + maior);

	}

	public static void exercicio2() {

		System.out.println("Eu vou executar o exercicio 2 ");

	}

}
