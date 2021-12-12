import javax.swing.JOptionPane;

public class Banco {

	public static void main(String[] args) {
		/*
		Uma agência bancária possui vários clientes que podem fazer investimentos 
		com rendimentos mensais, conforme a tabela a seguir:

			Tipo	Descrição		Rendimento mensal
			1		Poupança			1,5%
			2		Poupança plus		2.0%
			3		Fundos de renda		4.0%
			
		Faça um programa que leia o código do cliente, o tipo da conta e o valor investido 
		e que calcule e mostre o rendimento mensal de acordo com o tipo do investimento. 
		Ao final do programa mostre o total de juros pagos. 
		A leitura terminará quando o código do cliente digitado for menor ou igual a 0.
		*/
		
		int codCliente = 0, tipoConta;
		float vlrInvestido = 0, vlrRendimentos = 0;
		
		do {
			codCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente"));
			vlrInvestido = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor investido"));
			tipoConta  = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo da conta \n"
                    + "1 - Poupança \n"
                    + "2 - Poupança plus \n"
                    + "3 - Fundos de renda"));
			
			switch (tipoConta) {
			case 1:
				vlrRendimentos = vlrInvestido * 1.015f;
				JOptionPane.showMessageDialog(null, "O valor final pós-investimento é : " + vlrRendimentos);
				break;
			case 2:
				vlrRendimentos = vlrInvestido * 1.02f;
				JOptionPane.showMessageDialog(null, "O valor final pós-investimento é : " + vlrRendimentos);
				break;
			case 3:
				vlrRendimentos = vlrInvestido * 1.04f;
				JOptionPane.showMessageDialog(null, "O valor final pós-investimento é : " + vlrRendimentos);
				break;

			default:
				JOptionPane.showMessageDialog(null,"Informe um valor válido para tipo de Conta");
				break;
			}
		} while (codCliente > 0);
	}

}
