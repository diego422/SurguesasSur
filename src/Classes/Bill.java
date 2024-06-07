/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author dilan
 */
public class Bill {
    private int C_Bill;
    private int C_Employee;
    private int C_Order;
    private int C_TaxCode;
    private Date F_Bill_Date;
    private double M_Total_Price;
    private double M_Tax_Total_Price;

    public Bill() {
    }

    public Bill(int C_Bill, int C_Employee, int C_Order, int C_TaxCode, Date F_Bill_Date, double M_Total_Price, double M_Tax_Total_Price) {
        this.C_Bill = C_Bill;
        this.C_Employee = C_Employee;
        this.C_Order = C_Order;
        this.C_TaxCode = C_TaxCode;
        this.F_Bill_Date = F_Bill_Date;
        this.M_Total_Price = M_Total_Price;
        this.M_Tax_Total_Price = M_Tax_Total_Price;
    }

    /**
     * @return the C_Bill
     */
    public int getC_Bill() {
        return C_Bill;
    }

    /**
     * @param C_Bill the C_Bill to set
     */
    public void setC_Bill(int C_Bill) {
        this.C_Bill = C_Bill;
    }

    /**
     * @return the C_Employee
     */
    public int getC_Employee() {
        return C_Employee;
    }

    /**
     * @param C_Employee the C_Employee to set
     */
    public void setC_Employee(int C_Employee) {
        this.C_Employee = C_Employee;
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
     * @return the C_TaxCode
     */
    public int getC_TaxCode() {
        return C_TaxCode;
    }

    /**
     * @param C_TaxCode the C_TaxCode to set
     */
    public void setC_TaxCode(int C_TaxCode) {
        this.C_TaxCode = C_TaxCode;
    }

    /**
     * @return the F_Bill_Date
     */
    public Date getF_Bill_Date() {
        return F_Bill_Date;
    }

    /**
     * @param F_Bill_Date the F_Bill_Date to set
     */
    public void setF_Bill_Date(Date F_Bill_Date) {
        this.F_Bill_Date = F_Bill_Date;
    }

    /**
     * @return the M_Total_Price
     */
    public double getM_Total_Price() {
        return M_Total_Price;
    }

    /**
     * @param M_Total_Price the M_Total_Price to set
     */
    public void setM_Total_Price(double M_Total_Price) {
        this.M_Total_Price = M_Total_Price;
    }

    /**
     * @return the M_Tax_Total_Price
     */
    public double getM_Tax_Total_Price() {
        return M_Tax_Total_Price;
    }

    /**
     * @param M_Tax_Total_Price the M_Tax_Total_Price to set
     */
    public void setM_Tax_Total_Price(double M_Tax_Total_Price) {
        this.M_Tax_Total_Price = M_Tax_Total_Price;
    }

    @Override
    public String toString() {
        return "Bill{" + "C_Bill=" + C_Bill + ", C_Employee=" + C_Employee + ", C_Order=" + C_Order + ", C_TaxCode=" + C_TaxCode + ", F_Bill_Date=" + F_Bill_Date + ", M_Total_Price=" + M_Total_Price + ", M_Tax_Total_Price=" + M_Tax_Total_Price + '}';
    }
    
    
}
