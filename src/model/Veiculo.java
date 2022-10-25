/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Carlos Roberto
 */
public class Veiculo implements java.io.Serializable{
    private int id;
    private String modelo;
    private String ano;
    private String chassis;
    private String valorDiaria;
    private String capacidade;
    private String combustivel;
    private String marca;

    public Veiculo(String modelo, String ano, String chassis, String valorDiaria, String capacidade, String combustivel, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.chassis = chassis;
        this.valorDiaria = valorDiaria;
        this.capacidade = capacidade;
        this.combustivel = combustivel;
        this.marca = marca;
    }
    
    public Veiculo(String modelo, String ano, String chassis, String valorDiaria, String capacidade, String combustivel, String marca, int id) {
        this(modelo, ano, chassis, valorDiaria, capacidade, combustivel, marca);
        this.id = id;
    }
    
     public Veiculo() {
        
    }
    
    public String getAno() {
        return ano;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public String getChassis() {
        return chassis;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getId() {
        return id;
    }

    public String getValorDiaria() {
        return valorDiaria;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setValorDiaria(String valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    
}
