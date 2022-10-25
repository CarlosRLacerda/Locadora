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
import model.Veiculo;

public class VeiculoDAO {

    public void adicionar(Veiculo veiculo) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstmt = null;

        try {

            pstmt = (PreparedStatement) con.prepareStatement("INSERT INTO veiculo (modelo, ano, chassis, valorDiaria, capacidade, combustivel, marca) VALUES (?,?,?,?,?,?,?)");
            pstmt.setString(1, veiculo.getModelo());
            pstmt.setString(2, veiculo.getAno());
            pstmt.setString(3, veiculo.getChassis());
            pstmt.setString(4, veiculo.getValorDiaria());
            pstmt.setString(5, veiculo.getCapacidade());
            pstmt.setString(6, veiculo.getCombustivel());
            pstmt.setString(7, veiculo.getMarca());

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Veiculo Cadastrado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "#404File" + e);
        } finally {
            ConnectionFactory.closeConnection(con, pstmt);
        }
    }

    public List<Veiculo> read() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        List<Veiculo> veiculos = new ArrayList<>();

        try {
            pstmt = (PreparedStatement) con.prepareStatement("SELECT * FROM veiculo");
            rs = pstmt.executeQuery();

            while (rs.next()) {

                Veiculo veiculo = new Veiculo();

                veiculo.setId(rs.getInt("id"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setAno(rs.getString("ano"));
                veiculo.setChassis(rs.getString("chassis"));
                veiculo.setValorDiaria(rs.getString("valorDiaria"));
                veiculo.setCapacidade(rs.getString("capacidade"));
                veiculo.setCombustivel(rs.getString("combustivel"));
                veiculo.setMarca(rs.getString("marca"));
                veiculos.add(veiculo);

            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, pstmt, rs);
        }

        return veiculos;

    }
     public List<Veiculo> readVeiculo() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        List<Veiculo> veiculos = new ArrayList<>();

        try {
            pstmt = (PreparedStatement) con.prepareStatement("SELECT id, modelo, valorDiaria FROM veiculo");
            rs = pstmt.executeQuery();

            while (rs.next()) {

                Veiculo veiculo = new Veiculo();

                veiculo.setId(rs.getInt("id"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setValorDiaria(rs.getString("valorDiaria"));        
                veiculos.add(veiculo);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, pstmt, rs);
        }

        return veiculos;

    }
     
    public void alterar(Veiculo veiculo) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstmt = null;

        try {
            pstmt = (PreparedStatement) con.prepareStatement("UPDATE veiculo SET modelo=?, ano=?, chassis=?, valorDiaria=?, capacidade=?, combustivel=?, marca=? "
                    + "WHERE id=?");
            pstmt.setString(1, veiculo.getModelo());
            pstmt.setString(2, veiculo.getAno());
            pstmt.setString(3, veiculo.getChassis());
            pstmt.setString(4, veiculo.getValorDiaria());
            pstmt.setString(5, veiculo.getCapacidade());
            pstmt.setString(6, veiculo.getCombustivel());
            pstmt.setString(7, veiculo.getMarca());
            pstmt.setInt(8, veiculo.getId());
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletar(Veiculo veiculo) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = (PreparedStatement) con.prepareStatement("DELETE FROM veiculo "
                    + "WHERE id=?");
            pstmt.setInt(1, veiculo.getId());
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
