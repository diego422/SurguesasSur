package Scenary;

import static Scenary.Escenario5.getConnection;
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
public class Escenario6 {

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
    System.out.println("Escenario de pruebas de actualizacion de una OrdenDetails");
        int C_Order = 20;

        int C_Order_Detail = 23;

        int C_Products = 2;

        int Q_Line_Detail = 20;

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
                                
    public static void SelectProduct1() throws SQLException {
    Statement stmt = getConnection().createStatement();
    try {
        ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectProductData ");
        while (rs.next()) {
            int C_Codigo_Producto = rs.getInt("C_Products");
            int C_Codigo_Combo = rs.getInt("C_Combo");
            int C_Codigo_Categoria = rs.getInt("C_Category");
            String D_Name = rs.getString("D_Name");
            String D_Description = rs.getString("D_Description");
            int N_Quantity = rs.getInt("N_Quantity");
            double Q_Consumption_Unit = rs.getDouble("Q_Consumption_Unit");
            double M_Price = rs.getDouble("M_Price");
           
            
            // Imprimir los resultados en la consola
            System.out.println("C_Codigo_Producto: " + C_Codigo_Producto);
            System.out.println("C_Codigo_Combo: " + C_Codigo_Combo);
            System.out.println("C_Codigo_Categoria: " + C_Codigo_Categoria);
            System.out.println("D_Nombre_Producto: " + D_Name);
            System.out.println("D_Descripcion: " + D_Description);
            System.out.println("N_Cantidad: " + N_Quantity);
            System.out.println("Q_Unidad_Consumo: " + Q_Consumption_Unit);
            System.out.println("M_Precio: " + M_Price);
            System.out.println();
        }
        rs.close();
        stmt.close();
        getConnection().close();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());

    }
}
            
    public static void UpdateOrderDetail() throws SQLException{
    System.out.println("Aqui se realiza la actualizacion de la OrdenDetails");

        int C_Order = 20;


        int C_Order_Detail = 23;
        

        int C_Products = 2;
        

        int Q_Line_Detail = 10;

        
Statement stmt = getConnection().createStatement();
    try {
        ResultSet rs = stmt.executeQuery("dbo.PR_UpdateOrderDetail "+ 
                "@C_Order= "+C_Order+" ,@C_Order_Detail="
                +C_Order_Detail+" ,@C_Products= "
                +C_Products+" ,@Q_Line_Detail_Quantity="+Q_Line_Detail);
              rs.close();
        stmt.close();
        getConnection().close();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
}
                   
    public static void SelectProduct2() throws SQLException {
    Statement stmt = getConnection().createStatement();
    try {
        ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectProductData ");
        while (rs.next()) {
            int C_Codigo_Producto = rs.getInt("C_Products");
            int C_Codigo_Combo = rs.getInt("C_Combo");
            int C_Codigo_Categoria = rs.getInt("C_Category");
            String D_Name = rs.getString("D_Name");
            String D_Description = rs.getString("D_Description");
            int N_Quantity = rs.getInt("N_Quantity");
            double Q_Consumption_Unit = rs.getDouble("Q_Consumption_Unit");
            double M_Price = rs.getDouble("M_Price");
           
            
            // Imprimir los resultados en la consola
            System.out.println("C_Codigo_Producto: " + C_Codigo_Producto);
            System.out.println("C_Codigo_Combo: " + C_Codigo_Combo);
            System.out.println("C_Codigo_Categoria: " + C_Codigo_Categoria);
            System.out.println("D_Nombre_Producto: " + D_Name);
            System.out.println("D_Descripcion: " + D_Description);
            System.out.println("N_Cantidad: " + N_Quantity);
            System.out.println("Q_Unidad_Consumo: " + Q_Consumption_Unit);
            System.out.println("M_Precio: " + M_Price);
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
        SelectProduct1();
        UpdateOrderDetail();
        SelectProduct2();
    }
    
}
