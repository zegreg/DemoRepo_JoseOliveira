import java.util.Scanner;


public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		
	
		System.out.println(num1 + "+" + num2 + "=" + sum(num1, num2));
		
	}

	private static int sum(int fistNumberInput, int secondNumberInput) {
		
		return fistNumberInput+secondNumberInput;
	}

}
