package lacosRepeticao;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		// repetir um trecho do codigo enquanto o usuário não digitar o comando de saida
		String continua = "n";
		Scanner leia = new Scanner (System.in);
		
		
		//while(  continua == "s")
		while(!continua.equals("n")) {//início do bloco while
			System.out.println("Bom dia!");
			//continua = "n";
			System.out.println("Digite s para receber nosso bom dia: ");
			continua = leia.nextLine();
						
		}//final do bloco while
		

	}

}
