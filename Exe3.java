package Estudos;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = entrada1.nextInt();

		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite o segundo número: ");
		int num2 = entrada2.nextInt();

		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Digite o terceiro número: ");
		int num3 = entrada3.nextInt();
// maior numero
		if (num1 >  num2 && num1 > num3) {
			System.out.println("O primeiro número é o maior.");
		}
		
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O segundo número é o maior.");
		}
		else {
			System.out.println("O terceiro número é o maior.");
		}
// menor numero
		if (num1 < num2 && num1 < num3) {
			System.out.println("O primeiro número é o menor.");
		}
		
		else if (num2 < num1 && num2 < num3) {
			System.out.println("O segundo número é menor");
		}
		
		else {
			System.out.println("O terceiro número é o menor.");
		}
	}

}
