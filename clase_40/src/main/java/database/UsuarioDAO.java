/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import config.DBConn;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author jose
 */
public class UsuarioDAO {
    
    private Connection connection;
    
    public UsuarioDAO(){
        DBConn conn = new DBConn();
        String DB = "homebanking";
        String userDB = "root";
        String passDB = "1234";
        //connection = conn.getConnection("homebanking", "root", "1234");
        connection = conn.getConnection(DB, userDB, passDB);
    }
    
    public Usuario getUserByUsername(String username) throws SQLException {
        PreparedStatement ps;
        ResultSet rs;
        Usuario u = null;

        ps = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
        ps.setString(1, username);

        rs = ps.executeQuery();

        if(rs.next()) {
            String password = rs.getString("password");
            String name = rs.getString("name");
            String last_name = rs.getString("last_name");
            String email = rs.getString("email");

            u = new Usuario(username, password, name, last_name, email);
        }
        return u;
    }
    
    public int createUser(Usuario u) throws SQLException {
        PreparedStatement ps;
        int lineasAfectadas;
        
        String pQuery = "INSERT INTO users (username, password, name, last_name, email, signup_date)"
                + " VALUES(?, ?, ?, ?, ?, sysdate());";
        ps = connection.prepareStatement(pQuery);
        
        ps.setString(1, u.getUsername());
        ps.setString(2, u.getPassword());
        ps.setString(3, u.getName());
        ps.setString(4, u.getLast_name());
        ps.setString(5, u.getEmail());
         
        lineasAfectadas = ps.executeUpdate();
        return lineasAfectadas;
    }

    public int updateUser(Usuario u) throws SQLException {
        PreparedStatement ps;
        int lineasAfectadas;
        
        String pQuery = "UPDATE users SET password = ?, name = ?, last_name = ?, email = ?"
                + " WHERE username = ?;";
        ps = connection.prepareStatement(pQuery);
        
        ps.setString(1, u.getPassword());
        ps.setString(2, u.getName());
        ps.setString(3, u.getLast_name());
        ps.setString(4, u.getEmail());
        ps.setString(5, u.getUsername());
         
        lineasAfectadas = ps.executeUpdate();
        return lineasAfectadas;
    }
    
    public int deleteUser(String username) throws SQLException {
        PreparedStatement ps;
        int lineasAfectadas;
        
        String pQuery = "DELETE FROM users WHERE username = ?;";
        ps = connection.prepareStatement(pQuery);
        
        ps.setString(1, username);
        lineasAfectadas = ps.executeUpdate();
        return lineasAfectadas;
    }

    public boolean login(String userInput, String passInput) throws SQLException {
        PreparedStatement ps;
        ResultSet rs;
                
        ps = connection.prepareStatement("SELECT username, password FROM users WHERE username = ? AND password = ?;");

        ps.setString(1, userInput);
        ps.setString(2, passInput);

        rs = ps.executeQuery();
                
        return rs.next();
    }
}
