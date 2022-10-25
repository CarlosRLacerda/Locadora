/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aluguel;
import model.AluguelApoio;


/**
 *
 * @author Carlos Roberto
 */
public class AluguelDAO {
    
    public void adicionar(Aluguel aluguel) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstmt = null;
        
        try {
            
            pstmt = (PreparedStatement) con.prepareStatement( "INSERT INTO aluguel (idVeiculo, idCliente, dataInicio, DataFinal) VALUES (?,?,?,?)");
            pstmt.setInt(1, aluguel.getIdVeiculo());
            pstmt.setInt(2, aluguel.getIdCliente());
            pstmt.setString(3, aluguel.getDataInicio());
            pstmt.setString(4, aluguel.getDataFinal());
            
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "aluguel Cadastrado");
        }   catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "#404File" + e);
        }
        finally{
            ConnectionFactory.closeConnection(con,pstmt);
        }
    }

    
    
    public List<AluguelApoio> read() {

        Connection con = ConnectionFactory.getConnection();
        
        com.mysql.jdbc.PreparedStatement pstmt = null;
        ResultSet rs = null;

        List<AluguelApoio> alugueis = new ArrayList<>();

        try {
            pstmt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT A.idAluguel, C.nome, V.modelo, dataInicio, dataFinal "
                    + "FROM aluguel AS A INNER JOIN cliente AS C ON A.idCliente = C.id INNER JOIN veiculo AS V ON A.idVeiculo = V.id");
            rs = pstmt.executeQuery();

            while (rs.next()) {

                AluguelApoio aluguelApoio = new AluguelApoio(rs.getInt("idAluguel"), rs.getString("nome"), 
                        rs.getString("modelo"), rs.getDate("dataInicio"), 
                        rs.getDate("dataFinal"));

                
              
                alugueis.add(aluguelApoio);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AluguelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, pstmt, rs);
        }

        return alugueis;

    }
    
    
    public List<AluguelApoio> readHome() {

        Connection con = ConnectionFactory.getConnection();
        
        com.mysql.jdbc.PreparedStatement pstmt = null;
        ResultSet rs = null;

        List<AluguelApoio> alugueis = new ArrayList<>();

        try {
            pstmt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT C.nome, V.modelo, dataInicio, dataFinal"
                    + "FROM aluguel AS A INNER JOIN cliente AS C ON A.idCliente = C.id INNER JOIN veiculo AS V ON A.idVeiculo = V.id");
            rs = pstmt.executeQuery();

            while (rs.next()) {

                AluguelApoio aluguelApoio = new AluguelApoio(rs.getInt("idAluguel"), rs.getString("nome"), 
                        rs.getString("modelo"), rs.getDate("dataInicio"), 
                        rs.getDate("dataFinal"));

                
              
                alugueis.add(aluguelApoio);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AluguelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, pstmt, rs);
        }

        return alugueis;

    }
  
    
    public void deletar(int id) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstmt = null;
        try {
           pstmt = (PreparedStatement) con.prepareStatement("DELETE FROM aluguel "
                    + "WHERE idAluguel=?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
