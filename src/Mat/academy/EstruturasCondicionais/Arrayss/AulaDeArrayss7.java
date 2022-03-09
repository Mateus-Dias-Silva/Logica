package Mat.academy.EstruturasCondicionais.Arrayss;

public class AulaDeArrayss7 {
    public static void main(String[] args) {
        int [][] arrayMultil = new int[3][3];
        arrayMultil [0][0] = 22;
        arrayMultil [0][1] = 11;
        arrayMultil [0][2] = 4;
        arrayMultil [1][0] = 44;
        arrayMultil [1][1] = 56;
        arrayMultil [1][2] = 9;
        arrayMultil [2][0] = 2;
        arrayMultil [2][1] = 5;
        arrayMultil [2][2] = 21;
        int resultMultDiadonalPrncipal = 1;
        for (int i = 0; i < arrayMultil.length; i++) {
            for (int j = 0; j < arrayMultil[i].length; j++) {
                if (i==j) {
                    resultMultDiadonalPrncipal = resultMultDiadonalPrncipal + arrayMultil[i][j];
                }
                
            }
        }
        System.out.println(resultMultDiadonalPrncipal);
    }
}
