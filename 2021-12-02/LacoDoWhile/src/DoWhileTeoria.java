import javax.swing.JOptionPane;

public class DoWhileTeoria {
	public static void main(String[] args) {
		/* o Do While � muito utilizado quando se quer passar
		 * pelo menos uma vez pelo la�o de repeti��o 
		 */
		
		// inicializando a express�o

        // se informar 9 , sai do la�o
		/*
        int opcao = 1;
        do {
        	opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o"));
        	switch (opcao) {
	        	case 1: JOptionPane.showMessageDialog(null, "Inclus�o");
	        	 		break;
	        	case 9: JOptionPane.showMessageDialog(null, "Vou sair do la�o");
    	 				break;	        	
	        	default: JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
    	 				break;
        	}
        }
        // testa a condi��o
        while (opcao != 9);
        */
        int opcao = 1;
    	opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o"));    
        while (opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o"));
			
			System.out.println("Entrei no la�o");			
		}
    }
}
