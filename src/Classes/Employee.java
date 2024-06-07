/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class Employee {
    private int C_Employee;
    private int C_Branch;
    private int C_JobType;
    private String D_Employee_Name;
    private int N_Employee_Number;
    private int ReportsTo;

    public Employee() {
    }

    public Employee(int C_Employee, int C_Branch, int C_JobType, String D_Employee_Name, int N_Employee_Number, int ReportsTo) {
        this.C_Employee = C_Employee;
        this.C_Branch = C_Branch;
        this.C_JobType = C_JobType;
        this.D_Employee_Name = D_Employee_Name;
        this.N_Employee_Number = N_Employee_Number;
        this.ReportsTo = ReportsTo;
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
     * @return the C_Branch
     */
    public int getC_Branch() {
        return C_Branch;
    }

    /**
     * @param C_Branch the C_Branch to set
     */
    public void setC_Branch(int C_Branch) {
        this.C_Branch = C_Branch;
    }

    /**
     * @return the C_JobType
     */
    public int getC_JobType() {
        return C_JobType;
    }

    /**
     * @param C_JobType the C_JobType to set
     */
    public void setC_JobType(int C_JobType) {
        this.C_JobType = C_JobType;
    }

    /**
     * @return the D_Employee_Name
     */
    public String getD_Employee_Name() {
        return D_Employee_Name;
    }

    /**
     * @param D_Employee_Name the D_Employee_Name to set
     */
    public void setD_Employee_Name(String D_Employee_Name) {
        this.D_Employee_Name = D_Employee_Name;
    }

    /**
     * @return the N_Employee_Number
     */
    public int getN_Employee_Number() {
        return N_Employee_Number;
    }

    /**
     * @param N_Employee_Number the N_Employee_Number to set
     */
    public void setN_Employee_Number(int N_Employee_Number) {
        this.N_Employee_Number = N_Employee_Number;
    }

    /**
     * @return the ReportsTo
     */
    public int getReportsTo() {
        return ReportsTo;
    }

    /**
     * @param ReportsTo the ReportsTo to set
     */
    public void setReportsTo(int ReportsTo) {
        this.ReportsTo = ReportsTo;
    }

    @Override
    public String toString() {
        return "Employee{" + "C_Employee=" + C_Employee + ", C_Branch=" + C_Branch + ", C_JobType=" + C_JobType + ", D_Employee_Name=" + D_Employee_Name + ", N_Employee_Number=" + N_Employee_Number + ", ReportsTo=" + ReportsTo + '}';
    }
    
    
}
