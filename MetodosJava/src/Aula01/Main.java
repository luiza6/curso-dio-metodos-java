package Aula01;

public class Main {
	public static void main(String[] args) {

		// Calculadora
		System.out.println("Exerc�cio calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(6, 3);
		Calculadora.multiplicacao(2, 5);
		Calculadora.divisao(10, 2);

		// Mensagem
		System.out.println("Exerc�cio mensagem");
		Mensagem.obterMensagem(5);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		Mensagem.obterMensagem(25);

		// Empr�stimo
		System.out.println("Exerc�cio empr�stimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
	}

}
