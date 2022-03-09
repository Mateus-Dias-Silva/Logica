package Mat.academy.EstruturasCondicionais.ControleDeFluxo;

import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        if (idade <= 11) {
            System.out.println(nome + "Participará da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + "Participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + "Participará da categoria Pre-Adulto");
        } else {
            System.out.println(nome + "Participará da categoria Adulto");
        }
    }
}