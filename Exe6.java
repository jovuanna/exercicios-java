package Estudos;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Para selecionar o gênero digite uma letra: ");
		String genero = entrada.nextLine();
		
// equalsIgnoreCase serve para ignorar se o usuário escrever a letra minúscula ou maiúscula.
		if (genero.equalsIgnoreCase("F")) {
			System.out.println("O gênero selecionado é Feminino.");
		}
		
		else if (genero.equalsIgnoreCase("M")) {
			System.out.println("O gênero selecionado é Masculino.");
		}
		
		else {
			System.out.println("Valor inválido.");
		}

	}

}
