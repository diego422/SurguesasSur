package MetodosPackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
import static surguesassur.SurguesasSur.getConnection;

/**
 *
 * @author Dilan Chavarría
 * @author Tiffany Hernández
 * @author Diego Herrera
 * @author Jose Pablo Solís
 */
public class Metodos {

    static Scanner scanner = new Scanner(System.in);

    //-------------------------------Tabla Personas
    public static void SelectPersons() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectPersonData");
            while (rs.next()) {
                int C_Codigo_Persona = rs.getInt("C_Codigo_Persona");
                int C_Cedula = rs.getInt("C_Cedula");
                int C_Codelec = rs.getInt("C_Codelec");
                String D_Relleno = rs.getString("D_Relleno");
                Date F_FechaCaducidad = rs.getDate("F_FechaCaducidad");
                String D_Junta = rs.getString("D_Junta");
                String D_Nombre = rs.getString("D_Nombre");
                String D_Primer_Apellido = rs.getString("D_Primer_Apellido");
                String D_Segundo_Apellido = rs.getString("D_Segundo_Apellido");
                Date Fecha_Insercion = rs.getDate("Fecha_Insercion");

                // Imprimir los resultados en la consola
                System.out.println("C_Codigo_Persona: " + C_Codigo_Persona);
                System.out.println("C_Cedula: " + C_Cedula);
                System.out.println("C_Codelec: " + C_Codelec);
                System.out.println("D_Relleno : " + D_Relleno);
                System.out.println("F_FechaCaducidad: " + F_FechaCaducidad);
                System.out.println("D_Junta: " + D_Junta);
                System.out.println("D_Nombre: " + D_Nombre);
                System.out.println("D_Primer_Apellido: " + D_Primer_Apellido);
                System.out.println("D_Segundo_Apellido: " + D_Segundo_Apellido);
                System.out.println("Fecha_Insercion: " + Fecha_Insercion);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void InsertPersons() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de personas");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Cedula:");
        int C_Cedula = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Nombre:");
        String D_Nombre = scanner.next();

        System.out.println("Ingrese el valor de D_Primer_Apellido:");
        String D_Primer_Apellido = scanner.next();

        System.out.println("Ingrese el valor de D_Segundo_Apellido:");
        String D_Segundo_Apellido = scanner.next();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertPerson "
                    + "@C_Cedula= " + C_Cedula + " ,@D_Nombre=" + D_Nombre + " ,@D_Primer_Apellido="
                    + D_Primer_Apellido + " ,@D_Segundo_Apellido=" + D_Segundo_Apellido);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void UpdatePersons() throws SQLException {
        System.out.println("Bienvenido al area de actualización de personas");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Cedula para buscar a la persona a actualizar:");
        int C_Cedula = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de D_Nombre:");
        String D_Nombre = scanner.next();

        System.out.println("Ingrese el nuevo valor de D_Primer_Apellido:");
        String D_Primer_Apellido = scanner.next();

        System.out.println("Ingrese el nuevo valor de D_Segundo_Apellido:");
        String D_Segundo_Apellido = scanner.next();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_UpdatePerson "
                    + "@C_Cedula= " + C_Cedula + " ,@D_Nombre=" + D_Nombre + " ,@D_Primer_Apellido="
                    + D_Primer_Apellido + " ,@D_Segundo_Apellido=" + D_Segundo_Apellido);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static void DeletePersons() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de personas");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Cedula para buscar a la persona a eliminar:");
        int C_Cedula = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_DeletePersonData "
                    + "@C_Cedula= " + C_Cedula);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

//------------------------------------------Tabla Province
    public static void InsertProvince() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de provincia");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Province:");
        int C_Province = scanner.nextInt();

        System.out.println("Ingrese el valor de D_NomProvince:");
        String D_NomProvince = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertProvince "
                    + "@C_Province= " + C_Province + " ,@D_NomProvince=" + D_NomProvince);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void SelectProvince() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectProvinceData");
            while (rs.next()) {
                int C_Province = rs.getInt("C_Province");
                String D_NomProvince = rs.getString("D_NomProvince");

                // Imprimir los resultados en la consola
                System.out.println("C_Province: " + C_Province);
                System.out.println("D_NomProvince: " + D_NomProvince);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void UpdateProvince() throws SQLException {
        System.out.println("Bienvenido al area de actualización de provincia");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Province para buscar a la provincia a actualizar:");
        int C_Province = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de D_NomProvince:");
        String D_NomProvince = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_UpdateProvince "
                     + "@C_Province= " + C_Province + " ,@D_NomProvince=" + D_NomProvince);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static void DeleteProvince() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de provincias");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Province para buscar a la persona a eliminar:");
        int C_Province = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_DeleteProvinceData "
                    + "@C_Province= " + C_Province);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

