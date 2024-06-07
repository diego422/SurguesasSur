package surguesassur;

import static MetodosPackage.Metodos.DeleteBill;
import static MetodosPackage.Metodos.DeleteBranch;
import static MetodosPackage.Metodos.DeleteCanton;
import static MetodosPackage.Metodos.DeleteCategory;
import static MetodosPackage.Metodos.DeleteClient;
import static MetodosPackage.Metodos.DeleteDirFisicClient;
import static MetodosPackage.Metodos.DeleteDistrict;
import static MetodosPackage.Metodos.DeleteOrder;
import static MetodosPackage.Metodos.DeletePersons;
import static MetodosPackage.Metodos.DeleteProvince;
import static MetodosPackage.Metodos.DeleteStateType;
import static MetodosPackage.Metodos.InsertCanton;
import static MetodosPackage.Metodos.InsertCategory;
import static MetodosPackage.Metodos.InsertClient;
import static MetodosPackage.Metodos.InsertCombo;
import static MetodosPackage.Metodos.InsertDirFisicClient;
import static MetodosPackage.Metodos.InsertDistrict;
import static MetodosPackage.Metodos.InsertOrder;
import static MetodosPackage.Metodos.InsertPersons;
import static MetodosPackage.Metodos.InsertProvince;
import static MetodosPackage.Metodos.InsertStateType;
import static MetodosPackage.Metodos.SelectCanton;
import static MetodosPackage.Metodos.SelectCategory;
import static MetodosPackage.Metodos.SelectClient;
import static MetodosPackage.Metodos.SelectDirFisicClient;
import static MetodosPackage.Metodos.SelectDistrict;
import static MetodosPackage.Metodos.SelectOrder;
import static MetodosPackage.Metodos.SelectPersons;
import static MetodosPackage.Metodos.SelectProvince;
import static MetodosPackage.Metodos.SelectStateType;
import static MetodosPackage.Metodos.UpdateCanton;
import static MetodosPackage.Metodos.UpdateCategory;
import static MetodosPackage.Metodos.UpdateClient;
import static MetodosPackage.Metodos.UpdateDirFisicClient;
import static MetodosPackage.Metodos.UpdateDistrict;
import static MetodosPackage.Metodos.UpdateOrder;
import static MetodosPackage.Metodos.UpdatePersons;
import static MetodosPackage.Metodos.UpdateProvince;
import static MetodosPackage.Metodos.UpdateStateType;
import static MetodosPackage.Metodos.SelectCombo;
import static MetodosPackage.Metodos.UpdateCombo;
import static MetodosPackage.Metodos.DeleteCombo;
import static MetodosPackage.Metodos.DeleteEmployee;
import static MetodosPackage.Metodos.DeleteJobtype;
import static MetodosPackage.Metodos.DeleteOrderDetail;
import static MetodosPackage.Metodos.DeleteProduct;
import static MetodosPackage.Metodos.DeleteTax;
import static MetodosPackage.Metodos.InsertBill;
import static MetodosPackage.Metodos.InsertBranch;
import static MetodosPackage.Metodos.InsertEmployee;
import static MetodosPackage.Metodos.InsertJobtype;
import static MetodosPackage.Metodos.InsertOrderDetail;
import static MetodosPackage.Metodos.InsertProduct;
import static MetodosPackage.Metodos.InsertTax;
import static MetodosPackage.Metodos.SelectBill;
import static MetodosPackage.Metodos.SelectBranch;
import static MetodosPackage.Metodos.SelectEmployee;
import static MetodosPackage.Metodos.SelectJobtype;
import static MetodosPackage.Metodos.SelectOrderDetail;
import static MetodosPackage.Metodos.SelectProduct;
import static MetodosPackage.Metodos.SelectTax;
import static MetodosPackage.Metodos.UpdateBill;
import static MetodosPackage.Metodos.UpdateBranch;
import static MetodosPackage.Metodos.UpdateEmployee;
import static MetodosPackage.Metodos.UpdateJobtype;
import static MetodosPackage.Metodos.UpdateOrderDetail;
import static MetodosPackage.Metodos.UpdateProduct;
import static MetodosPackage.Metodos.UpdateTax;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Dilan Chavarría
 * @author Tiffany Hernández
 * @author Diego Herrera
 * @author Jose Pablo Solís
 */
public class SurguesasSur {

    static Connection con;
    /**
     * @param args the command line arguments
     */

    static Scanner scanner = new Scanner(System.in);

