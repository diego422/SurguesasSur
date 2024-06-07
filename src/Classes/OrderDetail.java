/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dilan
 */
public class OrderDetail {
    private int C_Order;
    private int C_OrderDetail;
    private int C_Products;
    private int Q_Line_Detail_Quantity;

    public OrderDetail() {
    }

    public OrderDetail(int C_Order, int C_OrderDetail, int C_Products, int Q_Line_Detail_Quantity) {
        this.C_Order = C_Order;
        this.C_OrderDetail = C_OrderDetail;
        this.C_Products = C_Products;
        this.Q_Line_Detail_Quantity = Q_Line_Detail_Quantity;
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
     * @return the C_OrderDetail
     */
    public int getC_OrderDetail() {
        return C_OrderDetail;
    }

    /**
     * @param C_OrderDetail the C_OrderDetail to set
     */
    public void setC_OrderDetail(int C_OrderDetail) {
        this.C_OrderDetail = C_OrderDetail;
    }

    /**
     * @return the C_Products
     */
    public int getC_Products() {
        return C_Products;
    }

    /**
     * @param C_Products the C_Products to set
     */
    public void setC_Products(int C_Products) {
        this.C_Products = C_Products;
    }

    /**
     * @return the Q_Line_Detail_Quantity
     */
    public int getQ_Line_Detail_Quantity() {
        return Q_Line_Detail_Quantity;
    }

    /**
     * @param Q_Line_Detail_Quantity the Q_Line_Detail_Quantity to set
     */
    public void setQ_Line_Detail_Quantity(int Q_Line_Detail_Quantity) {
        this.Q_Line_Detail_Quantity = Q_Line_Detail_Quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "C_Order=" + C_Order + ", C_OrderDetail=" + C_OrderDetail + ", C_Products=" + C_Products + ", Q_Line_Detail_Quantity=" + Q_Line_Detail_Quantity + '}';
    }
    
    
}
