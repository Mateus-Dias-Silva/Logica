package Mat.academy.EstruturasCondicionais.Arrayss;

import java.util.Scanner;

public class AulaDeArrayss6 {
    public static void main(String[] args) {
        int [][] arrayMultil = new int[2][3];
//        arrayMultil [0][0] = 22;
//        arrayMultil [0][1] = 11;
//        arrayMultil [0][2] = 54;
//        arrayMultil [1][0] = 44;
//        arrayMultil [1][1] = 56;
//        arrayMultil [1][2] = 76;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayMultil.length; i++) {
            for (int j = 0; j < arrayMultil[i].length; j++) {
                System.out.println("Digite o valor da opção (["+ i +"]["+j+"]");
                arrayMultil[i][j] = scanner.nextInt();

            }
        }
        for (int i = 0; i < arrayMultil.length; i++) {
            for (int j = 0; j < arrayMultil[i].length; j++) {
                System.out.println("["+ i +"]["+j+"]"+arrayMultil[i][j]);
                
            }
        }
    }
}
