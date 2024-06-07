/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class Tax {
    private int C_Tax_Code;
    private String D_Tax_Code;
    private double P_Tax_Code;

    public Tax() {
    }

    public Tax(int C_Tax_Code, String D_Tax_Code, double P_Tax_Code) {
        this.C_Tax_Code = C_Tax_Code;
        this.D_Tax_Code = D_Tax_Code;
        this.P_Tax_Code = P_Tax_Code;
    }

    /**
     * @return the C_Tax_Code
     */
    public int getC_Tax_Code() {
        return C_Tax_Code;
    }

    /**
     * @param C_Tax_Code the C_Tax_Code to set
     */
    public void setC_Tax_Code(int C_Tax_Code) {
        this.C_Tax_Code = C_Tax_Code;
    }

    /**
     * @return the D_Tax_Code
     */
    public String getD_Tax_Code() {
        return D_Tax_Code;
    }

    /**
     * @param D_Tax_Code the D_Tax_Code to set
     */
    public void setD_Tax_Code(String D_Tax_Code) {
        this.D_Tax_Code = D_Tax_Code;
    }

    /**
     * @return the P_Tax_Code
     */
    public double getP_Tax_Code() {
        return P_Tax_Code;
    }

    /**
     * @param P_Tax_Code the P_Tax_Code to set
     */
    public void setP_Tax_Code(double P_Tax_Code) {
        this.P_Tax_Code = P_Tax_Code;
    }

    @Override
    public String toString() {
        return "Tax{" + "C_Tax_Code=" + C_Tax_Code + ", D_Tax_Code=" + D_Tax_Code + ", P_Tax_Code=" + P_Tax_Code + '}';
    }
    
    
}
