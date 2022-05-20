package Exercicios;

public class Main {
	public static void main(String[] args) {

		// Calculadora
		System.out.println("Exercício calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(6, 3);
		Calculadora.multiplicacao(2, 5);
		Calculadora.divisao(10, 2);

		// Mensagem
		System.out.println("Exercício mensagem");
		Mensagem.obterMensagem(5);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		Mensagem.obterMensagem(25);

		// Empréstimo
		System.out.println("Exercício empréstimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
		
		// Quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);
        
        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = RetornosQuadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = RetornosQuadrilatero.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = RetornosQuadrilatero.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);
	}

}
