package Mat.academy.EstruturasCondicionais.Arrayss;

import java.util.Scanner;

public class AulaDeArrays2 {
    public static void main(String[] args) {
        double [] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota"+ (i * i));
            notas [1] = scanner.nextDouble();

        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas [1];
            System.out.println("Nota"+ (i * i ) + "1" + notas [1]);
        }
        media = media / notas.length;
        System.out.println("Soma das notas : " + media);
    }
}

