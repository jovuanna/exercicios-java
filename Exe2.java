package Estudos;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp = entrada.nextInt(); 
		System.out.println(resp);
		
		if (resp >= 0) {
			System.out.println("O numero é positivo.");
		}
		
		else {
			System.out.println("O numero é negativo.");
		}
	}

}
