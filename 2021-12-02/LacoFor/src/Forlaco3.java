import javax.swing.JOptionPane;

public class Forlaco3 {
	public static void main(String[] args) {
		/* Desenvolva um programa que permita informar a quantidade de itens
		   vendidos.
		   Em seguida peça o código, descrição, valor unitário e quantidade
		   vendida.
		   Para cada item, imprimir os dados, calcular o valor total do item e
		   ao final do programa imprimir o valor total da nota.
		   Atenção: Não é para utilizar ARRAYS
		*/

		int qtdItens = 0, codItem = 0, qtdItemVendida = 0;
		String descItem = "";
		double vlrUnitItem = 0, vlrTotalItem = 0, vlrTotalNota = 0;
		
		qtdItens = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtde de itens: "));
	
		if (qtdItens > 0) {
			System.out.println("Item \t Descrição \t qtde   \t  vlr.Unit.  \t  vlr.total \t\n");	
			for (int contaitens = 1; contaitens <= qtdItens; contaitens++) {
				codItem        = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do item"));
				descItem       = JOptionPane.showInputDialog("Informe a descrição do item");		
				qtdItemVendida = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtde vendida"));
				vlrUnitItem    = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor unitário do item"));
				vlrTotalItem   = qtdItemVendida * vlrUnitItem;
				vlrTotalNota += vlrTotalItem;
				System.out.println(codItem + "\t" + descItem + "\t" + qtdItemVendida + "\t" + vlrUnitItem + "\t" + vlrTotalItem + "\t\n");
			}
			System.out.println("O valor total da nota é : " + vlrTotalNota);
		}
	}
}