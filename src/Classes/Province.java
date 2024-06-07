/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class Province {
    private int C_Province;
    private String D_NomProvince;

    public Province() {
    }

    public Province(int C_Province, String D_NomProvince) {
        this.C_Province = C_Province;
        this.D_NomProvince = D_NomProvince;
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
     * @return the D_NomProvince
     */
    public String getD_NomProvince() {
        return D_NomProvince;
    }

    /**
     * @param D_NomProvince the D_NomProvince to set
     */
    public void setD_NomProvince(String D_NomProvince) {
        this.D_NomProvince = D_NomProvince;
    }

    @Override
    public String toString() {
        return "Province{" + "C_Province=" + C_Province + ", D_NomProvince=" + D_NomProvince + '}';
    }
    
    
}
