
import java.util.Scanner;

public class MainImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImpostoRenda impostoRenda = new ImpostoRenda();

        // Leitura de dados
        System.out.print("Renda anual com salário: ");
        double rendaSalarioAnual = scanner.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double rendaServicosAnual = scanner.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double rendaGanhoCapitalAnual = scanner.nextDouble();
        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();
        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        // Gera o relatório
        impostoRenda.gerarRelatorio(rendaSalarioAnual, rendaServicosAnual,
                rendaGanhoCapitalAnual, gastosMedicos,
                gastosEducacionais);
    }
}
