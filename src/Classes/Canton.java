/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class Canton {
    private int C_Canton;
    private int C_Province;
    private String D_NomCanton;

    public Canton() {
    }

    public Canton(int C_Canton, int C_Province, String D_NomCanton) {
        this.C_Canton = C_Canton;
        this.C_Province = C_Province;
        this.D_NomCanton = D_NomCanton;
    }

    /**
     * @return the C_Canton
     */
    public int getC_Canton() {
        return C_Canton;
    }

    /**
     * @param C_Canton the C_Canton to set
     */
    public void setC_Canton(int C_Canton) {
        this.C_Canton = C_Canton;
    }

    /**
     * @return the C_Province
     */
    public int getC_Province() {
        return C_Province;
    }

    /**
     * @param C_Province the C_Province to set
     */
    public void setC_Province(int C_Province) {
        this.C_Province = C_Province;
    }

    /**
     * @return the D_NomCanton
     */
    public String getD_NomCanton() {
        return D_NomCanton;
    }

    /**
     * @param D_NomCanton the D_NomCanton to set
     */
    public void setD_NomCanton(String D_NomCanton) {
        this.D_NomCanton = D_NomCanton;
    }

    @Override
    public String toString() {
        return "Canton{" + "C_Canton=" + C_Canton + ", C_Province=" + C_Province + ", D_NomCanton=" + D_NomCanton + '}';
    }
    
    
    
}
