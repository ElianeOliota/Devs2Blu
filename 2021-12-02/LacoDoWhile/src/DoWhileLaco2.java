import javax.swing.JOptionPane;

public class DoWhileLaco2 {

	public static void main(String[] args) {
		// Desenvolva um programa em que o usu�rio informa at� 10 nrs.
		// No final do programa voc� dever� informar qual � o menor n�mero e 
		// qual � o maior n�mero
		
		
		
		
		
		
		
		
		
		int numeroInformado, menorNumero=0, maiorNumero=0, contNum = 1;
		char primVez = 'S';
		
		do {
			numeroInformado = Integer.parseInt(JOptionPane.showInputDialog("informe um n�mero"));
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
			System.out.println(contNum + "� Nr. Informado " + numeroInformado);
			contNum++;
		} while (contNum <= 10);
		
		System.out.println("O menor n�mero � : " + menorNumero );
		System.out.println("O maior n�mero � : " + maiorNumero );
	}

}
