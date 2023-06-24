package Estudos;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
// cria um novo input
		Scanner  crime = new Scanner(System.in);
		
// conta quantas respostas sim terá nas perguntas
		int contadorSim = 0;
		
		System.out.println("Você telefonou para a vítima? ");
		String resp1 = crime.nextLine();
		if (resp1.equalsIgnoreCase("Sim")) {
			// adiciona ao contador se a resposta for sim
			contadorSim++;
		}
		
		
		System.out.println("Esteve no local do crime? ");
		String resp2 = crime.nextLine();
		if (resp2.equalsIgnoreCase("Sim")) {
			contadorSim++;
		}
		
		System.out.println("Mora perto da vítima? ");
		String resp3 = crime.nextLine();
		if(resp3.equalsIgnoreCase("Sim")) {
			contadorSim++;
		}
		
		System.out.println("Devia para a vítima? ");
		String resp4 = crime.nextLine();
		if (resp4.equalsIgnoreCase("Sim")) {
			contadorSim++;
		}
		
		System.out.println("Já trabalhou com a vítima? ");
		String resp5 = crime.nextLine();
		if(resp5.equalsIgnoreCase("Sim")) {
			contadorSim++;
		}
		
		if (contadorSim == 2) {
			System.out.println("Pessoa suspeita.");
		}
		
		else if (contadorSim == 3 || contadorSim == 4) {
			System.out.println("Pessoa cumplice.");
		}
		
		else if (contadorSim == 5) {
			System.out.println("Pessoa culpada.");
		}
		
		else {
			System.out.println("Pessoa inocente.");
		}
	}

}
