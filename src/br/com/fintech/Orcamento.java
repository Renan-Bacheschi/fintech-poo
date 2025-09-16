package br.com.fintech;

import java.math.BigDecimal;

public class Orcamento {
    private Categoria categoria;
    private BigDecimal metaMensal;
    private BigDecimal gastoAtual;

    public Orcamento() {}

    public Orcamento(Categoria categoria, BigDecimal metaMensal, BigDecimal gastoAtual) {
        this.categoria = categoria;
        this.metaMensal = metaMensal;
        this.gastoAtual = gastoAtual;
    }

    public void adicionarGasto(BigDecimal valor, String descricao) {
        System.out.println("[Orcamento] Adicionando gasto R$ " + valor + " - " + descricao + " na categoria " + categoria);
    }

    public void calcularSaldoDisponivel() {
        System.out.println("[Orcamento] Calculando saldo disponível para a categoria " + categoria + " (meta - gastos)");
    }
}
