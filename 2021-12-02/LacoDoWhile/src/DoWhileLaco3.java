import javax.swing.JOptionPane;

public class DoWhileLaco3 {
	public static void main(String[] args) {
		/* Implemente o programa da calculadora utilizando o menu abaixo.
			 1 - Somar
			 2 - Subtrair
			 3 - Multiplicar
			 4 - Dividir  (se o divisor for igual a 0(zero) de emitir aviso e 
			               pedir para informar outro numero)
			 9 - Sair
 		   Determinar a opera��o que deve ser executada, conforme a op��o desejada. 
		   Por exemplo: digamos que a op��o esteja associada a opera��o soma, ent�o 
		   ser� executada a soma dos dois n�meros.
		   O usu�rio deve continuar a execu��o da calculadora at� opte pela op��o �sair�. 
		   Ainda responda: 
		   Qual � a op��o mais adequada de intera��o: 
		   usar for ou usar while ? Por qu�?
		 */
		int opcao = 1, numero1 = 0, numero2 = 0, resultado = 0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o: "
	                + "\n 1 - Somar"  
	                + "\n 2 - Subtrair"
	                + "\n 3 - Multiplicar"
	                + "\n 4 - Dividir"
 	                + "\n 9 - Sair"));
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 1"));
		
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 2"));
			
			while (numero2 == 0 ){
				JOptionPane.showMessageDialog(null, "N�o posso fazer divis�o por zero");
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 2"));
			}
			
			switch (opcao) {
			case 1:  resultado = numero1 + numero2;
				     JOptionPane.showMessageDialog(null, "O resultado da soma � : " + resultado);
					 break;					
			case 2:  resultado = numero1 - numero2;
				     JOptionPane.showMessageDialog(null, "O resultado da subtra��o � : " + resultado);
					 break;				
			case 3:  resultado = numero1 * numero2;
					 JOptionPane.showMessageDialog(null, "O resultado da multiplica��o � : " + resultado);
					 break;				
			case 4:  int resto = 0;
				     resultado = numero1 / numero2;
				     resto = numero1 % numero2;
				     JOptionPane.showMessageDialog(null, "O resultado da divis�o � : " + resultado + " e o resto � : " + resto);
					 break;				
			case 9:  JOptionPane.showMessageDialog(null, "Programa Finalizado Corretamente");  
			 		 break;									 
			default: JOptionPane.showMessageDialog(null, "Op��o inv�lida. Redigite.");
				     break;
			}
		} while (opcao != 9);
		
		
		
		
		
		
	}

}
