package Mat.academy.EstruturasCondicionais.Whiles;

import java.util.Scanner;

public class AulaDeWhile2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor desejado, por favor");
        int  valorFinal =  teclado.nextInt();
        int i = 0;
        while (i < valorFinal) {
            if (1 % 2 != 0) {
                System.out.println("i = " + i);
            }
                i = i + 1;
        }
    }
}
