/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author DIGETI
 */
import static controller.DB.con;
import static controller.DB.stmt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modell.Muser;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Cuser {
   
    ResultSet rs;
    DB cx;
    public Cuser(){
        cx = new DB();
    }
    public ArrayList<Muser> lista (){
        try {
            ArrayList lista = new ArrayList();
            rs = stmt.executeQuery("SELECT * FROM security.user");
            
            while (rs.next()){
                lista.add(new Muser(rs.getString("id_user"),rs.getString("name_user"), rs.getString("key"), rs.getString("state")));
            }
            stmt.close();
            con.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Cuser.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
}
