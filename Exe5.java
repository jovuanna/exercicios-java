package Estudos;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		Scanner aluno = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		float nota1 = aluno.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = aluno.nextFloat();
				
		double media = (nota1 + nota2) / 2;
		
		System.out.println("A média entre as notas é igual a: ");
		System.out.println(media);
	}

}
