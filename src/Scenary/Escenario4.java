package Scenary;

import static Scenary.Escenario3.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author Dilan Chavarría
 * @author Tiffany Hernández
 * @author Diego Herrera
 * @author Jose Pablo Solís
 */
public class Escenario4 {

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
            System.out.println("Este es un escenario de una venta muy grande");
        int C_Order = 20;

        int C_Order_Detail = 19;

        int C_Products = 15;

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
public static void InsertOrderDetail2() throws SQLException {
        int C_Order = 20;

        int C_Order_Detail = 18;

        int C_Products = 4;

        int Q_Line_Detail = 150;

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

    public static void InsertBill() throws SQLException {

        int C_Bill = 13;

        int C_Employee = 1;

        int OrderId = 20;

        int C_TaxCode = 1;

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertBill "
                    + "@C_Bill= " + C_Bill + " ,@C_Employee= " + C_Employee + " ,@OrderId= " + OrderId + " ,@C_TaxCode= " + C_TaxCode);

            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void SelectBill() throws SQLException {

        Statement stmt = getConnection().createStatement();

        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectBillData");
            while (rs.next()) {
                int C_Bill = rs.getInt("C_Bill");
                int C_Employee = rs.getInt("C_Employee");
                int C_Order = rs.getInt("C_Order");
                int C_TaxCode = rs.getInt("C_TaxCode");
                Date F_Bill_Date = rs.getDate("F_Bill_Date");
                double M_Total_Price = rs.getDouble("M_Total_Price");
                double M_Tax_Total_Price = rs.getDouble("M_Tax_Total_Price");

                // Imprimir los resultados en la consola
                System.out.println("C_Bill: " + C_Bill);
                System.out.println("C_Employee: " + C_Employee);
                System.out.println("C_Order: " + C_Order);
                System.out.println("C_TaxCode: " + C_TaxCode);
                System.out.println("F_Bill_Date: " + F_Bill_Date);
                System.out.println("M_Total_Price: " + M_Total_Price);
                System.out.println("M_Tax_Total_Price: " + M_Tax_Total_Price);
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
        InsertOrderDetail2();
        InsertBill();
        SelectBill();
    }
    
}
