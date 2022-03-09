package Mat.academy.EstruturasCondicionais.Whiles;

import java.util.Scanner;

public class AulaDeWhile4 {
    public static void main(String[] args) {
        String login = "Mateus";
        String password = "ReiDoPiratas";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelaLogin) {
            System.out.println("Digite seu login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = scanner.nextLine();
            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("Acesso concedido");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("Acesso negado");
        }
        System.out.println("Programa terminado");
    }
}
