
package Oject;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Database.*;
import java.sql.Statement;

public class checklog {
    public static Connection conn= null;
    public static ResultSet rs =null;
    public static PreparedStatement pst =null;
    public static String capql =null;
    public static String xa =null;
    public static String huyen =null;
    public static ResultSet cLog(String ID,String password){
        String sql ="select * from quanlyhongheo.dbo.tbCanBo where IDCanBo='"+ID+"' and password ='"+password+"'";
        try {
               conn = Connect.getConnect();
             pst = conn.prepareStatement(sql);            
        return rs = pst.executeQuery();
        } catch (Exception ex) {
            return rs=null;
        }
       
    }
     
}
