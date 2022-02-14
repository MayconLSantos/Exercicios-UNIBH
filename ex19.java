package link;

import java.util.Scanner;

public class ex19 { 
	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int resultado,num1;
			System.out.println("Digite um Numero  ");
			num1 = leia.nextInt();
			
			for( int i=1; i<=10; i++) {
				resultado = i*num1;
				System.out.println(+num1+" * " +i+ " =" + resultado);
			}
		}

	}
	
}

