
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Connect {
    public static Connection getConnect()
    {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\phong-PC:1433;databaseName=quanlyhongheo","sa","1234");
            //JOptionPane.showMessageDialog(null, "Ket noi co so du lieu thanh cong","Thong bao",1);
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ket noi co so du lieu that bai","Thong bao",2);
            return null;
        }
    }
}
