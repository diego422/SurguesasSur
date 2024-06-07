/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class Order {
    private int C_Order;
    private int N_Order_Number;
    private int C_Client;
    private int C_State_Type;

    public Order() {
    }

    public Order(int C_Order, int N_Order_Number, int C_Client, int C_State_Type) {
        this.C_Order = C_Order;
        this.N_Order_Number = N_Order_Number;
        this.C_Client = C_Client;
        this.C_State_Type = C_State_Type;
    }

    /**
     * @return the C_Order
     */
    public int getC_Order() {
        return C_Order;
    }

    /**
     * @param C_Order the C_Order to set
     */
    public void setC_Order(int C_Order) {
        this.C_Order = C_Order;
    }

    /**
     * @return the N_Order_Number
     */
    public int getN_Order_Number() {
        return N_Order_Number;
    }

    /**
     * @param N_Order_Number the N_Order_Number to set
     */
    public void setN_Order_Number(int N_Order_Number) {
        this.N_Order_Number = N_Order_Number;
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
     * @return the C_State_Type
     */
    public int getC_State_Type() {
        return C_State_Type;
    }

    /**
     * @param C_State_Type the C_State_Type to set
     */
    public void setC_State_Type(int C_State_Type) {
        this.C_State_Type = C_State_Type;
    }

    @Override
    public String toString() {
        return "Order{" + "C_Order=" + C_Order + ", N_Order_Number=" + N_Order_Number + ", C_Client=" + C_Client + ", C_State_Type=" + C_State_Type + '}';
    }
    
    
}
