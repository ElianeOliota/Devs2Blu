import javax.swing.JOptionPane;
public class DoWhileLaco1 {

	public static void main(String[] args) {
		/* Desenvolva um programa que mostre um menu com as opções abaixo
		 1 - Incluir
		 2 - Alterar
		 3 - Excluir
		 4 - Consultar
		 9 - Sair
		
		Para cada opção imprima a opção na console e torne a mostrar o MENU
		Ao digitar 9, saia do programa e envie uma mensagem na console 
		avisando que o programa saiu normalmente
		*/
		
		int opcao = 1;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
	                + "\n 1 - Incluir"  
	                + "\n 2 - Alterar"
	                + "\n 3 - Excluir"
	                + "\n 4 - Consultar"
 	                + "\n 9 - Sair"));

			switch (opcao) {
			case 1:  JOptionPane.showMessageDialog(null, "Inclusão");
					 break;					
			case 2:  JOptionPane.showMessageDialog(null, "Alteração");
					 break;				
			case 3:  JOptionPane.showMessageDialog(null, "Exclusão");
					 break;				
			case 4:  JOptionPane.showMessageDialog(null,"Consulta");
					 break;				
			case 9:  JOptionPane.showMessageDialog(null, "Programa Finalizado Corretamente");  
			 		 break;									 
			default: JOptionPane.showMessageDialog(null, "Opção inválida. Redigite.");
				     break;
			}
		} while (opcao != 9);
	}
}