package entities;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		/*
Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.
Exemplo:
Dados da primeira pessoa:
Nome: Maria Silva
Idade: 19
Dados da segunda pessoa:
Nome: Joao Melo
Idade 20
A idade média de Maria Silva e Joao Melo é de 19.5 anos
		 */
		Locale.setDefault(Locale.US);
		
		// Declarando as variaveis
		String nome1 = "Maria Silva";
		String nome2 = "Joao Melo";
		Double idade1 = 19.0;
		Double idade2 = 20.0;
		Double mediaIdade = ((idade1 + idade2) / 2);
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.printf("Nome: %s\n", nome1);
		System.out.printf("Idade: %.0f\n", idade1);
		System.out.println("Dados da segunda pessoa: ");
		System.out.printf("Nome: %s\n", nome2);
		System.out.printf("Idade: %.0f\n", idade2);
		System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, mediaIdade);
		
		
	}

}
