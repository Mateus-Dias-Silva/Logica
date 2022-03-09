package Mat.academy.EstruturasCondicionais.ControleDeFluxo;// Receba um número inteiro do usuário e imprima o dia da semana correspondente//
// Sendo uma segunda - feira//

public class DiaDaSemana {
    public static void main(String[] args) {
        int dia = 5;
        if (dia == 1) {
            System.out.println("segunda-feira");
        } else if (dia == 2){
            System.out.println("terça-feira");
        }else if (dia == 3){
            System.out.println("quarta-feira");
        }else if (dia == 4){
            System.out.println("quinta-feira");
        }else if (dia == 5){
            System.out.println("sexta-feira");
        }else if (dia == 6){
            System.out.println("sabádo");
        }else if (dia == 7){
            System.out.println("domingo");
        }
    }
}
