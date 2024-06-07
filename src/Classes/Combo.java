/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class Combo {
    private int C_Combo;
    private String D_Combo_Name;

    public Combo() {
    }

    public Combo(int C_Combo, String D_Combo_Name) {
        this.C_Combo = C_Combo;
        this.D_Combo_Name = D_Combo_Name;
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
     * @return the D_Combo_Name
     */
    public String getD_Combo_Name() {
        return D_Combo_Name;
    }

    /**
     * @param D_Combo_Name the D_Combo_Name to set
     */
    public void setD_Combo_Name(String D_Combo_Name) {
        this.D_Combo_Name = D_Combo_Name;
    }

    @Override
    public String toString() {
        return "Combo{" + "C_Combo=" + C_Combo + ", D_Combo_Name=" + D_Combo_Name + '}';
    }
    
    
}
