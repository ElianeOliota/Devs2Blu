import javax.swing.JOptionPane;

public class DoWhileLaco2 {

	public static void main(String[] args) {
		// Desenvolva um programa em que o usuário informa até 10 nrs.
		// No final do programa você deverá informar qual é o menor número e 
		// qual é o maior número
		
		
		
		
		
		
		
		
		
		int numeroInformado, menorNumero=0, maiorNumero=0, contNum = 1;
		char primVez = 'S';
		
		do {
			numeroInformado = Integer.parseInt(JOptionPane.showInputDialog("informe um número"));
			if (primVez == 'S') {
				maiorNumero = numeroInformado;
				menorNumero = numeroInformado;
				primVez = 'N';
			}
			if (numeroInformado < menorNumero) {
				menorNumero = numeroInformado;
			} else if (numeroInformado > maiorNumero) {
				maiorNumero = numeroInformado;
			}
			System.out.println(contNum + "º Nr. Informado " + numeroInformado);
			contNum++;
		} while (contNum <= 10);
		
		System.out.println("O menor número é : " + menorNumero );
		System.out.println("O maior número é : " + maiorNumero );
	}

}
