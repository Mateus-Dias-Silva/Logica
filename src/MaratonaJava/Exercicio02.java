package MaratonaJava;
/*
  idade < 15 categoria infantil;
  idade >= 15 && idade < 18 categoria juvenil;
  idade >= 18 categoria adulto.

 */

public class Exercicio02 {
    public static void main(String[] args) {
       int idade = 19;
       if (idade < 15){
           System.out.println("Categoria infantil");
       } else if ( idade >= 15 && idade < 18){
           System.out.println("Categoria juvenil");
       } else if (idade >= 18){
           System.out.println("Categoria adulto");
       }
    }
}