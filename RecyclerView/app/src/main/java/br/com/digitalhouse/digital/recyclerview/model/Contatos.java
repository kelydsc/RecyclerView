package br.com.digitalhouse.digital.recyclerview.model;

public class Contatos {

    //atributos
    private String nome;
    private String telefone;

    //construtor padrão
    public Contatos() {
    }

    //construtor especifico
    public Contatos(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //metodos
}
