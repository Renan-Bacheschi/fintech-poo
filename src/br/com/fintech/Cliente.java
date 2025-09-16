package br.com.fintech;

import java.time.LocalDate;

public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private LocalDate dataCadastro;
    private boolean ativo = true;

    public Cliente() {}

    public Cliente(Long id, String nome, String email, String cpf, String telefone, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }

    public void atualizarContato(String novoTelefone) {
        System.out.println("[Cliente] Atualizando contato para: " + novoTelefone);
    }

    public void ativar() {
        System.out.println("[Cliente] Ativando cliente: " + nome);
    }

    public void desativar() {
        System.out.println("[Cliente] Desativando cliente: " + nome);
    }
}
