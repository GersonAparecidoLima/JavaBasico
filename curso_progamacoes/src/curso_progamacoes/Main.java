package curso_progamacoes;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		System.out.println("\n**********************************\n");
		
				
		double b, B, h, area;
		//Sempre indique o tipo do número
		//Para double use: .0 
		//Para float use: f
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
	 	
		System.out.println("\n**********************************\n");
		
		//Casting
		//É a conversão explícita de um tipo para outro.
		
		int a, b1;
		double resultado;
		a = 5;
		b1 = 2;
		//quando eu coloco o (double)
		//eu aplico o Casting, de forma que o copilado não 
		//aredonda mas
		resultado = (double) a / b1;
		System.out.println(resultado);
		
	}

}
