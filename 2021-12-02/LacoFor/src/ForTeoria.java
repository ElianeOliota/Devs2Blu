public class ForTeoria {

	public static void main(String[] args) {
		
		/* O laço For é extremamente utilizado em operações com ARRAY's devido
		   a simplicidade e eficiência do código gerado.
		   Não há necessidade de se precocupar com criação de variável para 
		   controle do laço, nem criação da cláusula de controle de mesmo e 
		   tampouco a incrementação da variável de controle.
		   Ou seja, utilizando o FOR é praticamente impossível colocar o FOR
		   numa situação de "laço infinito" ou "looping".
		   Vamos ver duas situações abaixo;
		   1 - usando o FOR padrão (listando nrs de 1 a 10 em ordem crescente
		       e decrescente.
		   2 - usando a condição com uma variável adicional
		   3 - um laço infinito usando o FOR e o WHILE. 
		 */
		
		// 1 - usando o FOR padrão
		// listando números de 1 a 10 em ordem crescente
		/*
		System.out.println("Listagem crescente \n");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// listando números de 1 a 10 em ordem decrescente
		System.out.println("Listagem decrescente \n");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		*/
		/*
		// 2 - usando a condição com uma variável adicional
		// listar 5 pessoas
		String[] nomesPessoas = {"JOAO","MARIA","JOSE","FRANCISCO","MARGARIDA"};
		// String nomePessoas1[]  = new String[5]; // <-- seria a forma de declarar o array vazio
		for (int i = 0; i < nomesPessoas.length; i++) {
			System.out.println((++i) + "ª pessoa = " + nomesPessoas[i]);
		}
		
		// 3 - um laço infinito usando o FOR e o WHILE.
		
		for (int i = 0; i < 10; ) {
			System.out.println("Executando For.....");
		}
		
		/* outra forma de gerar um loop infinito
		
		  for(;;) {
			System.out.println("Executando For.....");
		  }
		*/
		int contador = 1;
		while (contador <= 10) {
			System.out.println("Executando While.....");
		}
	}
}
