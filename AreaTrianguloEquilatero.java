import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author An�sio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que faz o c�lculo da �rea de um tri�ngulo eq�il�tero (3 lados iguais), 
 * onde a �rea � igual � base (lado do tri�ngulo) multiplicada pela altura, e divididos por 2. 
 * Ap�s o c�lculo da �rea do tri�ngulo, este valor dever� ser mostrado.
 *
 */
public class AreaTrianguloEquilatero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor

		double h, l, area; // Declaramos as vari�veis area, h => altura e l => lado/base
		
		h = leitor.nextDouble(); // Solicitamos o valor da altura
		
		l = leitor.nextDouble(); // Solicitamos o valor do lado/base
		
		area = (l * h) / 2; // Calculamos a �rea
		
		System.out.println("A �rea do tri�ngulo eq�il�tero �: " + area); // Mostra o resultado
		
		leitor.close(); // Fechamos o nosso leitor
	}

}
