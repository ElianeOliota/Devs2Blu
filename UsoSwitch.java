/**
 * 
 */
package br.com.elianeoliota.git;

import javax.swing.JOptionPane;
import java.util.Date;

/**
 * @author moc aprendendo a usar o Switch case
 */
public class UsoSwitch {

	private static final Object TiposDeDados = null;

	public static void main(String[] args) {
		int opcao, num10;

		opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o"));

		switch (opcao) {
		case 1: {
			System.out.println("Inclus�o");
		}
		case 2: {
			System.out.println("Altera��o");
		}
		case 3: {
			System.out.println("Altera��o");
		}
		case 4: {
			System.out.println("O n�mero escolhido � 10");
		}

		default:
			JOptionPane.showMessageDialog(null, TiposDeDados);
			System.out.println("Tipos de Dados foi sua primeira aula");

			break;
		}

	}

	public void teste(String texto) {

		switch (texto) {

		case "ABC":
			// faz algo
			break;

		case "DEF":
			// faz outra coisa
			break;

		default:
			// caso n�o for nenhum desses casos

		}
	}
}
