import javax.swing.JOptionPane;

public class Imc {
	public static void main(String[] args) {
		double imc, peso, altura, potencia = 2;
		
		peso   = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu peso"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua altura"));
		
		//imc = peso / (altura * altura); // é possível utilizar a classe Math.pow ou simplesmente obter o quadrado da altura dessa forma
		imc = peso / Math.pow(altura, potencia);
		System.out.println("Imc não arredondado = " + imc);

		imc = Math.round(imc*100.0)/100.0;
		System.out.println("Imc arredondado = " + imc);
			
		if (imc < 18.5) {
			System.out.println("Magreza");
		} else if (imc < 24.9) {
			System.out.println("Normal");
		} else if (imc < 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc < 39.9) {
			System.out.println("Obesidade");
		} else {
			System.out.println("Obesidade Grave");
		}
	}
}
