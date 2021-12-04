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
			case 3:
				exercicio3();
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
	
	
	public static void exercicio3() {
		
		// 1 - usando o FOR padrão
				// listando números de 1 a 10 em ordem crescente
			
				System.out.println("Listagem crescente \n");
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}
		
	}
	
}




import java.nio.FloatBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

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
		menu += "\n 5 Exercicio5";
		menu += "\n 6 Exercicio6";
		menu += "\n 7 Exercicio7";

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcao) {

			case 1:
				exercicio1();
				break;
			case 2:
				exercicio2();
				break;
			case 3:
				exercicio3();
				break;

			case 4:
				exercicio4();
				break;
			case 5:
				exercicio5();
				break;

			case 6:
				excercicio6();
				break;
			case 7:
				exercicio7();
				break;
			}

		} while (opcao != 0);

	}

	public static void exercicio1() {
		/*
		 * Desenvolva um programa que mo usuário informe até 10 numeros e no final
		 * informar o maior o menor número
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

	public static void exercicio3() {

		// 1 - usando o FOR padrão
		// listando números de 1 a 10 em ordem crescente

		System.out.println("Listagem crescente \n");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

	public static void exercicio4() {

		// Desenvolva um programa que permita imprimir a tabuada de qualquer número

		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero"));

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + "=" + (numero * i));
		}

	}

	public static void exercicio5() {

		// Desenvolva um programa que para encontrr todos os números pares entre 1 e 100

		int resto = 0;

		for (int numero = 1; numero <= 100; numero++) {
			resto = numero % 2;
			if (resto == 0) {
				System.out.println(numero);

			}
		}

	}

	public static void excercicio6() {
		// Desenvolva um programa que permita informar a quantidade de itens vendidos
		// em seguida peça o codigo, descrição, valor unitario e quantidade vendida
		// para cada item, imprimir os dados, calcular o valor total do item e ao final
		// do programa
		// imprimir o valor total da nota

		/* Locale.setDefault(Locale.US); */
		/*
		 * float numero = 1.985100f, resultado = 0; DecimalFormat formator = new
		 * DecimalFormat("0.00"); System.out.println("número antes da formatação : " +
		 * numero); resultado = Float.parseFloat(formator.format(numero)) + 0.015f;
		 * System.out.println("Número depois da formatação: " + resultado);
		 */

		/*
		 * float qtdVendidos = 0f , valorTotal = 0f, codigo = 0f, valUnitario = 0f; int
		 * descricao = 0;
		 * 
		 * 
		 * qtdVendidos =
		 * Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade vendida"))
		 * ;
		 * 
		 * codigo = Float.parseFloat(JOptionPane.showInputDialog("Informe o código "));
		 * 
		 * valUnitario =
		 * Float.parseFloat(JOptionPane.showInputDialog("Informe o valor unitario"));
		 * descricao =
		 * Integer.parseInt(JOptionPane.showInputDialog("Descreva o produto"));
		 * 
		 * 
		 * for (int i = 1; i <= 10; i++) {
		 * 
		 * System.out.println(valorTotal + " = " + (qtdVendidos *valUnitario));
		 * 
		 * }
		 */

		float qtdVendidos = 0f, valUnitario = 0f, valorTotal = 0f;

		qtdVendidos = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade vendida"));
		valUnitario = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor unitario do produto"));
		valorTotal = qtdVendidos * valUnitario;
		System.out.println(valorTotal);

		ArrayList<String> qtdVendidos1 = new ArrayList<String>();

		qtdVendidos1.add("Produto 1");
		qtdVendidos1.add("Produto 1");
		qtdVendidos1.add("Produto 1");
		qtdVendidos1.add(" ");
		for (int i = 0; i < qtdVendidos1.size(); i++) {

			System.out.println(qtdVendidos1.get(i));
		}

	}

	public static void exercicio7() {

		// Escola Futuro precisa controla as notas e médias dos seus alunos.
		// para isso precisa de um programa que faça o seguinte:
		// 1. informar a quantidade de alunos
		// 2. informar a quantidade de notas
		// 3. informar a nota a nota
		// 5. calcular a média
		// 6. para cada aluno verificar a situação
		// se média < 6 - reprovado
		// Se média >= 6 e < 7.5 - Em recuperação
		// Se média >= 7.5 - Aprovado
		// 6. Para cada aluno imprimir o Nome, Média e Situação
		// 7. No final do programa imprimir a melhor média e a média da turma

		
		  float media = 0f; int nota = 0, aluno = 0, qdtAluno = 0, qtdNota = 0; String
		  nome;
		  
		  aluno = Integer.parseInt(JOptionPane.
		  showInputDialog("Informe a quantidade de Alunos:")); nota =
		  Integer.parseInt(JOptionPane.
		  showInputDialog("Informe a quantidade de Notas: "));
		  System.out.println("\n Quantidade de Aluno:" + aluno +
		  "\n Quantidade de Notas:" + nota);
		

			for (int qdtAluno1 = 1; qdtAluno1 <= 10; qdtAluno1++) {
				qdtAluno1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + qdtAluno1 + "ª número"));

				if (nota < 6) {
					// o primeiro número é o maior e o menor pq não existe outro
					System.out.println("Aluno reprovado" + qdtAluno1);
					

				} else {

					// para o segundo número até o último tenho q comparar com os anteriores
					if (nota > 7) {

						System.out.println("Aluno Aprovado" + qdtAluno1);
					}

					
				}
			}
			System.out.println("O menor número é " + nota);
			System.out.println("O maior número é " + nota);
		
	    
	    
	    
	}
