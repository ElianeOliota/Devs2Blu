package br.com.elianeoliota.git;

import javax.swing.JOptionPane;

public class MassaCorporal {

	public static void main(String[] args) {
		float altura, peso, imc;
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua altura"));
		peso = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua peso"));
		imc = peso / (altura * altura);
		imc = Math.round(imc * 100.0f) / 100.0f;

		System.out.println(imc);

		if (imc < 18.5) {
			System.out.println("Magreza");
		} else if (imc >= 18.5 && imc <= 24.9) {

			System.out.println("Normal");
		} else if (imc >= 25.0 && imc <= 29.9) {

			System.out.println("Sobrepeso");
		} else if (imc >= 30.0 && imc <= 39.9) {

			System.out.println("Obesidade");
		}

	}

}
