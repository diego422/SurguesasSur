/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class Client {
    private int C_Client;
    private String D_Mail;
    private int N_Phone_Number;
    private int C_Physical_Address;

    public Client() {
    }

    public Client(int C_Client, String D_Mail, int N_Phone_Number, int C_Physical_Address) {
        this.C_Client = C_Client;
        this.D_Mail = D_Mail;
        this.N_Phone_Number = N_Phone_Number;
        this.C_Physical_Address = C_Physical_Address;
    }

    /**
     * @return the C_Client
     */
    public int getC_Client() {
        return C_Client;
    }

    /**
     * @param C_Client the C_Client to set
     */
    public void setC_Client(int C_Client) {
        this.C_Client = C_Client;
    }

    /**
     * @return the D_Mail
     */
    public String getD_Mail() {
        return D_Mail;
    }

    /**
     * @param D_Mail the D_Mail to set
     */
    public void setD_Mail(String D_Mail) {
        this.D_Mail = D_Mail;
    }

    /**
     * @return the N_Phone_Number
     */
    public int getN_Phone_Number() {
        return N_Phone_Number;
    }

    /**
     * @param N_Phone_Number the N_Phone_Number to set
     */
    public void setN_Phone_Number(int N_Phone_Number) {
        this.N_Phone_Number = N_Phone_Number;
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

    @Override
    public String toString() {
        return "Client{" + "C_Client=" + C_Client + ", D_Mail=" + D_Mail + ", N_Phone_Number=" + N_Phone_Number + ", C_Physical_Address=" + C_Physical_Address + '}';
    }
    
    
    
}
