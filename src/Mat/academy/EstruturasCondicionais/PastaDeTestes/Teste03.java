package Mat.academy.EstruturasCondicionais.PastaDeTestes;

import java.util.Scanner;

//Esse programa pega os valores digitados e realiza p calculo da média desses valores.

public class Teste03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        int media;

        System.out.println("Digite o número:");
        a = input.nextInt();
        System.out.println("Digite o número:");
        b = input.nextInt();
        System.out.println("Digite o número:");
        c = input.nextInt();
        System.out.println("Digite o número:");
        d = input.nextInt();

        media = (a + b + c + d) / 3;
        System.out.println("Valor da média é :" + media);

    }
}
