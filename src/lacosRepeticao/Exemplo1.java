package lacosRepeticao;

public class Exemplo1 {

	public static void main(String[] args) {
		// la�o de repeti��o for == para 
		//para(valorInicio; condi��o de parada; contador) { ... }
		/*
		 * tabuada do 5
		 * 1 x 5 = 5
		 * 2 x 5 = 10
		 * 3 x 5 = 15
		 * 
		 * totas as tabuadas do 1 ao 10
		 */
		for(int num=1; num<=10; num++) {
			System.out.println(num +" x 3 =" + num * 3 );
			
			//estrutura if e else dentro de um for
			if(num!=5) {
				System.out.println("esse numero n�o esta sendo multiplicado por 5");
			}else {
				System.out.println("AGORA SIM � MULTIPLO DE 5");
			}
			
		}
		
	}

}
