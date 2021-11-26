package Aula1;

import java.sql.Date;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;



public class TipoDadosPrincipal {

	private static final TipoDadosPrincipal FloatingDecimal = null;

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		char sexo;
		float salario;
		double salarioAnual;
		java.util.Date dataNascimento;

		//entrada de dados
		/*
		 nome = "Eliane Oliota";
	     idade = 32;
		 sexo = 'F';
		 salario = 14.995f;
		 salarioAnual = 25487.50;
	
		-- Para formatar a data de nascimento, podemos utilizar o declaração: 
		*/
	SimpleDateFormat formator = new SimpleDateFormat("mm/DD/yyyy");
		dataNascimento = formator.parse("14/08/1963");

         
		
		nome  = JOptionPane.showInputDialog("Informe o nome do sujeito");
		idade = Integer.parseInt(JOptionPane.showInputDialog( "Informe a idade"));
		sexo  = JOptionPane.showInputDialog("Informe o sexo").charAt(0);
		salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário mensal"));
		salarioAnual = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário anual"));
		dataNascimento = formator.parse(JOptionPane.showInputDialog("Informe a data de nascimento"));
		String dataNasc = formator.format(dataNascimento);
	
		System.out.println(
				" A " 
		+ nome + " é do sexo: " 
		+ sexo + " Data de nascimento : " 
		+ dataNasc + " Idade : "
		+ idade + " recebe um salário de : " 
		+ salario + " Anualmente receber o valor R$: " 
		+ salarioAnual 
		);
	}

	
	 
}
