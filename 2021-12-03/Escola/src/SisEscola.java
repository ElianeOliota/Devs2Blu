import javax.swing.JOptionPane;

public class SisEscola {

	public static void main(String[] args) {
		
	 	/* A Escola Futuro precisa controlar as notas e médias dos seus alunos.
		   Para isso precisa de um programa que faça o seguinte:
		   1 - Informar a quantidade de alunos
		   2 - Informar a quantidade de notas
		   3 - Informar nota a nota
		   4 - Calcular a média 
		   5 - Para cada aluno verificar a situação
		   Se média < 6 - Reprovado
		   Se média >= 6 e < 7.5 - Em Recuperação
		   Se média >= 7.5 - Aprovado
		   6 - Para cada aluno imprimir o Nome, Média e Situação
		   7 - No final do programa imprimir a melhor média e a média da turma
		 */
		   
		int qtdAlunos, qtdNotas, contaAlunos, contaNotas;
		double vlrNota, vlrMedia, vlrMaiorMedia = 0, vlrMediaTurma = 0;
		String nomeAluno, sitAluno;

		qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtde de Alunos"));
		qtdNotas  = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtde de Notas"));
		contaAlunos = 1;
		
		while (contaAlunos <= qtdAlunos ) {
			nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno");
			contaNotas  = 1;
			vlrMedia = 0;
			while (contaNotas <= qtdNotas) {
				vlrNota   = Float.parseFloat(JOptionPane.showInputDialog("Informe " + contaNotas + "º nota"));
				// calcula a média
				vlrMedia += (vlrNota / qtdNotas);
				contaNotas++;
			}
			// verifica se é a maior média
			if (vlrMedia > vlrMaiorMedia) {
				vlrMaiorMedia = vlrMedia;
			}
			// verifica situação do aluno
			if (vlrMedia < 6) {
				sitAluno = "Reprovado";
				
			} else if (vlrMedia >= 6 && vlrMedia < 7.5) {
				sitAluno = "Em Recuperação";
			} else {
				sitAluno = "Aprovado";
			}
			System.out.println("Aluno....: " + nomeAluno);
			System.out.println("Média....: " + vlrMedia);
			System.out.println("Situação.: " + sitAluno + "\n");
			System.out.println("-----------------------------\n");
			// calcula a média da turma
			vlrMediaTurma += vlrMedia / qtdAlunos;
			contaAlunos++;
		}
		System.out.println("Média da Turma : " + vlrMediaTurma);
		System.out.println("Maior Média....: " + vlrMaiorMedia);
	}
}
