import java.util.Scanner;

public class CalcularFaturamentoAlt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double faturamentoJaneiro, faturamentoFevereiro, faturamentoMarco, faturamentoTrimestre;

        System.out.print("Entre com o faturamento de Janeiro: ");
        faturamentoJaneiro = scanner.nextDouble();

        System.out.print("Entre com o faturamento de Fevereiro: ");
        faturamentoFevereiro = scanner.nextDouble();

        System.out.print("Entre com o faturamento de Marco: ");
        faturamentoMarco = scanner.nextDouble();

        faturamentoTrimestre = faturamentoJaneiro + faturamentoFevereiro + faturamentoMarco;

        System.out.println("O faturamento do trimestre é: " + faturamentoTrimestre);

        scanner.close();
    }
}