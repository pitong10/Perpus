/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;
import java.sql.*; 
import javax.swing.JOptionPane;
/**
 *
 * @author Afif Bahtiar
 */
public class MySqlCon {
    
    static private Connection con;
    public static Connection getConnection() throws Exception{
        if(con==null) {
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan","root","");
            System.out.printf("Koneksi Berhasil");
    }
        return con;
    }
    
    public static void ExecuteQuery(String query, String message) throws Exception{
            Connection connection = getConnection();
            Statement st;
            try{
                st = connection.createStatement();
                if((st.executeUpdate(query))==1){
                    JOptionPane.showMessageDialog(null, message);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Query gagal dieksekusi");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Query Salah : "+e);
            }
    }
    
    
}
