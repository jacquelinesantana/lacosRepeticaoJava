package lacosRepeticao;

public class Exemplo5 {

	public static void main(String[] args) {
		// do{..} while() == faça enquanto
		/*
		 * faca{
		 * 
		 * ...
		 * }enquanto(x<10)
		 */
		
		int x =40 ;
		do {
			
			System.out.println("Bom dia!");
			x++;
		}while(x<10);
		//o bloco acima esta fora do critério menor que 10
		
		int y = 0;
		//esse segundo bloco atende ao critério
		do {
				
			System.out.println("Boa tarde!");
			y++;
		}while(y<10);

	}

}
