public class CalcularFaturamento {
    public static void main(String[] args) {
        double faturamentoJaneiro = 1500;
        double faturamentoFevereiro = 4500;
        double faturamentoMarco = 9800;
        double faturamentoTrimestre = faturamentoJaneiro + faturamentoFevereiro + faturamentoMarco;
        System.out.println("O faturamento do trimestre é: " + faturamentoTrimestre);
    }
} 