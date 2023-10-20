/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ROUPAS.model;


public class ProdutoModel {

    private int id_produto;
    private String nome;
    private String descricao;
    private Double preco;
    private int estoque;

    public ProdutoModel() {
    }

   

    public ProdutoModel(int id_produto, String nome, String descricao, Double preco, int estoque) {
        this.id_produto = id_produto;
        this.nome = nome;     
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    
}

/**
 *
 * @author rcosta
 */

