package Mat.academy.EstruturasCondicionais.Arrayss;

import java.util.Scanner;

public class AulaDeArrayss3 {
    public static void main(String[] args) {
        int [] array1 = new int [3];
        int [] array2 = new int [3];
        int [] array3 = new int [3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, posição :" + i + ": ");
            array1 [i] = scanner.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
        System.out.println("Vetor 2, posição :" + i + ": ");
            array2 [i] = scanner.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            array3 [i] = array1 [i] * array2 [i];
            System.out.println(array3 [i] + "");
        }
    }
}
