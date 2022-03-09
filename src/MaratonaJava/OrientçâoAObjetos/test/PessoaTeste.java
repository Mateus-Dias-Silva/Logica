package MaratonaJava.OrientçâoAObjetos.test;

import MaratonaJava.OrientçâoAObjetos.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Mateus";
        pessoa.idade = 20;
        pessoa.sexo = "M";

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
        System.out.println(pessoa);
    }
}
/*
Esse arquivo serve para testar arquivos "main"; e
Referência.
 */