package resoluçao.lista;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		int baseMaior;
		int baseMenor;
		int altura;
		
		System.out.println("Digite o valor do lado maior:");
		baseMaior = sc.nextInt();
		
		System.out.println("Digite o nome da base menor:");
		baseMenor = sc.nextInt();
		
		System.out.println("Digite a altura");
		altura = sc.nextInt();
		
		int area = (baseMaior + baseMenor * altura) /2;
		
		System.out.println("A area é:" + area);
		
		sc.close();
	}
}
