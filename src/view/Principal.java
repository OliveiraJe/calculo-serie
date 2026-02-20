package view;

import java.util.Scanner;
import controller.CalculoSerieController;

public class Principal {

	public static void main(String[] args) {
		CalculoSerieController cal = new CalculoSerieController();
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		double res = cal.calculo(n);
		
		System.out.println("Soma = 1 + 1/2 + 1/3 + ... + 1/N\n");
		System.out.printf("O resultado da soma para N = %d é: \u001B[32m%.4f\u001B[0m\n", n, res);
		
		leia.close();
	}

}
