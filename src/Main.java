package br.com.fintech;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1L, "Renan", "renan@email.com", "123.456.789-00", "11-99999-0000", LocalDate.now());
        Conta conta = new Conta("12345-6", "0001", TipoConta.CORRENTE, new BigDecimal("1500.00"), cliente);
        Transacao tx = new Transacao(1001L, LocalDateTime.now(), new BigDecimal("250.00"), TipoTransacao.DEPOSITO, "Depósito inicial", conta, null);
        CartaoCredito cartao = new CartaoCredito("5555 4444 3333 2222", "Renan", new BigDecimal("5000.00"), 10, 25, new BigDecimal("0.00"));
        FaturaCartao fatura = new FaturaCartao(8, 2025, new BigDecimal("0.00"), StatusFatura.ABERTA);
        Orcamento orc = new Orcamento(Categoria.ALIMENTACAO, new BigDecimal("800.00"), new BigDecimal("0.00"));

        // Chamadas de métodos (prints)
        cliente.atualizarContato("11-90000-0000");
        cliente.ativar();
        cliente.desativar();

        conta.depositar(new BigDecimal("100.00"));
        conta.sacar(new BigDecimal("50.00"));
        conta.transferir(new BigDecimal("200.00"), "78910-1", "0001");

        tx.efetivar();
        tx.estornar();

        cartao.comprar(new BigDecimal("120.00"), "Supermercado");
        cartao.ajustarLimite(new BigDecimal("6000.00"));

        fatura.adicionarLancamento(new BigDecimal("120.00"), "Compra no Supermercado");
        fatura.fecharFatura();
        fatura.pagarFatura(new BigDecimal("120.00"));

        orc.adicionarGasto(new BigDecimal("200.00"), "Feira do mês");
        orc.calcularSaldoDisponivel();
    }
}
