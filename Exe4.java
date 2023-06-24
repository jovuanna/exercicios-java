package Estudos;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int dia_da_semana = entrada.nextInt();
				
		if (dia_da_semana == 1) {
			System.out.println("O dia da semana correspondente ao número 1 é Domingo.");
		}
		else if (dia_da_semana  == 2) {
			System.out.println("O dia da semana correspondente ao número 2 é Segunda.");
		}
		else if (dia_da_semana == 3) {
			System.out.println("O dia da semana correspondente ao número 3 é Terça.");
		}
		else if (dia_da_semana == 4) {
			System.out.println("O dia da semana correspondente ao número 4 é Quarta.");
		}
		else if (dia_da_semana == 5) {
			System.out.println("O dia da semana correspondente ao número 5 é Quinta.");
		}
		else if (dia_da_semana == 6) {
			System.out.println("O dia da semana correspondente ao número 6 é Sexta.");
		}
		else if (dia_da_semana == 7) {
			System.out.println("O dia da semana correspondente ao número 7 é Sábado.");
		}
		else {
			System.out.println("Erro. Digite um número válido.");
		}
	}

}
