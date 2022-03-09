package Mat.academy.EstruturasCondicionais.Whiles;

import java.util.Scanner;

public class AulaDeWhile3 {
    public static void main(String[] args) {
        int opçao = 0;
        Scanner teclado = new Scanner(System.in);
        while (opçao != 3) {
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depsositar salário");
            System.out.println("3. Sair");
            System.out.println("Digite sua opção, por favor");
            opçao = teclado.nextInt();

        }
        System.out.println("Programa encerrado");
    }
}
