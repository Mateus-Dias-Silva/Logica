package Mat.academy.EstruturasCondicionais.ControleDeFluxo;

import java.util.Scanner;

public class CadastroDoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        if (nome.equals( "" ) || nome.equalsIgnoreCase ("admin") || nome.equalsIgnoreCase ("administrador")) {
         System.out.println("Usuário inválido");
    } else {
            System.out.println(nome + " cadastrado com sucesso");
        }
    }
}
