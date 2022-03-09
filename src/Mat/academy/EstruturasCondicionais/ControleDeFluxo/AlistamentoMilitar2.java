package Mat.academy.EstruturasCondicionais.ControleDeFluxo;

public class AlistamentoMilitar2 {
    public static void main(String[] args) {
        String genero = "Masculino";
        int idade = 18;
        if ( (genero == "Masculino" || genero == "Feminino") && idade < 18 ) {
            System.out.println("alistamento não permitido");
        } else if (genero == "Masculino" && idade >= 18) {
            System.out.println("alistamento obrigatório");
        } else if (genero == "Feminino" && idade >= 18) {
            System.out.println("Deseja se alistar");
        }
    }
}
