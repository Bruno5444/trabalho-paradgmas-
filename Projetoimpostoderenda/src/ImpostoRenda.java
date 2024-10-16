public class ImpostoRenda {

    public double calcularImpostoSalario(double rendaSalarioAnual) {
        double rendaSalarioMensal = rendaSalarioAnual / 12;
        if (rendaSalarioMensal < 3000) {
            return 0;
        } else if (rendaSalarioMensal < 5000) {
            return rendaSalarioAnual * 0.10;
        } else {
            return rendaSalarioAnual * 0.20;
        }
    }

    public double calcularImpostoServicos(double rendaServicosAnual) {
        return rendaServicosAnual * 0.15;
    }

    public double calcularImpostoGanhoCapital(double rendaGanhoCapitalAnual) {
        return rendaGanhoCapitalAnual * 0.20;
    }

    public void gerarRelatorio(double rendaSalarioAnual, double rendaServicosAnual,
                               double rendaGanhoCapitalAnual, double gastosMedicos,
                               double gastosEducacionais) {
        double impostoSalario = calcularImpostoSalario(rendaSalarioAnual);
        double impostoServicos = calcularImpostoServicos(rendaServicosAnual);
        double impostoGanhoCapital = calcularImpostoGanhoCapital(rendaGanhoCapitalAnual);

        double gastosDedutiveis = gastosMedicos + gastosEducacionais;
        double maxDedutivel = 0.30 * (impostoSalario + impostoServicos + impostoGanhoCapital);
        double abatimento = Math.min(maxDedutivel, gastosDedutiveis);

        double impostoBrutoTotal = impostoSalario + impostoServicos + impostoGanhoCapital;
        double impostoDevido = impostoBrutoTotal - abatimento;

        System.out.println("### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f%n", impostoServicos);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanhoCapital);
        System.out.println("* DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", maxDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
        System.out.println("* RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n", impostoBrutoTotal);
        System.out.printf("Abatimento: %.2f%n", abatimento);
        System.out.printf("Imposto devido: %.2f%n", impostoDevido);
    }
}
