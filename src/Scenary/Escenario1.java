package Scenary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import static surguesassur.SurguesasSur.getConnection;

/**
 *
 * @author Dilan Chavarría
 * @author Tiffany Hernández
 * @author Diego Herrera
 * @author Jose Pablo Solís
 */
public class Escenario1 {

    /**
     * @param args the command line arguments
     */
    static Connection con;

    static int C_Codigo_Producto;

    static int ClientID;

    static int C_Order;

    static int C_Order_Detail;

    static int C_Bill;

    static int OrderId;

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

    public static void InsertProduct() throws SQLException {
        System.out.println("Este es un escenario para cuando se realiza una venta de un producto");

        Statement stmt = getConnection().createStatement();

        try ( ResultSet rs = stmt.executeQuery("Select MAX(C_Products) AS C_Products_Max from [dbo].[Products]")) {
            if (rs.next()) {
                C_Codigo_Producto = rs.getInt("C_Products_Max") + 1;
            } else {
                System.out.println("No se encontraron filas en la tabla Products");
            }
        }

        int C_Codigo_Combo = 1;

        int C_Codigo_Categoria = 1;

        String D_Name = "QuericaCola";

        String D_Description = "BebidaAzucarada";

        int N_Quantity = 25;

        double Q_Consumption_Unit = 9.5;

        double M_Price = 600;

        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertProductData "
                    + "@C_Products= " + C_Codigo_Producto + " ,@C_Combo=" + C_Codigo_Combo
                    + " ,@C_Category=" + C_Codigo_Categoria + " ,@D_Name=" + D_Name
                    + " ,@D_Description=" + D_Description + " ,@N_Quantity=" + N_Quantity
                    + " ,@Q_Consumption_Unit=" + Q_Consumption_Unit + " ,@M_Price=" + M_Price);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void InsertOrder() throws SQLException {
        Statement stmt = getConnection().createStatement();
        ClientID = 24;

        int StateTypeID = 1;

        String OrderNumber = "25";

        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.InsertNewOrder "
                    + "@ClientID= " + ClientID + " ,@StateTypeID=" + StateTypeID
                    + " ,@OrderNumber=" + OrderNumber);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void InsertOrderDetail() throws SQLException {

        Statement stmt = getConnection().createStatement();

        try ( ResultSet rs = stmt.executeQuery("Select MAX(C_Order) AS C_Order_Max from [dbo].[Order]")) {
            if (rs.next()) {
                C_Order = rs.getInt("C_Order_Max");
            } else {
                System.out.println("No se encontraron filas en la tabla Products");
            }
        }

        try ( ResultSet rs = stmt.executeQuery("Select MAX(C_Order_Detail) AS C_Order_Detail_Max from [dbo].[OrderDetail]")) {
            if (rs.next()) {
                C_Order_Detail = rs.getInt("C_Order_Detail_Max") + 1;
            } else {
                System.out.println("No se encontraron filas en la tabla Products");
            }
        }

        int C_Products = C_Codigo_Producto;

        int Q_Line_Detail = 4;

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
        Statement stmt = getConnection().createStatement();

        try ( ResultSet rs = stmt.executeQuery("Select MAX(C_Bill) AS C_Bill_Max from [dbo].[Bill]")) {
            if (rs.next()) {
                C_Bill = rs.getInt("C_Bill_Max") + 1;
            } else {
                System.out.println("No se encontraron filas en la tabla Products");
            }
        }

        int C_Employee = 1;

        try ( ResultSet rs = stmt.executeQuery("Select MAX(C_Order) AS C_Order_Max from [dbo].[Order]")) {
            if (rs.next()) {
                OrderId = rs.getInt("C_Order_Max");
            } else {
                System.out.println("No se encontraron filas en la tabla Products");
            }
        }

        int C_TaxCode = 1;

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

    public static void SelectEspecifyBill() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("SELECT [C_Bill],[C_Employee],"
                    + "[C_Order],[C_TaxCode],[F_Bill_Date],[M_Total_Price],"
                    + "[M_Tax_Total_Price] FROM [SurguesasSur].[dbo].[Bill]"
                    + "where [C_Bill] = " + C_Bill);
            while (rs.next()) {
                C_Bill = rs.getInt("C_Bill");
                int C_Employee = rs.getInt("C_Employee");
                C_Order = rs.getInt("C_Order");
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
        InsertProduct();
        InsertOrder();
        InsertOrderDetail();
        InsertBill();
        SelectEspecifyBill();

    }

}
