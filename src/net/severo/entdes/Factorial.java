package net.severo.entdes;
/**
 * 
 * @author Christian Torrecillas
 *
 */
public class Factorial {

	private static final String VALUE_OF_N2 = "N arvo!: ";
	private static final String VALUE_OF_N = "N: n arvo: ";

	public static void main(String[] args) {

		int n = (int) (Math.random() * 10);
		int result = 1;
		System.out.println(VALUE_OF_N + n);
		while (n > 1) {
			result = result * (n - 1);
		}
		System.out.println(VALUE_OF_N2 + result);

	}

}
