package lacosRepeticao;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// exemplo 2 for
		/*
		 * escreva um sistema que recebe do usuario e escreve o nome de 3 pessoas
		 */
		String nome ;
		Scanner leia = new Scanner (System.in);
		
		//System.out.println("Digite o primeiro nome: ");
		//nome = leia.nextLine();
		//System.out.println("O primeiro nome é " + nome);
		
		//System.out.println("Digite o segundo nome: ");
		//nome = leia.nextLine();
		//System.out.println("O segundo nome é " + nome);
		
		//System.out.println("Digite o terceiro nome: ");
		//nome = leia.nextLine();
		//System.out.println("O terceiro nome é " + nome);
		
		for(int i = 1; i<=3; i++) {
			System.out.println("Digite o "+i+"º nome: ");
			nome = leia.nextLine();
			System.out.println("O "+i+" nome é " + nome);
		}

	}

}
