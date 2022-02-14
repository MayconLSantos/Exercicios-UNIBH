package link;

import java.util.Scanner;

public class ex11 {

	public static void main1(String[] args) {
	}  

		public static void main11(String[] args) {
			try (Scanner Leia = new Scanner(System.in)) {
				int resultado,num1,Inicio,Fim;
				System.out.println("Digite um Numero  "); {
				num1 = Leia.nextInt();
				System.out.println("Digite o Inicio  ");
				Inicio = Leia.nextInt();
				System.out.println("Digite o Fim ");
				Fim = Leia.nextInt();
				for( int i=Inicio; i<=Fim; i++) {
					resultado = i*num1; {
					System.out.println(+num1+" * " + i + " =" + resultado); 
				}
					
				}
				
				}
				
			}
			
		}
		
}
