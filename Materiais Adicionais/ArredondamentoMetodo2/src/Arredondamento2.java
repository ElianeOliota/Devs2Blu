import java.util.Locale;
import java.text.DecimalFormat;

public class Arredondamento2 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 float numero = 1.9851008f, resultado = 0;
		 DecimalFormat formatador = new DecimalFormat("0.00"); 
		 System.out.println("N�mero antes da formata��o: " + numero);
		 resultado = Float.parseFloat(formatador.format(numero)) + 0.015f;
		 System.out.println("N�mero depois formata��o: " + resultado);
	}
}