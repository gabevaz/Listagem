package br.com.fiap.listagem;

import java.io.StringBufferInputStream;

/**
 * Created by logonrm on 03/04/2018.
 */

public class Contato {

    private String nome;
    private String telefone;
    private int imagem;
    private String sobre;

    public Contato() {
    }

    public Contato(String nome, String telefone, int imagem, String sobre) {
        this.nome = nome;
        this.telefone = telefone;
        this.imagem = imagem;
        this.sobre = sobre;
    }

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

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
}