//-------------------------------Tabla de Canton
    public static void InsertCanton() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de Canton");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Canton:");
        int C_Canton = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Province:");
        int C_Province = scanner.nextInt();

        System.out.println("Ingrese el valor de D_NomCanton:");
        String D_NomCanton = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertCanton "
                    + "@C_Canton= " + C_Canton + " ,@C_Province=" + C_Province
                    + " ,@D_NomCanton=" + D_NomCanton);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void SelectCanton() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectCantonData");
            while (rs.next()) {
                int C_Canton = rs.getInt("C_Canton");
                int C_Province = rs.getInt("C_Province");
                String D_NomCanton = rs.getString("D_NomCanton");

                // Imprimir los resultados en la consola
                System.out.println("C_Canton: " + C_Canton);
                System.out.println("C_Province: " + C_Province);
                System.out.println("D_NomCanton: " + D_NomCanton);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void UpdateCanton() throws SQLException {
        System.out.println("Bienvenido al area de actualización de Canton");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Canton:");
        int C_Canton = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Province:");
        int C_Province = scanner.nextInt();

        System.out.println("Ingrese el valor de D_NomCanton:");
        String D_NomCanton = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_UpdateCanton "
                    + "@C_Canton= " + C_Canton + " ,@C_Province=" + C_Province
                    + " ,@D_NomCanton=" + D_NomCanton);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static void DeleteCanton() throws SQLException {
        System.out.println("Bienvenido al area de eliminación de Canton");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Canton:");
        int C_Canton = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_DeleteCantonData "
                    + "@C_Canton= " + C_Canton);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

//---------------------------------Tabla de District
    public static void InsertDistrict() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de Distrito");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_District:");
        int C_District = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Canton:");
        int C_Canton = scanner.nextInt();

        System.out.println("Ingrese el valor de D_NomDistrict:");
        String D_NomDistrict = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertDistrict "
                    + "@C_District= " + C_District + " ,@C_Canton=" + C_Canton
                    + " ,@D_NomDistrict=" + D_NomDistrict);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void SelectDistrict() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectDistrictData");
            while (rs.next()) {
                int C_District = rs.getInt("C_District");
                int C_Canton = rs.getInt("C_Canton");
                String D_NomDistrict = rs.getString("D_NomDistrict");

                // Imprimir los resultados en la consola
                System.out.println("C_District: " + C_District);
                System.out.println("C_Canton: " + C_Canton);
                System.out.println("D_NomDistrict: " + D_NomDistrict);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void UpdateDistrict() throws SQLException {
        System.out.println("Bienvenido al area de actualización de Distrito");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_District:");
        int C_District = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Canton:");
        int C_Canton = scanner.nextInt();

        System.out.println("Ingrese el valor de D_NomDistrict:");
        String D_NomDistrict = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_UpdateDistrict "
                    + "@C_District= " + C_District + " ,@C_Canton=" + C_Canton
                    + " ,@D_NomDistrict=" + D_NomDistrict);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static void DeleteDistrict() throws SQLException {
        System.out.println("Bienvenido al area de eliminación de Distrito");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_District:");
        int C_District = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_DeleteDistrictData "
                    + "@C_District= " + C_District);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

//------------------------------------Tabla de DirFisicClients
    public static void InsertDirFisicClient() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de una dirección fisica de cliente");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Physical_Address:");
        int C_Physical_Address = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Address:");
        String D_Address = scanner.next();

        System.out.println("Ingrese el valor de C_District:");
        int C_District = scanner.nextInt();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertDirFisicClient "
                    + "@C_Physical_Address= " + C_Physical_Address + " ,@D_Address=" + D_Address
                    + " ,@C_District=" + C_District);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void SelectDirFisicClient() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectDirFisicClientData");
            while (rs.next()) {
                int C_Physical_Address = rs.getInt("C_Physical_Address");
                int C_District = rs.getInt("C_District");
                String D_Address = rs.getString("D_Address");

                // Imprimir los resultados en la consola
                System.out.println("C_Physical_Address: " + C_Physical_Address);
                System.out.println("C_District: " + C_District);
                System.out.println("D_Address: " + D_Address);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void UpdateDirFisicClient() throws SQLException {
        System.out.println("Bienvenido al area de actualización de una dirección fisica de cliente");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_District:");
        int C_District = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Physical_Address:");
        int C_Physical_Address = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Address:");
        String D_Address = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_UpdateDirFisicClient "
                    + "@C_District= " + C_District + " ,@C_Physical_Address=" + C_Physical_Address
                    + " ,@D_Address=" + D_Address);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static void DeleteDirFisicClient() throws SQLException {
        System.out.println("Bienvenido al area de eliminación de una dirección fisica de cliente");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Physical_Address:");
        int C_Physical_Address = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_DeleteDirFisicClientData "
                    + "@C_Physical_Address= " + C_Physical_Address);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

//------------------------------------Tabla de Clients
    public static void InsertClient() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de un cliente");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de ClientID:");
        int C_Client = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Mail:");
        String D_Mail = scanner.next();

        System.out.println("Ingrese el valor de N_Phone_Number:");
        int N_Phone_Number = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Physical_Address:");
        int C_Physical_Address = scanner.nextInt();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertClient "
                    + "@C_Client=" + C_Client + " ,@D_Mail=" + D_Mail
                    + " ,@N_Phone_Number=" + N_Phone_Number + " ,@C_Physical_Address=" + C_Physical_Address);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void SelectClient() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectClientData");
            while (rs.next()) {
                int C_Client = rs.getInt("C_Client");
                int N_Phone_Number = rs.getInt("N_Phone_Number");
                String D_Mail = rs.getString("D_Mail");
                int C_Physical_Address = rs.getInt("C_Physical_Address");

                // Imprimir los resultados en la consola
                System.out.println("C_Client: " + C_Client);
                System.out.println("N_Phone_Number: " + N_Phone_Number);
                System.out.println("D_Mail: " + D_Mail);
                System.out.println("C_Physical_Address: " + C_Physical_Address);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void UpdateClient() throws SQLException {
        System.out.println("Bienvenido al area de actualización de un cliente");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de ClientID:");
        int C_Client = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Mail:");
        String D_Mail = scanner.next();

        System.out.println("Ingrese el valor de N_Phone_Number:");
        int N_Phone_Number = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Physical_Address:");
        int C_Physical_Address = scanner.nextInt();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_UpdateClient "
                    + "@C_Client= " + C_Client + " ,@D_Mail=" + D_Mail
                    + " ,@N_Phone_Number=" + N_Phone_Number + " ,@C_Physical_Address=" + C_Physical_Address);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static void DeleteClient() throws SQLException {
        System.out.println("Bienvenido al area de eliminación de un cliente");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Client:");
        int C_Client = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_DeleteClientData "
                    + "@C_Client= " + C_Client);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

//-----------------------------------------Tabla de Order
    public static void InsertOrder() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de una Orden");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de ClientID:");
        int ClientID = scanner.nextInt();

        System.out.println("Ingrese el valor de StateTypeID:");
        int StateTypeID = scanner.nextInt();

        System.out.println("Ingrese el valor de OrderNumber:");
        String OrderNumber = scanner.next();

        Statement stmt = getConnection().createStatement();
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
                System.out.println("C_Client: " + C_Client);
                System.out.println("C_State_Type: " + C_State_Type);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void UpdateOrder() throws SQLException {
        System.out.println("Bienvenido al area de actualización de un cliente");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de OrderID:");
        int OrderID = scanner.nextInt();

        System.out.println("Ingrese el valor de StateTypeID:");
        int StateTypeID = scanner.nextInt();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("exec dbo.UpdateOrderStatus "
                    + "@OrderID= " + OrderID + " ,@StateTypeID=" + StateTypeID);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static void DeleteOrder() throws SQLException {
        System.out.println("Bienvenido al area de eliminación de un cliente");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de OrderID:");
        int OrderID = scanner.nextInt();
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

//-----------------------------------------Tabla de StateType
    public static void InsertStateType() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de un tipo de estado");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_State_Type:");
        int C_State_Type = scanner.nextInt();

        System.out.println("Ingrese el valor de D_State_Type:");
        String D_State_Type = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertStateTypeData "
                    + "@C_State_Type= " + C_State_Type + " ,@D_State_Type=" + D_State_Type);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void SelectStateType() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectStateTypeData");
            while (rs.next()) {
                int C_State_Type = rs.getInt("C_State_Type");
                String D_State_Type = rs.getString("D_State_Type");

                // Imprimir los resultados en la consola
                System.out.println("C_State_Type: " + C_State_Type);
                System.out.println("D_State_Type: " + D_State_Type);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void UpdateStateType() throws SQLException {
        System.out.println("Bienvenido al area de actualización de un tipo de estado");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_State_Type:");
        int C_State_Type = scanner.nextInt();

        System.out.println("Ingrese el valor de D_State_Type:");
        String D_State_Type = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_UpdateStateTypeData "
                    + "@C_State_Type= " + C_State_Type + " ,@D_State_Type=" + D_State_Type);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static void DeleteStateType() throws SQLException {
        System.out.println("Bienvenido al area de eliminación de un tipo de estado");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_State_Type:");
        int C_State_Type = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_DeleteStateTypeData "
                    + "@C_State_Type= " + C_State_Type);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

//----------------------------------------Tabla de category
    public static void InsertCategory() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de Categorías");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Category:");
        int C_Category = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Category_Name:");
        String D_Nombre = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertCategoryData "
                    + "@C_Category= " + C_Category + " ,@D_Category_Name=" + D_Nombre);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void SelectCategory() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_GetCategoryData");
            while (rs.next()) {
                int C_Codigo_Category = rs.getInt("C_Category");
                String D_Nombre_Category = rs.getString("D_Category_Name");

                // Imprimir los resultados en la consola
                System.out.println("C_Codigo_Category: " + C_Codigo_Category);
                System.out.println("D_Nombre_Category: " + D_Nombre_Category);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void UpdateCategory() throws SQLException {
        System.out.println("Bienvenido al area de actualización de Categoria");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Category para buscar a la Categoria a actualizar:");
        int C_Category = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de D_Category_Name:");
        String D_Nombre = scanner.next();

        try {
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("dbo.PR_UpdateCategoryData "
                    + "@C_Category= " + C_Category + " ,@NewD_Category_Name=" + D_Nombre);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static void DeleteCategory() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de categoría");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Category para buscar la categoria a eliminar:");
        int C_Category = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_DeleteCategorieData "
                    + "@C_Category= " + C_Category);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

//----------------------------------Tabla de Combo
    public static void SelectCombo() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.GetOrderdetails ");
            while (rs.next()) {
                int C_Codigo_Combo = rs.getInt("C_Combo");
                String D_Nombre_Combo = rs.getString("D_Combo_Name");

                // Imprimir los resultados en la consola
                System.out.println("C_Codigo_Combo: " + C_Codigo_Combo);
                System.out.println("C_Nombre_Combo: " + D_Nombre_Combo);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void InsertCombo() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de Combos");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Combo:");
        int C_Codigo_Combo = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Combo_Name:");
        String D_Nombre_Combo = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.InsertComboData "
                    + "@C_Combo= " + C_Codigo_Combo + " ,@D_Combo_Name=" + D_Nombre_Combo);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void UpdateCombo() throws SQLException {
        System.out.println("Bienvenido al area de actualización de Categoria");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Combo para buscar a la Categoria a actualizar:");
        int C_Combo = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de D_Combo_Name:");
        String D_Nombre_Combo = scanner.next();

        try {
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("dbo.UpdateComboData "
                    + "@C_Combo= " + C_Combo + " ,@NewD_Combo_Name=" + D_Nombre_Combo);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static void DeleteCombo() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de personas");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Combo para buscar el combo a eliminar:");
        int C_Combo = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.DeleteComboData "
                    + "@C_Combo= " + C_Combo);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

