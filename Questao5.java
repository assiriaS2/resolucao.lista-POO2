package resoluçao.lista;

import java.util.Scanner;

public class Questao5 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
        	
            System.out.println(numero + " é um número ímpar.");
        }
       
        sc.close();
        
    }
}
