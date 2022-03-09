package Mat.academy.EstruturasCondicionais.Switchs;

public class ContasDePorcentagem {
    public static void main(String[] args) {
        String conta = "CONTA_POUPANÇA";
        switch (conta) {
            case "CONTA_POUPANÇA" :
                System.out.println("0.05%");
                break;
            case "CONTA_CORRENTE" :
                System.out.println("0.02%");
                break;
            case "CONTA_INVESTIMENTO" :
                System.out.println("0.01%");
                break;
            default:
                System.out.println("CONTA_INEXISTENTE");
        }
        System.out.println("Fim do programa");
    }
}
