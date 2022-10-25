/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Carlos Roberto
 */
public class Cliente implements java.io.Serializable {
    
     private int id;
     private String nome;
     private String CPF;
     private String CNH;
     private String endereco;
     private String telefone;

    
    public Cliente(String nome, String CPF, String CNH, String endereco, String telefone) {
       this.nome = nome;
       this.CPF = CPF;
       this.CNH = CNH;
       this.endereco = endereco;
       this.telefone = telefone;
       
    }
    
    public Cliente(String nome, String CPF, String CNH, String endereco, String telefone, int id) {
       this(nome, CPF, CNH, endereco, telefone);
       this.id = id;
    }
    

    public Cliente() {

    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
       this.id = id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
       this.nome = nome;
    }
    
    public String getCPF() {
        return this.CPF;
    }
    
    public void setCPF(String CPF) {
       this.CPF = CPF;
    }
    
    public String getCNH() {
        return this.CNH;
    }
    
    public void setCNH(String CNH) {
       this.CNH = CNH;
    }
      
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
       this.endereco = endereco;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
       this.telefone = telefone;
    }
}