package Mat.academy.EstruturasCondicionais.PastaDeTestes;

public class Teste01 {
    public static void main(String[] args) {
        String nome = "Mateus";
        int nota1 = 10;
        int nota2 = 10;
        int nota3 = 10;
        int nota4 = 10;
        int media = (nota1 + nota2 + nota3 + nota4) / 5;
        if (media >= 9 && media <= 10) {
            System.out.println("Você passou");
        } else if (media < 9) {
            System.out.println("Você não passou");
        }
    }
}

