package MaratonaJava;

public class Exercicio03 {
    public static void main(String[] args) {
       double salariAtual = 70000;
       double primeiraFaixa = 9.70 / 100;
       double segundaFaixa = 37.35 / 100;
       double terceiraFaixa = 49.50/ 100;
       double valorImposto;
       if (salariAtual <= 34712){
           valorImposto = salariAtual * primeiraFaixa;
       } else if (salariAtual >= 34712 && salariAtual <= 68507){
           valorImposto = salariAtual * segundaFaixa;
       } else {
           valorImposto = salariAtual * terceiraFaixa;
       }
        System.out.println(valorImposto);
    }
}