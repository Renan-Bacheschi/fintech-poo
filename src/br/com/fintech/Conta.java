package br.com.fintech;

import java.math.BigDecimal;

public class Conta {
    private String numero;
    private String agencia;
    private TipoConta tipo;
    private BigDecimal saldo;
    private Cliente titular;

    public Conta() {}

    public Conta(String numero, String agencia, TipoConta tipo, BigDecimal saldo, Cliente titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(BigDecimal valor) {
        System.out.println("[Conta] Depositando R$ " + valor + " na conta " + numero);
    }

    public void sacar(BigDecimal valor) {
        System.out.println("[Conta] Sacando R$ " + valor + " da conta " + numero);
    }

    public void transferir(BigDecimal valor, String contaDestino, String agenciaDestino) {
        System.out.println("[Conta] Transferindo R$ " + valor + " para conta " + contaDestino + " / ag " + agenciaDestino);
    }
}
