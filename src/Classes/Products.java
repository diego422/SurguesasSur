/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class Products {
    private int C_Products;
    private int C_Combo;
    private int C_Category;
    private String D_Name;
    private String D_Description;
    private int N_Quantity;
    private int Q_consumptionUnit;
    private double M_Price;

    public Products() {
    }

    public Products(int C_Products, int C_Combo, int C_Category, String D_Name, String D_Description, int N_Quantity, int Q_consumptionUnit, double M_Price) {
        this.C_Products = C_Products;
        this.C_Combo = C_Combo;
        this.C_Category = C_Category;
        this.D_Name = D_Name;
        this.D_Description = D_Description;
        this.N_Quantity = N_Quantity;
        this.Q_consumptionUnit = Q_consumptionUnit;
        this.M_Price = M_Price;
    }

    /**
     * @return the C_Products
     */
    public int getC_Products() {
        return C_Products;
    }

    /**
     * @param C_Products the C_Products to set
     */
    public void setC_Products(int C_Products) {
        this.C_Products = C_Products;
    }

    /**
     * @return the C_Combo
     */
    public int getC_Combo() {
        return C_Combo;
    }

    /**
     * @param C_Combo the C_Combo to set
     */
    public void setC_Combo(int C_Combo) {
        this.C_Combo = C_Combo;
    }

    /**
     * @return the C_Category
     */
    public int getC_Category() {
        return C_Category;
    }

    /**
     * @param C_Category the C_Category to set
     */
    public void setC_Category(int C_Category) {
        this.C_Category = C_Category;
    }

    /**
     * @return the D_Name
     */
    public String getD_Name() {
        return D_Name;
    }

    /**
     * @param D_Name the D_Name to set
     */
    public void setD_Name(String D_Name) {
        this.D_Name = D_Name;
    }

    /**
     * @return the D_Description
     */
    public String getD_Description() {
        return D_Description;
    }

    /**
     * @param D_Description the D_Description to set
     */
    public void setD_Description(String D_Description) {
        this.D_Description = D_Description;
    }

    /**
     * @return the N_Quantity
     */
    public int getN_Quantity() {
        return N_Quantity;
    }

    /**
     * @param N_Quantity the N_Quantity to set
     */
    public void setN_Quantity(int N_Quantity) {
        this.N_Quantity = N_Quantity;
    }

    /**
     * @return the Q_consumptionUnit
     */
    public int getQ_consumptionUnit() {
        return Q_consumptionUnit;
    }

    /**
     * @param Q_consumptionUnit the Q_consumptionUnit to set
     */
    public void setQ_consumptionUnit(int Q_consumptionUnit) {
        this.Q_consumptionUnit = Q_consumptionUnit;
    }

    /**
     * @return the M_Price
     */
    public double getM_Price() {
        return M_Price;
    }

    /**
     * @param M_Price the M_Price to set
     */
    public void setM_Price(double M_Price) {
        this.M_Price = M_Price;
    }

    @Override
    public String toString() {
        return "Products{" + "C_Products=" + C_Products + ", C_Combo=" + C_Combo + ", C_Category=" + C_Category + ", D_Name=" + D_Name + ", D_Description=" + D_Description + ", N_Quantity=" + N_Quantity + ", Q_consumptionUnit=" + Q_consumptionUnit + ", M_Price=" + M_Price + '}';
    }
    
    
}
