package Aula01;

public class Calculadora {

public static void soma(double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
		System.out.println("Soma: " + numero1 + " + " + numero2 + " = " + resultado);
	}

public static void subtracao(double numero1, double numero2) {
	
	double resultado = numero1 - numero2;
	System.out.println("Subtra��o: " + numero1 + " - " + numero2 + " = " + resultado);
}

public static void multiplicacao(double numero1, double numero2) {
	
	double resultado = numero1 * numero2;
	System.out.println("Multiplica��o: " + numero1 + " * " + numero2 + " = " + resultado);
}

public static void divisao(double numero1, double numero2) {
	
	double resultado = numero1 / numero2;
	System.out.println("Divis�o: " + numero1 + " / " + numero2 + " = " + resultado);
}


}