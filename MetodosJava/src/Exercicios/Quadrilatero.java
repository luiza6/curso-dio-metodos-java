/*Sobrecarga
 *  
 * A assinatura � composta pelo m�todo + parametro, quando fazemos uma sobrecarga, n�s mudamos o parametro
 * e mantemos o m�todo como pode ser visto no exemplo a baixo*/


package Exercicios;

public class Quadrilatero {
	public static void area(double lado) {

        System.out.println("�rea do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("�rea do ret�ngulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("�rea do trap�zio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("�rea do losango:" + (diagonal1 * diagonal2)/2);
    }

}
