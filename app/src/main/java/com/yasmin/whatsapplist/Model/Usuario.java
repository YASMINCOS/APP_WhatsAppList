package com.yasmin.whatsapplist.Model;

public class Usuario {

    private int foto;
    private String nome;
    private String mensagem;

    public Usuario(String mensagem,int foto,  String nome) {
        this.mensagem = mensagem;
        this.foto = foto;
        this.nome = nome;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
