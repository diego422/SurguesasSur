/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class DirFisicClient {
    private int C_Physical_Address;
    private String D_Address;
    private int C_District;

    public DirFisicClient() {
    }

    public DirFisicClient(int C_Physical_Address, String D_Address, int C_District) {
        this.C_Physical_Address = C_Physical_Address;
        this.D_Address = D_Address;
        this.C_District = C_District;
    }

    /**
     * @return the C_Physical_Address
     */
    public int getC_Physical_Address() {
        return C_Physical_Address;
    }

    /**
     * @param C_Physical_Address the C_Physical_Address to set
     */
    public void setC_Physical_Address(int C_Physical_Address) {
        this.C_Physical_Address = C_Physical_Address;
    }

    /**
     * @return the D_Address
     */
    public String getD_Address() {
        return D_Address;
    }

    /**
     * @param D_Address the D_Address to set
     */
    public void setD_Address(String D_Address) {
        this.D_Address = D_Address;
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

    @Override
    public String toString() {
        return "DirFisicClient{" + "C_Physical_Address=" + C_Physical_Address + ", D_Address=" + D_Address + ", C_District=" + C_District + '}';
    }
    
    
}
