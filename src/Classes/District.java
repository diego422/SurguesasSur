/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class District {
    private int C_District;
    private int C_Canton;
    private String D_NomDistrict;

    public District() {
    }

    public District(int C_District, int C_Canton, String D_NomDistrict) {
        this.C_District = C_District;
        this.C_Canton = C_Canton;
        this.D_NomDistrict = D_NomDistrict;
    }

    /**
     * @return the C_District
     */
    public int getC_District() {
        return C_District;
    }

    /**
     * @param C_District the C_District to set
     */
    public void setC_District(int C_District) {
        this.C_District = C_District;
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
     * @return the D_NomDistrict
     */
    public String getD_NomDistrict() {
        return D_NomDistrict;
    }

    /**
     * @param D_NomDistrict the D_NomDistrict to set
     */
    public void setD_NomDistrict(String D_NomDistrict) {
        this.D_NomDistrict = D_NomDistrict;
    }

    @Override
    public String toString() {
        return "District{" + "C_District=" + C_District + ", C_Canton=" + C_Canton + ", D_NomDistrict=" + D_NomDistrict + '}';
    }
    
    
}
