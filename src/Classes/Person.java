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
public class Person {
    
    private int C_Codigo_Person;
    private int C_Cedula;
    private int C_Codelec;
    private String D_Relleno;
    private Date F_FechaCaducidad;
    private String D_Junta;
    private String D_Nombre;
    private String D_Primer_Apellido;
    private String D_Segundo_Apellido;
    private Date Fecha_Insercion;

    public Person() {
    }

    public Person(int C_Codigo_Person, int C_Cedula, int C_Codelec, String D_Relleno, Date F_FechaCaducidad, String D_Junta, String D_Nombre, String D_Primer_Apellido, String D_Segundo_Apellido, Date Fecha_Insercion) {
        this.C_Codigo_Person = C_Codigo_Person;
        this.C_Cedula = C_Cedula;
        this.C_Codelec = C_Codelec;
        this.D_Relleno = D_Relleno;
        this.F_FechaCaducidad = F_FechaCaducidad;
        this.D_Junta = D_Junta;
        this.D_Nombre = D_Nombre;
        this.D_Primer_Apellido = D_Primer_Apellido;
        this.D_Segundo_Apellido = D_Segundo_Apellido;
        this.Fecha_Insercion = Fecha_Insercion;
    }

    /**
     * @return the C_Codigo_Person
     */
    public int getC_Codigo_Person() {
        return C_Codigo_Person;
    }

    /**
     * @param C_Codigo_Person the C_Codigo_Person to set
     */
    public void setC_Codigo_Person(int C_Codigo_Person) {
        this.C_Codigo_Person = C_Codigo_Person;
    }

    /**
     * @return the C_Cedula
     */
    public int getC_Cedula() {
        return C_Cedula;
    }

    /**
     * @param C_Cedula the C_Cedula to set
     */
    public void setC_Cedula(int C_Cedula) {
        this.C_Cedula = C_Cedula;
    }

    /**
     * @return the C_Codelec
     */
    public int getC_Codelec() {
        return C_Codelec;
    }

    /**
     * @param C_Codelec the C_Codelec to set
     */
    public void setC_Codelec(int C_Codelec) {
        this.C_Codelec = C_Codelec;
    }

    /**
     * @return the D_Relleno
     */
    public String getD_Relleno() {
        return D_Relleno;
    }

    /**
     * @param D_Relleno the D_Relleno to set
     */
    public void setD_Relleno(String D_Relleno) {
        this.D_Relleno = D_Relleno;
    }

    /**
     * @return the F_FechaCaducidad
     */
    public Date getF_FechaCaducidad() {
        return F_FechaCaducidad;
    }

    /**
     * @param F_FechaCaducidad the F_FechaCaducidad to set
     */
    public void setF_FechaCaducidad(Date F_FechaCaducidad) {
        this.F_FechaCaducidad = F_FechaCaducidad;
    }

    /**
     * @return the D_Junta
     */
    public String getD_Junta() {
        return D_Junta;
    }

    /**
     * @param D_Junta the D_Junta to set
     */
    public void setD_Junta(String D_Junta) {
        this.D_Junta = D_Junta;
    }

    /**
     * @return the D_Nombre
     */
    public String getD_Nombre() {
        return D_Nombre;
    }

    /**
     * @param D_Nombre the D_Nombre to set
     */
    public void setD_Nombre(String D_Nombre) {
        this.D_Nombre = D_Nombre;
    }

    /**
     * @return the D_Primer_Apellido
     */
    public String getD_Primer_Apellido() {
        return D_Primer_Apellido;
    }

    /**
     * @param D_Primer_Apellido the D_Primer_Apellido to set
     */
    public void setD_Primer_Apellido(String D_Primer_Apellido) {
        this.D_Primer_Apellido = D_Primer_Apellido;
    }

    /**
     * @return the D_Segundo_Apellido
     */
    public String getD_Segundo_Apellido() {
        return D_Segundo_Apellido;
    }

    /**
     * @param D_Segundo_Apellido the D_Segundo_Apellido to set
     */
    public void setD_Segundo_Apellido(String D_Segundo_Apellido) {
        this.D_Segundo_Apellido = D_Segundo_Apellido;
    }

    /**
     * @return the Fecha_Insercion
     */
    public Date getFecha_Insercion() {
        return Fecha_Insercion;
    }

    /**
     * @param Fecha_Insercion the Fecha_Insercion to set
     */
    public void setFecha_Insercion(Date Fecha_Insercion) {
        this.Fecha_Insercion = Fecha_Insercion;
    }

    @Override
    public String toString() {
        return "Person{" + "C_Codigo_Person=" + C_Codigo_Person + ", C_Cedula=" + C_Cedula + ", C_Codelec=" + C_Codelec + ", D_Relleno=" + D_Relleno + ", F_FechaCaducidad=" + F_FechaCaducidad + ", D_Junta=" + D_Junta + ", D_Nombre=" + D_Nombre + ", D_Primer_Apellido=" + D_Primer_Apellido + ", D_Segundo_Apellido=" + D_Segundo_Apellido + ", Fecha_Insercion=" + Fecha_Insercion + '}';
    }
              
}
