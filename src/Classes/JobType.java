/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class JobType {
    private int C_Jobtype;
    private String D_Job_Description;

    public JobType() {
    }

    public JobType(int C_Jobtype, String D_Job_Description) {
        this.C_Jobtype = C_Jobtype;
        this.D_Job_Description = D_Job_Description;
    }

    /**
     * @return the C_Jobtype
     */
    public int getC_Jobtype() {
        return C_Jobtype;
    }

    /**
     * @param C_Jobtype the C_Jobtype to set
     */
    public void setC_Jobtype(int C_Jobtype) {
        this.C_Jobtype = C_Jobtype;
    }

    /**
     * @return the D_Job_Description
     */
    public String getD_Job_Description() {
        return D_Job_Description;
    }

    /**
     * @param D_Job_Description the D_Job_Description to set
     */
    public void setD_Job_Description(String D_Job_Description) {
        this.D_Job_Description = D_Job_Description;
    }

    @Override
    public String toString() {
        return "JobType{" + "C_Jobtype=" + C_Jobtype + ", D_Job_Description=" + D_Job_Description + '}';
    }
    
    
}
