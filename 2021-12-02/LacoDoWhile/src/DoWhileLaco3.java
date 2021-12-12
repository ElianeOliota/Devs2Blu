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
 		   Determinar a operação que deve ser executada, conforme a opção desejada. 
		   Por exemplo: digamos que a opção esteja associada a operação soma, então 
		   será executada a soma dos dois números.
		   O usuário deve continuar a execução da calculadora até opte pela opção “sair”. 
		   Ainda responda: 
		   Qual é a opção mais adequada de interação: 
		   usar for ou usar while ? Por quê?
		 */
		int opcao = 1, numero1 = 0, numero2 = 0, resultado = 0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
	                + "\n 1 - Somar"  
	                + "\n 2 - Subtrair"
	                + "\n 3 - Multiplicar"
	                + "\n 4 - Dividir"
 	                + "\n 9 - Sair"));
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 1"));
		
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 2"));
			
			while (numero2 == 0 ){
				JOptionPane.showMessageDialog(null, "Não posso fazer divisão por zero");
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 2"));
			}
			
			switch (opcao) {
			case 1:  resultado = numero1 + numero2;
				     JOptionPane.showMessageDialog(null, "O resultado da soma é : " + resultado);
					 break;					
			case 2:  resultado = numero1 - numero2;
				     JOptionPane.showMessageDialog(null, "O resultado da subtração é : " + resultado);
					 break;				
			case 3:  resultado = numero1 * numero2;
					 JOptionPane.showMessageDialog(null, "O resultado da multiplicação é : " + resultado);
					 break;				
			case 4:  int resto = 0;
				     resultado = numero1 / numero2;
				     resto = numero1 % numero2;
				     JOptionPane.showMessageDialog(null, "O resultado da divisão é : " + resultado + " e o resto é : " + resto);
					 break;				
			case 9:  JOptionPane.showMessageDialog(null, "Programa Finalizado Corretamente");  
			 		 break;									 
			default: JOptionPane.showMessageDialog(null, "Opção inválida. Redigite.");
				     break;
			}
		} while (opcao != 9);
		
		
		
		
		
		
	}

}