//---------------------------------Tabla de Employee
    public static void SelectEmployee() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectEmployeeData");
            while (rs.next()) {
                int C_Employee = rs.getInt("C_Employee");
                int C_Branch = rs.getInt("C_Branch");
                int C_Jobtype = rs.getInt("C_Jobtype");
                String D_Employee_Name = rs.getString("D_Employee_Name");
                int N_Employee_Number = rs.getInt("N_Employee_Number");
                int ReportsTo = rs.getInt("ReportsTo");

                // Imprimir los resultados en la consola
                System.out.println("C_Employee: " + C_Employee);
                System.out.println("C_Branch: " + C_Branch);
                System.out.println("C_Jobtype: " + C_Jobtype);
                System.out.println("D_Employee_Name : " + D_Employee_Name);
                System.out.println("N_Employee_Number : " + N_Employee_Number);
                System.out.println("ReportsTo: " + ReportsTo);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void InsertEmployee() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de empleados");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Employee:");
        int C_Employee = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Branch:");
        int C_Branch = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Jobtype:");
        int C_Jobtype = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Employee_Name:");
        String D_Employee_Name = scanner.next();

        System.out.println("Ingrese el valor de N_Employee_Number:");
        int N_Employee_Number = scanner.nextInt();

        System.out.println("Ingrese el valor de ReportsTo:");
        int ReportsTo = scanner.nextInt();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertEmployeeData "
                    + "@C_Employee= " + C_Employee + " ,@C_Branch=" + C_Branch + " ,@C_Jobtype="
                    + C_Jobtype + " ,@D_Employee_Name=" + D_Employee_Name + " ,@N_Employee_Number="
                    + N_Employee_Number + " ,@ReportsTo=" + ReportsTo);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void UpdateEmployee() throws SQLException {
        System.out.println("Bienvenido al area de actualización de personas");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Employee para buscar a el employee a actualizar:");
        int C_Employee = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de C_Branch:");
        int C_Branch = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de C_Jobtype:");
        int C_Jobtype = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de D_Employee_Name:");
        String D_Employee_Name = scanner.next();

        System.out.println("Ingrese el nuevo valor de N_Employee_Number:");
        int N_Employee_Number = scanner.nextInt();

        System.out.println("Ingrese el valor de ReportsTo:");
        int ReportsTo = scanner.nextInt();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_UpdateEmployeeData "
                    + "@C_Employee= " + C_Employee + " ,@C_Branch=" + C_Branch + " ,@C_Jobtype="
                    + C_Jobtype + " ,@D_Employee_Name=" + D_Employee_Name + " ,@N_Employee_Number="
                    + N_Employee_Number + " ,@ReportsTo=" + ReportsTo);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DeleteEmployee() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de employee");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Employee para buscar a el employee a eliminar:");
        int C_Employee = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_DeleteEmployeeData "
                    + "@C_Employee= " + C_Employee);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

