/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class Categories {
    private int C_Category;
    private String D_Category_Name;

    public Categories() {
    }

    public Categories(int C_Category, String D_Category_Name) {
        this.C_Category = C_Category;
        this.D_Category_Name = D_Category_Name;
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
     * @return the D_Category_Name
     */
    public String getD_Category_Name() {
        return D_Category_Name;
    }

    /**
     * @param D_Category_Name the D_Category_Name to set
     */
    public void setD_Category_Name(String D_Category_Name) {
        this.D_Category_Name = D_Category_Name;
    }

    @Override
    public String toString() {
        return "Categories{" + "C_Category=" + C_Category + ", D_Category_Name=" + D_Category_Name + '}';
    }
    
    
}
