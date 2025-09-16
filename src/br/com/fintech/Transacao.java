package br.com.fintech;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {
    private Long id;
    private LocalDateTime dataHora;
    private BigDecimal valor;
    private TipoTransacao tipo;
    private String descricao;
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transacao() {}

    public Transacao(Long id, LocalDateTime dataHora, BigDecimal valor, TipoTransacao tipo,
                     String descricao, Conta contaOrigem, Conta contaDestino) {
        this.id = id;
        this.dataHora = dataHora;
        this.valor = valor;
        this.tipo = tipo;
        this.descricao = descricao;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void efetivar() {
        System.out.println("[Transacao] Efetivando transação " + id + " do tipo " + tipo + " no valor de R$ " + valor);
    }

    public void estornar() {
        System.out.println("[Transacao] Estornando transação " + id);
    }
}
