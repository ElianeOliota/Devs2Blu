import javax.swing.JOptionPane;

public class DoWhileTeoria {
	public static void main(String[] args) {
		/* o Do While é muito utilizado quando se quer passar
		 * pelo menos uma vez pelo laço de repetição 
		 */
		
		// inicializando a expressão

        // se informar 9 , sai do laço
		/*
        int opcao = 1;
        do {
        	opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção"));
        	switch (opcao) {
	        	case 1: JOptionPane.showMessageDialog(null, "Inclusão");
	        	 		break;
	        	case 9: JOptionPane.showMessageDialog(null, "Vou sair do laço");
    	 				break;	        	
	        	default: JOptionPane.showMessageDialog(null, "Opção Inválida");
    	 				break;
        	}
        }
        // testa a condição
        while (opcao != 9);
        */
        int opcao = 1;
    	opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção"));    
        while (opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção"));
			
			System.out.println("Entrei no laço");			
		}
    }
}
