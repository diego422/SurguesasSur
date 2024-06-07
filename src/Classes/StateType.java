/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class StateType {
    private int C_State_Type;
    private String D_State_Type;

    public StateType() {
    }

    public StateType(int C_State_Type, String D_State_Type) {
        this.C_State_Type = C_State_Type;
        this.D_State_Type = D_State_Type;
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

    /**
     * @return the D_State_Type
     */
    public String getD_State_Type() {
        return D_State_Type;
    }

    /**
     * @param D_State_Type the D_State_Type to set
     */
    public void setD_State_Type(String D_State_Type) {
        this.D_State_Type = D_State_Type;
    }

    @Override
    public String toString() {
        return "StateType{" + "C_State_Type=" + C_State_Type + ", D_State_Type=" + D_State_Type + '}';
    }
    
    
}
