package lacosRepeticao;

public class Exemplo5 {

	public static void main(String[] args) {
		// do{..} while() == fa�a enquanto
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
		//o bloco acima esta fora do crit�rio menor que 10
		
		int y = 0;
		//esse segundo bloco atende ao crit�rio
		do {
				
			System.out.println("Boa tarde!");
			y++;
		}while(y<10);

	}

}
