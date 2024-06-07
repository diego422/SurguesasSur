package Scenary;

import static Scenary.Escenario4.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dilan Chavarría
 * @author Tiffany Hernández
 * @author Diego Herrera
 * @author Jose Pablo Solís
 */
public class Escenario5 {

    /**
     * @param args the command line arguments
     */
            static Connection con;
            public static Connection getConnection() {
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=SurguesasSur;user=sqluser;"
                + "password=1234;loginTimeout=30;"
                + "trustServerCertificate=true";
        try {
            con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
            
                    public static void InsertOrderDetail() throws SQLException {
                        System.out.println("Escenario de pruebas de Integridad de datos");
        int C_Order = 20;

        int C_Order_Detail = 21;

        int C_Products = 2;

        int Q_Line_Detail = 75;

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertOrderDetail "
                    + "@C_Order= " + C_Order + " ,@C_Order_Detail="
                    + C_Order_Detail + " ,@C_Products= "
                    + C_Products + " ,@Q_Line_Detail_Quantity=" + Q_Line_Detail);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
            
    public static void main(String[] args) throws SQLException {
        InsertOrderDetail();
    }
    
}
