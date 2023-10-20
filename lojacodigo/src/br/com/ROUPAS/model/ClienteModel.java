/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ROUPAS.model;

/**
 *
 * @author rcosta
 */
public class ClienteModel {

  
    private int id_cliente;
    private String nome;
    private String email;
    private String telefone;
    

 public ClienteModel(int id_cliente, String nome, String email, String telefone) {
        this.id_cliente = id_cliente;
        this.nome = nome;     
        this.email = email;
        this.telefone = telefone;
    
    }

    public int getid_cliente() {
        return id_cliente;
    }

    public void setid_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getnome() {
        return nome;
    }

    public void setnomel(String nome) {
        this.nome = nome;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String gettelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

}