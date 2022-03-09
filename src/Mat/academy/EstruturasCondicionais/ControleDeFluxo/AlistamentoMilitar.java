package Mat.academy.EstruturasCondicionais.ControleDeFluxo;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        String sexo =  "F";
        int idade =  18;
        if  (( sexo  ==  "M"  ||  sexo  ==  "F" )  &&  idade  <  18 ) {
            System.out.println("alistamento não permitido");
        } else if ( sexo  ==  "M"  &&  idade  >=   18) {
            System.out.println("alistamento obrigatório");
        } else if ( sexo  ==  "F"  &&  idade  >=  18) {
            System.out.println("deseja se alistar");
        }
    }
}