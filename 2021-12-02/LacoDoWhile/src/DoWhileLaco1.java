import javax.swing.JOptionPane;
public class DoWhileLaco1 {

	public static void main(String[] args) {
		/* Desenvolva um programa que mostre um menu com as op��es abaixo
		 1 - Incluir
		 2 - Alterar
		 3 - Excluir
		 4 - Consultar
		 9 - Sair
		
		Para cada op��o imprima a op��o na console e torne a mostrar o MENU
		Ao digitar 9, saia do programa e envie uma mensagem na console 
		avisando que o programa saiu normalmente
		*/
		
		int opcao = 1;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o: "
	                + "\n 1 - Incluir"  
	                + "\n 2 - Alterar"
	                + "\n 3 - Excluir"
	                + "\n 4 - Consultar"
 	                + "\n 9 - Sair"));

			switch (opcao) {
			case 1:  JOptionPane.showMessageDialog(null, "Inclus�o");
					 break;					
			case 2:  JOptionPane.showMessageDialog(null, "Altera��o");
					 break;				
			case 3:  JOptionPane.showMessageDialog(null, "Exclus�o");
					 break;				
			case 4:  JOptionPane.showMessageDialog(null,"Consulta");
					 break;				
			case 9:  JOptionPane.showMessageDialog(null, "Programa Finalizado Corretamente");  
			 		 break;									 
			default: JOptionPane.showMessageDialog(null, "Op��o inv�lida. Redigite.");
				     break;
			}
		} while (opcao != 9);
	}
}