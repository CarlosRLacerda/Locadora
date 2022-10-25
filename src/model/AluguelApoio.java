/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Carlos Roberto
 */
public class AluguelApoio {
    private int idAluguel;
    private String nomeCliente;
    private String nomeVeiculo;
    private Date DataInicio;
    private Date DataFinal;

    public AluguelApoio(int idAluguel, String nomeCliente, String nomeVeiculo, Date DataInicio, Date DataFinal) {
        this.idAluguel = idAluguel;
        this.nomeCliente = nomeCliente;
        this.nomeVeiculo = nomeVeiculo;
        this.DataInicio = DataInicio;
        this.DataFinal = DataFinal;
    }

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }

    public Date getDataFinal() {
        return DataFinal;
    }

    public void setDataFinal(Date DataFinal) {
        this.DataFinal = DataFinal;
    }
     

}
