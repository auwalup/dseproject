package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class DB {
    public static Connection connection;
    public static Statement statement;
    public static void open(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms?user=root&password=kmc468kj");
            statement = connection.createStatement();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "The was a problem accessing the database", "Database Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The was a problem accessing the database", "Database Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
