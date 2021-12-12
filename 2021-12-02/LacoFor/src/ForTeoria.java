public class ForTeoria {

	public static void main(String[] args) {
		
		/* O la�o For � extremamente utilizado em opera��es com ARRAY's devido
		   a simplicidade e efici�ncia do c�digo gerado.
		   N�o h� necessidade de se precocupar com cria��o de vari�vel para 
		   controle do la�o, nem cria��o da cl�usula de controle de mesmo e 
		   tampouco a incrementa��o da vari�vel de controle.
		   Ou seja, utilizando o FOR � praticamente imposs�vel colocar o FOR
		   numa situa��o de "la�o infinito" ou "looping".
		   Vamos ver duas situa��es abaixo;
		   1 - usando o FOR padr�o (listando nrs de 1 a 10 em ordem crescente
		       e decrescente.
		   2 - usando a condi��o com uma vari�vel adicional
		   3 - um la�o infinito usando o FOR e o WHILE. 
		 */
		
		// 1 - usando o FOR padr�o
		// listando n�meros de 1 a 10 em ordem crescente
		/*
		System.out.println("Listagem crescente \n");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// listando n�meros de 1 a 10 em ordem decrescente
		System.out.println("Listagem decrescente \n");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		*/
		/*
		// 2 - usando a condi��o com uma vari�vel adicional
		// listar 5 pessoas
		String[] nomesPessoas = {"JOAO","MARIA","JOSE","FRANCISCO","MARGARIDA"};
		// String nomePessoas1[]  = new String[5]; // <-- seria a forma de declarar o array vazio
		for (int i = 0; i < nomesPessoas.length; i++) {
			System.out.println((++i) + "� pessoa = " + nomesPessoas[i]);
		}
		
		// 3 - um la�o infinito usando o FOR e o WHILE.
		
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
