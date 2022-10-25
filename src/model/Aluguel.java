/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Carlos Roberto
 */
public class Aluguel{ 
     private int id;
     private int idVeiculo;
     private int idCliente;
     private String dataInicio;
     private String dataFinal;
     

    
    public Aluguel(int idVeiculo, int idCliente, String dataInicio, String dataFinal) {
       this.idCliente = idCliente;
       this.idVeiculo = idVeiculo;
       this.dataInicio = dataInicio;
       this.dataFinal = dataFinal;
       
    }
    
    public Aluguel(Integer idVeiculo, Integer idCliente, String dataInicio, String dataFinal, int id){
       this(idVeiculo, idCliente, dataInicio, dataFinal);
       this.id = id;
    }
   
     public Aluguel() {

    }
     
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
       this.id = id;
    }
    
    public Integer getIdVeiculo() {
        return this.idVeiculo;
    }
    
    public void setIdVeiculo(Integer idVeiculo) {
       this.idVeiculo = idVeiculo;
    }
    
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
       this.idCliente = idCliente;
    }
    
    public String getDataInicio() {
        return this.dataInicio;
    }
    
    public void setDataInicio(String dataInicio) {
       this.dataInicio = dataInicio;
    }
    
    public String getDataFinal() {
        return this.dataInicio;
    }
    
    public void setDataFinal(String dataFinal) {
       this.dataFinal = dataFinal;
    }
    
    
}