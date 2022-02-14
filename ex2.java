package ex1;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int resultado,num1,Inicio,Fim;
			System.out.println("Digite um Numero  ");
			num1 = leia.nextInt();
			System.out.println("Digite o Inicio  ");
			Inicio = leia.nextInt();
			System.out.println("Digite o Fim ");
			Fim = leia.nextInt();
			for( int i=Inicio; i<=Fim; i++) {
				resultado = i*num1;
				System.out.println(+num1+" * " +i+ " =" + resultado);
			}
		}

	}
	
}