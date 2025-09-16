package br.com.fintech;

import java.math.BigDecimal;

public class FaturaCartao {
    private int mes; // 1..12
    private int ano;
    private BigDecimal valorTotal;
    private StatusFatura status;

    public FaturaCartao() {}

    public FaturaCartao(int mes, int ano, BigDecimal valorTotal, StatusFatura status) {
        this.mes = mes;
        this.ano = ano;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public void adicionarLancamento(BigDecimal valor, String descricao) {
        System.out.println("[FaturaCartao] Adicionando lançamento de R$ " + valor + " - " + descricao + " na fatura " + mes + "/" + ano);
    }

    public void fecharFatura() {
        System.out.println("[FaturaCartao] Fechando fatura " + mes + "/" + ano + " - Status atual: " + status);
    }

    public void pagarFatura(BigDecimal valorPago) {
        System.out.println("[FaturaCartao] Pagando R$ " + valorPago + " da fatura " + mes + "/" + ano);
    }
}
