import javax.swing.JOptionPane;

public class SisEscola {

	public static void main(String[] args) {
		
	 	/* A Escola Futuro precisa controlar as notas e m�dias dos seus alunos.
		   Para isso precisa de um programa que fa�a o seguinte:
		   1 - Informar a quantidade de alunos
		   2 - Informar a quantidade de notas
		   3 - Informar nota a nota
		   4 - Calcular a m�dia 
		   5 - Para cada aluno verificar a situa��o
		   Se m�dia < 6 - Reprovado
		   Se m�dia >= 6 e < 7.5 - Em Recupera��o
		   Se m�dia >= 7.5 - Aprovado
		   6 - Para cada aluno imprimir o Nome, M�dia e Situa��o
		   7 - No final do programa imprimir a melhor m�dia e a m�dia da turma
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
				vlrNota   = Float.parseFloat(JOptionPane.showInputDialog("Informe " + contaNotas + "� nota"));
				// calcula a m�dia
				vlrMedia += (vlrNota / qtdNotas);
				contaNotas++;
			}
			// verifica se � a maior m�dia
			if (vlrMedia > vlrMaiorMedia) {
				vlrMaiorMedia = vlrMedia;
			}
			// verifica situa��o do aluno
			if (vlrMedia < 6) {
				sitAluno = "Reprovado";
				
			} else if (vlrMedia >= 6 && vlrMedia < 7.5) {
				sitAluno = "Em Recupera��o";
			} else {
				sitAluno = "Aprovado";
			}
			System.out.println("Aluno....: " + nomeAluno);
			System.out.println("M�dia....: " + vlrMedia);
			System.out.println("Situa��o.: " + sitAluno + "\n");
			System.out.println("-----------------------------\n");
			// calcula a m�dia da turma
			vlrMediaTurma += vlrMedia / qtdAlunos;
			contaAlunos++;
		}
		System.out.println("M�dia da Turma : " + vlrMediaTurma);
		System.out.println("Maior M�dia....: " + vlrMaiorMedia);
	}
}
