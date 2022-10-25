/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;

public class ClienteDAO {

    public void adicionar(Cliente cliente) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstmt = null;
        
        try {
            
            pstmt = (PreparedStatement) con.prepareStatement( "INSERT INTO cliente (nome, CPF, CNH, endereco, telefone) VALUES (?,?,?,?,?)");
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getCPF());
            pstmt.setString(3, cliente.getCNH());
            pstmt.setString(4, cliente.getEndereco());
            pstmt.setString(5, cliente.getTelefone());
            
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado");
        }   catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "#404File" + e);
        }
        finally{
            ConnectionFactory.closeConnection(con,pstmt);
        }
    }

  
    public List<Cliente> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            pstmt = (PreparedStatement) con.prepareStatement("SELECT * FROM cliente");
            rs = pstmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCPF(rs.getString("CPF"));
                cliente.setCNH(rs.getString("CNH"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setTelefone(rs.getString("telefone"));
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, pstmt, rs);
        }

        return clientes;

    }
    
    
    public List<Cliente> readCliente() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            pstmt = (PreparedStatement) con.prepareStatement("SELECT id, nome, CPF FROM cliente");
            rs = pstmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCPF(rs.getString("CPF"));
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, pstmt, rs);
        }

        return clientes;

    }
    
   
    public void alterar(Cliente cliente) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstmt = null;
        
        try {
             pstmt = (PreparedStatement) con.prepareStatement("UPDATE cliente SET nome=?, CPF=?, CNH=?, endereco=?, telefone=?"
                    + "WHERE id=?");
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getCPF());
            pstmt.setString(3, cliente.getCNH());
            pstmt.setString(4, cliente.getEndereco());
            pstmt.setString(5, cliente.getTelefone());
            pstmt.setInt(6, cliente.getId());
            pstmt.executeUpdate();
            
        }   catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void deletar(Cliente cliente) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstmt = null;
        try {
           pstmt = (PreparedStatement) con.prepareStatement("DELETE FROM cliente "
                    + "WHERE id=?");
            pstmt.setInt(1, cliente.getId());
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
