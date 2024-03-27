package util;

public class Calculator {

	// Delcarando uma variravel static declarado na classe
		// public static double PI = 3.14159;

		// Quando aplico a palavra final ele ser terona em um constante
		// Padrão para constante e tudo letra maiuscula PI
		public final double PI = 3.14159;

	
	//Metodos estáticos
	public  double circumference(double radius) {			
		return 2.0 * PI * radius;
	}
	
	//Metodos estáticos	
	public double volume(double radius) {			
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
