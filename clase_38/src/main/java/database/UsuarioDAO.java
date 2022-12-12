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
    
}
