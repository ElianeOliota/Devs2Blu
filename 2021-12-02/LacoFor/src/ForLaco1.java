import javax.swing.JOptionPane;

public class ForLaco1 {

	public static void main(String[] args) {
		// Desenvolva um programa que permita imprimir a tabuada de qualquer n�mero
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero para a tabuada"));
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
			
		}
		


	}

}
