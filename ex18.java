package link;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		try (Scanner Leia = new Scanner(System.in)) {
			{
			int resultado,num1;
			System.out.println("Digite um Numero  ");
			num1 = Leia.nextInt();
			
			for( int i=1; i<=10; i++) {
				resultado = i*num1;
				if(resultado %2 == 0) {
					
				
				} else {
					System.out.println(+num1+" * " + i + " = " + resultado);
				}
			}

}
		}

	}
	


		
	}