    public static Connection getConnection() {
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=SurguesasSur;user=Lopez;"
                + "password=1127;loginTimeout=30;"
                + "trustServerCertificate=true";
        try {
            con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    public static void menu(int tableNumber) throws SQLException {
        boolean salir = false;
        int optio = 0;
        while (!salir) {
            int option;
            switch (tableNumber) {
                case 1:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Person
                        System.out.println("Opciones para la tabla Person:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");

                        option = scanner.nextInt();

                        switch (option) {
                            case 1:
                                InsertPersons();
                                break;
                            case 2:
                                SelectPersons();
                                break;
                            case 3:
                                UpdatePersons();
                                break;
                            case 4:
                                DeletePersons();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 2:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Client
                        System.out.println("Opciones para la tabla Client:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertClient();
                                break;
                            case 2:
                                SelectClient();
                                break;
                            case 3:
                                UpdateClient();
                                break;
                            case 4:
                                DeleteClient();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 3:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla Order:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertOrder();
                                break;
                            case 2:
                                SelectOrder();
                                break;
                            case 3:
                                UpdateOrder();
                                break;
                            case 4:
                                DeleteOrder();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 4:
                    while (optio != 5) {
                        System.out.println("Opciones para la tabla Province:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertProvince();
                                break;
                            case 2:
                                SelectProvince();
                                break;
                            case 3:
                                UpdateProvince();
                                break;
                            case 4:
                                DeleteProvince();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 5:
                    while (optio != 5) {
                        System.out.println("Opciones para la tabla Canton:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertCanton();
                                break;
                            case 2:
                                SelectCanton();
                                break;
                            case 3:
                                UpdateCanton();
                                break;
                            case 4:
                                DeleteCanton();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 6:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla District:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertDistrict();
                                break;
                            case 2:
                                SelectDistrict();
                                break;
                            case 3:
                                UpdateDistrict();
                                break;
                            case 4:
                                DeleteDistrict();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 7:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla DirFisicClient:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertDirFisicClient();
                                break;
                            case 2:
                                SelectDirFisicClient();
                                break;
                            case 3:
                                UpdateDirFisicClient();
                                break;
                            case 4:
                                DeleteDirFisicClient();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 8:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla Category:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertCategory();
                                break;
                            case 2:
                                SelectCategory();
                                break;
                            case 3:
                                UpdateCategory();
                                break;
                            case 4:
                                DeleteCategory();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 9:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla Combo:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertCombo();
                                break;
                            case 2:
                                SelectCombo();
                                break;
                            case 3:
                                UpdateCombo();
                                break;
                            case 4:
                                DeleteCombo();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 10:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla Products:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertProduct();
                                break;
                            case 2:
                                SelectProduct();
                                break;
                            case 3:
                                UpdateProduct();
                                break;
                            case 4:
                                DeleteProduct();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 11:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla OrderDetail:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertOrderDetail();
                                break;
                            case 2:
                                SelectOrderDetail();
                                break;
                            case 3:
                                UpdateOrderDetail();
                                break;
                            case 4:
                                DeleteOrderDetail();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 12:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla JobType:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertJobtype();
                                break;
                            case 2:
                                SelectJobtype();
                                break;
                            case 3:
                                UpdateJobtype();
                                break;
                            case 4:
                                DeleteJobtype();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 13:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla Employee:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertEmployee();
                                break;
                            case 2:
                                SelectEmployee();
                                break;
                            case 3:
                                UpdateEmployee();
                                break;
                            case 4:
                                DeleteEmployee();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 14:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla Tax:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertTax();
                                break;
                            case 2:
                                SelectTax();
                                break;
                            case 3:
                                UpdateTax();
                                break;
                            case 4:
                                DeleteTax();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 15:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla Branches:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertBranch();
                                break;
                            case 2:
                                SelectBranch();
                                break;
                            case 3:
                                UpdateBranch();
                                break;
                            case 4:
                                DeleteBranch();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 16:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla StateType:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertStateType();
                                break;
                            case 2:
                                SelectStateType();
                                break;
                            case 3:
                                UpdateStateType();
                                break;
                            case 4:
                                DeleteStateType();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 17:
                    while (optio != 5) {
                        // Mostrar opciones para la tabla Order
                        System.out.println("Opciones para la tabla Bill:");
                        System.out.println("1. Insertar");
                        System.out.println("2. Leer");
                        System.out.println("3. Actualizar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Salir");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                InsertBill();
                                break;
                            case 2:
                                SelectBill();
                                break;
                            case 3:
                                UpdateBill();
                                break;
                            case 4:
                                DeleteBill();
                                break;
                            case 5:
                                optio = 5;
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        System.out.println("Digite 1 para ingresar a la tabla de Person \n"
                + "Digite 2 para ingresar a la tabla de Client \n"
                + "Digite 3 para ingresar a la tabla de Order \n"
                + "Digite 4 para ingresar a la tabla de Province \n"
                + "Digite 5 para ingresar a la tabla de Canton \n"
                + "Digite 6 para ingresar a la tabla de District \n"
                + "Digite 7 para ingresar a la tabla de DirFisicClient \n"
                + "Digite 8 para ingresar a la tabla de Category \n"
                + "Digite 9 para ingresar a la tabla de Combo \n"
                + "Digite 10 para ingresar a la tabla de Products \n"
                + "Digite 11 para ingresar a la tabla de OrderDetail \n"
                + "Digite 12 para ingresar a la tabla de JobType \n"
                + "Digite 13 para ingresar a la tabla de Employee \n"
                + "Digite 14 para ingresar a la tabla de Tax \n"
                + "Digite 15 para ingresar a la tabla de Branches \n"
                + "Digite 16 para ingresar a la tabla de StateType \n"
                + "Digite 17 para ingresar a la tabla de Bill");
        int tableNumber = scanner.nextInt();
        menu(tableNumber);
    }

}
