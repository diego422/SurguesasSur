package Scenary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static surguesassur.SurguesasSur.getConnection;

/**
 *
 * @author Dilan Chavarría
 * @author Tiffany Hernández
 * @author Diego Herrera
 * @author Jose Pablo Solís
 */
public class Escenario8 {

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

    public static void DeleteOrderDetail() throws SQLException {
        System.out.println("Escenario de borrado por completo de un orden");

        int C_Order_Detail = 27;
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_DeleteOrderDetail "
                    + "@C_Order_Detail= " + C_Order_Detail);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DeleteOrder() throws SQLException {
        System.out.println("Aqui se borra la orden");
        int OrderID = 21;
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("exec dbo.DeleteOrder "
                    + "@OrderID= " + OrderID);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }
    
    public static void SelectOrder() throws SQLException {
    Statement stmt = getConnection().createStatement();
    try {
        ResultSet rs = stmt.executeQuery("exec dbo.GetOrders");
        while (rs.next()) {
            int C_Order = rs.getInt("C_Order");
            String N_Order_Number = rs.getString("N_Order_Number");
            int C_Client = rs.getInt("C_Client");
            int C_State_Type = rs.getInt("C_State_Type");
            
            // Imprimir los resultados en la consola
            System.out.println("C_Order: " + C_Order);
            System.out.println("N_Order_Number: " + N_Order_Number);
            System.out.println("C_Client: "+ C_Client);
            System.out.println("C_State_Type: "+ C_State_Type);
            System.out.println();
        }
        rs.close();
        stmt.close();
        getConnection().close();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
   
    }
}

    public static void main(String[] args) throws SQLException {
        DeleteOrderDetail();
        DeleteOrder();
        SelectOrder();
    }

}
