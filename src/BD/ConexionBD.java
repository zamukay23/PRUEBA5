/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ConexionBD {
    Connection cc=null;
    public Connection conectar(){
        try {
            Class.forName("mysql.jdbc.cj.Driver");
            cc = DriverManager.getConnection("jdbc:mysql://localhost/cv_ape","root","");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);  
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cc;
    }
}
