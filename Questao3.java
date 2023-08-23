package resoluçao.lista;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float peso;
		float altura;
		
		System.out.println("Qual é seu peso?");
		peso = sc.nextFloat();
		
		System.out.println("Qual é sua altura?");
		altura = sc.nextFloat();
		
		System.out.println("O peso digitado foi:" + peso);
		
		System.out.println("A altura digitada foi:" + altura);
		
		float imc = peso / (altura * altura);
		
		System.out.println("Seu imc é:" + imc);
		
		sc.close();
		
	}
}