//---------------------------------Tabla de JobType
    public static void SelectJobtype() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectJobTypeData");
            while (rs.next()) {
                int C_Job_Type = rs.getInt("C_Job_Type");
                String D_Job_Description = rs.getString("D_Job_Description");

                // Imprimir los resultados en la consola
                System.out.println("C_Job_Type: " + C_Job_Type);
                System.out.println("D_Job_Description: " + D_Job_Description);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void InsertJobtype() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de empleados");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Job_Type:");
        int C_Job_Type = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Job_Description:");
        String D_Job_Description = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertJobType "
                    + "@C_Job_Type= " + C_Job_Type + " ,@D_Job_Description=" + D_Job_Description);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void UpdateJobtype() throws SQLException {
        System.out.println("Bienvenido al area de actualización de jobtype");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Job_Type para buscar el Job_Type a actualizar:");
        int C_Job_Type = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de D_Job_Description:");
        String D_Job_Description = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_UpdateJobTypeData "
                    + "@C_Job_Type= " + C_Job_Type + " ,@D_Job_Description=" + D_Job_Description);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DeleteJobtype() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de Jobtype");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Job_Type para buscar el jobtype a eliminar:");
        int C_Job_Type = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_DeleteJobTypeData "
                    + "@C_Job_Type= " + C_Job_Type);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//-------------------------------------------Tabla de Branches
    public static void SelectBranch() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectBranchData");
            while (rs.next()) {
                int C_Branch = rs.getInt("C_Branch");
                String D_Branch_Addres = rs.getString("D_Branch_Addres");

                // Imprimir los resultados en la consola
                System.out.println("C_Branch: " + C_Branch);
                System.out.println("D_Branch_Addres: " + D_Branch_Addres);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void InsertBranch() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de branch");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Branch:");
        int C_Branch = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Branch_Adress:");
        String D_Branch_Addres = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertIntoBranches "
                    + "@C_Branch= " + C_Branch + " ,@D_Branch_Addres=" + D_Branch_Addres);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void UpdateBranch() throws SQLException {
        System.out.println("Bienvenido al area de actualización de branch");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Branch para buscar el branch a actualizar:");
        int C_Branch = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de D_Branch_Addres:");
        String D_Branch_Addres = scanner.next();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.UpdateBranchData "
                    + "@C_Branch= " + C_Branch + " ,@D_Branch_Addres=" + D_Branch_Addres);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DeleteBranch() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de branch");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Branch para buscar el branch a eliminar:");
        int C_Branch = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_DeleteBranchData "
                    + "@C_Branch= " + C_Branch);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//---------------------------------Tabla de Tax
    public static void SelectTax() throws SQLException {
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_SelectTaxData");
            while (rs.next()) {
                int C_Tax_Code = rs.getInt("C_Tax_Code");
                String D_Tax_Code = rs.getString("D_Tax_Code");
                double P_Tax_Percentage = rs.getDouble("P_Tax_Percentage");

                // Imprimir los resultados en la consola
                System.out.println("C_Tax_Code: " + C_Tax_Code);
                System.out.println("D_Tax_Code: " + D_Tax_Code);
                System.out.println("P_Tax_Percentage: " + P_Tax_Percentage);
                System.out.println();
            }
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void InsertTax() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de Tax");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Tax_Code:");
        int C_Tax_Code = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Tax_Code:");
        String D_Tax_Code = scanner.next();

        System.out.println("Ingrese el valor de P_Tax_Percentage:");
        double P_Tax_Percentage = scanner.nextDouble();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertTaxData "
                    + "@C_Tax_Code= " + C_Tax_Code + " ,@D_Tax_Code="
                    + D_Tax_Code + " ,@P_Tax_Percentage= " + P_Tax_Percentage);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void UpdateTax() throws SQLException {
        System.out.println("Bienvenido al area de actualización de branch");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Tax_Code para buscar el Tax a actualizar:");
        int C_Tax_Code = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de D_Tax_Code:");
        String D_Tax_Code = scanner.next();

        System.out.println("Ingrese el valor de P_Tax_Percentage:");
        double P_Tax_Percentage = scanner.nextDouble();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_UpdateTaxData "
                    + "@C_Tax_Code= " + C_Tax_Code + " ,@D_Tax_Code="
                    + D_Tax_Code + " ,@P_Tax_Percentage=" + P_Tax_Percentage);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DeleteTax() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de Tax");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Tax_Code para buscar el Tax a eliminar:");
        int C_Tax_Code = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_DeleteTaxData "
                    + "@C_Tax_Code= " + C_Tax_Code);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//---------------------------Tabla de Products
    public static void SelectProduct() throws SQLException {
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

    public static void InsertProduct() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de Combos");
        System.out.println("Por favor, seguir los siguientes pasos");

        System.out.println("Ingrese el valor de C_Products:");
        int C_Codigo_Producto = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Combo:");
        int C_Codigo_Combo = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Category:");
        int C_Codigo_Categoria = scanner.nextInt();

        System.out.println("Ingrese el valor de D_Name:");
        String D_Name = scanner.next();

        System.out.println("Ingrese el valor de D_Description:");
        String D_Description = scanner.next();

        System.out.println("Ingrese el valor de N_Quantity:");
        int N_Quantity = scanner.nextInt();

        System.out.println("Ingrese el valor de Q_Consumption_Unit:");
        double Q_Consumption_Unit = scanner.nextDouble();

        System.out.println("Ingrese el valor de M_Price:");
        double M_Price = scanner.nextDouble();

        Statement stmt = getConnection().createStatement();
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

    public static void UpdateProduct() throws SQLException {
        System.out.println("Bienvenido al area de actualización de Categoria");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Product para buscar a la Categoria a actualizar:");
        int C_Codigo_Producto = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de C_Combo:");
        int C_Codigo_Combo = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de C_Category:");
        int C_Codigo_Categoria = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de D_Name:");
        String D_Name = scanner.next();

        System.out.println("Ingrese el nuevo valor de D_Description:");
        String D_Description = scanner.next();

        System.out.println("Ingrese el nuevo valor de N_Quantity:");
        int N_Quantity = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de Q_Consumption_Unit:");
        double Q_Consumption_Unit = scanner.nextDouble();

        System.out.println("Ingrese el nuevo valor de M_Price:");
        double M_Price = scanner.nextDouble();

        try {
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("dbo.PR_UpdateProductData "
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

    public static void DeleteProduct() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de personas");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Product para buscar el combo a eliminar:");
        int C_Codigo_Producto = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery(" dbo.PR_DeleteProductData "
                    + "@C_Products= " + C_Codigo_Producto);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

//--------------------------------------------------Tabla de OrderDetail
    public static void InsertOrderDetail() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de OrderDetail");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Order:");
        int C_Order = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Order_Detail:");
        int C_Order_Detail = scanner.nextInt();

        System.out.println("Ingrese el valor de C_Products:");
        int C_Products = scanner.nextInt();

        System.out.println("Ingrese el valor de Q_Line_Detail:");
        int Q_Line_Detail = scanner.nextInt();

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

    public static void UpdateOrderDetail() throws SQLException {
        System.out.println("Bienvenido al area de actualización de OrderDetail");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Order para buscar el OrderDetail a actualizar:");
        int C_Order = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de C_Order_Detail:");
        int C_Order_Detail = scanner.nextInt();

        System.out.println("Ingrese el Nuevo valor de C_Products:");
        int C_Products = scanner.nextInt();

        System.out.println("Ingrese el Nuevo valor de Q_Line_Detail:");
        int Q_Line_Detail = scanner.nextInt();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_UpdateOrderDetail "
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

    public static void DeleteOrderDetail() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de OrderDetail");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Order para buscar el OrderDetail a eliminar:");
        int C_Order_Detail = scanner.nextInt();
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

    public static void SelectOrderDetail() throws SQLException {
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

    //----------------------------------------Tabla de Bill
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

    public static void InsertBill() throws SQLException {
        System.out.println("Bienvenido al area de ingreso de facturas");
        System.out.println("Por favor, seguir los siguientes pasos");

        System.out.println("Ingrese el valor de C_Bill:");
        int C_Bill = scanner.nextInt();
        System.out.println("Ingrese el valor de C_Employee:");
        int C_Employee = scanner.nextInt();
        System.out.println("Ingrese el valor de C_Order:");
        int C_Order = scanner.nextInt();
        System.out.println("Ingrese el valor de C_TaxCode:");
        int C_TaxCode = scanner.nextInt();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_InsertBill "
                    + "@C_Bill= " + C_Bill + " ,@C_Employee= " + C_Employee + " ,@OrderId= " + C_Order + " ,@C_TaxCode= " + C_TaxCode);

            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void UpdateBill() throws SQLException {
        System.out.println("Bienvenido al area de actualización de facturas");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Bill para buscar la factura a actualizar:");
        int C_Bill = scanner.nextInt();

        System.out.println("Ingrese el nuevo valor de C_Employee:");
        int C_Employee = scanner.nextInt();
        System.out.println("Ingrese el nuevo valor de C_Order:");
        int OrderId = scanner.nextInt();
        System.out.println("Ingrese el nuevo valor de C_TaxCode:");
        int C_TaxCode = scanner.nextInt();

        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("EXEC dbo.PR_UpdateBill "
                    + "@C_Bill= " + C_Bill + " ,@C_Employee= " + C_Employee + " ,@OrderId= "
                    + OrderId + " ,@C_TaxCode= " + C_TaxCode);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DeleteBill() throws SQLException {
        System.out.println("Bienvenido al area de eliminacion de facturas");
        System.out.println("Por favor, seguir los siguientes pasos");
        System.out.println("Ingrese el valor de C_Bill para buscar la factura a eliminar:");
        int C_Bill = scanner.nextInt();
        Statement stmt = getConnection().createStatement();
        try {
            ResultSet rs = stmt.executeQuery("dbo.PR_DeleteBillData "
                    + "@C_Bill= " + C_Bill);
            rs.close();
            stmt.close();
            getConnection().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
