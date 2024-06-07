package Scenary;

import static Scenary.Escenario6.getConnection;
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
public class Escenario7 {

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
        System.out.println("Escenario de pruebas de creacion y eliminación de una OrdenDetails");
        int C_Order = 20;

        int C_Order_Detail = 24;

        int C_Products = 2;

        int Q_Line_Detail = 5;

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

    public static void SelectOrderDetail1() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_GetOrderDetail");
            while (rs.next()) {
                int C_Order = rs.getInt("C_Order");
                int C_Order_Detail = rs.getInt("C_Order_Detail");
                int C_Products = rs.getInt("C_Products");
                int Q_Line_Detail_Quantity = rs.getInt("Q_Line_Detail_Quantity");

                // Imprimir los resultados en la consola
                System.out.println("C_Order: " + C_Order);
                System.out.println("C_Order_Detail: " + C_Order_Detail);
                System.out.println("C_Products: " + C_Products);
                System.out.println("Q_Line_Detail_Quantity: " + Q_Line_Detail_Quantity);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void DeleteOrderDetail() throws SQLException {
        System.out.println("Aqui se realiza la eliminación de la OrderDetails");
        int C_Order_Detail = 24;
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

    public static void SelectOrderDetail2() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_GetOrderDetail");
            while (rs.next()) {
                int C_Order = rs.getInt("C_Order");
                int C_Order_Detail = rs.getInt("C_Order_Detail");
                int C_Products = rs.getInt("C_Products");
                int Q_Line_Detail_Quantity = rs.getInt("Q_Line_Detail_Quantity");

                // Imprimir los resultados en la consola
                System.out.println("C_Order: " + C_Order);
                System.out.println("C_Order_Detail: " + C_Order_Detail);
                System.out.println("C_Products: " + C_Products);
                System.out.println("Q_Line_Detail_Quantity: " + Q_Line_Detail_Quantity);
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
       InsertOrderDetail();
       SelectOrderDetail1();
       DeleteOrderDetail();
       SelectOrderDetail2();
    }

}
