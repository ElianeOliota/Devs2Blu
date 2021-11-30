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

		opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção"));

		switch (opcao) {
		case 1: {
			System.out.println("Inclusão");
		}
		case 2: {
			System.out.println("Alteração");
		}
		case 3: {
			System.out.println("Alteração");
		}
		case 4: {
			System.out.println("O número escolhido é 10");
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
			// caso não for nenhum desses casos

		}
	}
}
