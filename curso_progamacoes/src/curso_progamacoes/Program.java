package curso_progamacoes;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	
	
	//Voce não pode chamar um método que é estático 
	//Dentro de um método que não é estático
	public static void main(String[] args) {

		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");

		
		double radius = sc.nextDouble();
		
		//aqui eu vou usar a propria classe
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
	
	

}
