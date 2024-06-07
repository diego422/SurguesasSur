/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class Branches {
    private int C_Branch;
    private String D_Branch_Addres;

    public Branches() {
    }

    public Branches(int C_Branch, String D_Branch_Addres) {
        this.C_Branch = C_Branch;
        this.D_Branch_Addres = D_Branch_Addres;
    }

    /**
     * @return the C_Branch
     */
    public int getC_Branch() {
        return C_Branch;
    }

    /**
     * @param C_Branch the C_Branch to set
     */
    public void setC_Branch(int C_Branch) {
        this.C_Branch = C_Branch;
    }

    /**
     * @return the D_Branch_Addres
     */
    public String getD_Branch_Addres() {
        return D_Branch_Addres;
    }

    /**
     * @param D_Branch_Addres the D_Branch_Addres to set
     */
    public void setD_Branch_Addres(String D_Branch_Addres) {
        this.D_Branch_Addres = D_Branch_Addres;
    }

    @Override
    public String toString() {
        return "Branches{" + "C_Branch=" + C_Branch + ", D_Branch_Addres=" + D_Branch_Addres + '}';
    }
    
    
}
