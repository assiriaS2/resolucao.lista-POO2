package resoluçao.lista;

import java.util.Scanner;

public class Questao4 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        
        if (numero1 > numero2) {
            System.out.println("O primeiro número (" + numero1 + ") é maior que o segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número (" + numero2 + ") é maior que o primeiro número (" + numero1 + ").");
        } else {
            System.out.println("Os dois números são iguais: " + numero1);
        }
        
        sc.close();
        
    }
}
