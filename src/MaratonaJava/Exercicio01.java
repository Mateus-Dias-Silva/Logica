package MaratonaJava;

/*
  Prática

  Crie variáveis para os campos descritos abaixo entre <> e imprima a aseguintr mensaguem:

  Eu <nome>, morando no endereço <endereço>,
  confirmo que recebi o salário <salario>, na data <data>
 */

public class Exercicio01 {
    public static void main(String[] args) {
        String nome = "Mateus";
        String endereço = "Vila Figueira, bairro agotinho irente, número 120";
        String data = "12/08/2022";
        float salario = 2000;

        System.out.println("Eu "+nome + ",morando no " +endereço+ " ,confirmo que recebi o salário"+ salario+ ",na data "+data);
    }
}
