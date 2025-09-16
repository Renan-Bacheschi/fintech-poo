package br.com.fintech;

import java.math.BigDecimal;

public class CartaoCredito {
    private String numero;
    private String titular;
    private BigDecimal limite;
    private int melhorDiaCompra; // ex: 10
    private int diaVencimento;   // ex: 25
    private BigDecimal saldoFatura;

    public CartaoCredito() {}

    public CartaoCredito(String numero, String titular, BigDecimal limite, int melhorDiaCompra, int diaVencimento, BigDecimal saldoFatura) {
        this.numero = numero;
        this.titular = titular;
        this.limite = limite;
        this.melhorDiaCompra = melhorDiaCompra;
        this.diaVencimento = diaVencimento;
        this.saldoFatura = saldoFatura;
    }

    public void comprar(BigDecimal valor, String descricao) {
        System.out.println("[CartaoCredito] Registrando compra de R$ " + valor + " - " + descricao + " no cartão " + numero);
    }

    public void ajustarLimite(BigDecimal novoLimite) {
        System.out.println("[CartaoCredito] Ajustando limite para R$ " + novoLimite + " no cartão " + numero);
    }
}
